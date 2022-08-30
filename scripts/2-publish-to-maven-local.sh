# shellcheck disable=SC2162
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

pathToMavenLocal=/Users/"$USER"/.m2/repository/com/tink
if [ -e "$pathToMavenLocal" ] ; then
  rm -r "$pathToMavenLocal"
fi

echo "-------> clean & assemble"
./gradlew clean
./gradlew assemble
echo "-------> publishing to Maven local"
./gradlew publishToMavenLocal

printf "\n\n"
echo "-------> DONE: Publishing to Maven local completed!"
echo "-------> NEXT: Check if every file has a signed file with the same filename, \
including extension, and an additional .asc file extension"

read -p "-------> Press enter to review the files..."
ls -R /Users/"$USER"/.m2/repository/com/tink
#open /Users/"$USER"/.m2/repository/com/tink

read -p "-------> Press enter to launch the script #3 to publish to Maven Central"
./scripts/3_publish_to_maven_central.sh "$newVersion" "$oldVersion" "$jiraTicketNumber" "$isDryRun"