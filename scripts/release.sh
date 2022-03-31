cd ..
# shellcheck disable=SC2162
read newVersion


if [[ $newVersion =~ ^([0-9]{1,2}\.){2}[0-9]{1,10}$ ]]; then
echo "Publishing to maven central"
else
  echo "$newVersion is not in the right format."
  exit
fi

echo "Publishing to maven central"
./gradlew publish
open https://repo1.maven.org/maven2/com/tink/link
open https://oss.sonatype.org

echo "Polling for release to be complete"
until curl -s -f -o /dev/null "https://repo1.maven.org/maven2/com/tink/link/$newVersion/"
do
  echo "Sleep"
  sleep 5
done

echo "\007"
echo "DONE"