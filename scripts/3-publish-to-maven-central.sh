set -e

newVersion=$1
oldVersion=$2
jiraTicketNumber=$3
isDryRun=$4

if [[ $isDryRun = 'y' ]]
then
  masterBranch=master-dry-run
else
  masterBranch=master
fi

echo "-------> Checking out master"
git checkout $masterBranch
git fetch
git pull

echo "-------> Publishing to maven central"
./gradlew publish
printf "\n\n"
echo "-------> NEXT: Continue the release on Sonatype web page"
echo "-------> Press enter to open the browser... "
read -r
open https://repo1.maven.org/maven2/com/tink/link
open https://oss.sonatype.org

echo "-------> Polling for release to be complete"
until curl -s -f -o /dev/null "https://repo1.maven.org/maven2/com/tink/link/$newVersion/"
do
  echo "-------> Polling: publishing on Maven central not yet completed, please wait... "
  sleep 5
done

echo "\007"
clear
echo "-------> DONE: Publishing to Maven Central!"
read -p "-------> Press enter to launch the script #4 to create a Github release on the public repo"
./scripts/4-github-release.sh "$newVersion" "$oldVersion" "$jiraTicketNumber" "$isDryRun"