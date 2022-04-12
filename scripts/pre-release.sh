cd ..

# shellcheck disable=SC2162
read newVersion

if [[ $newVersion =~ ^([0-9]{1,2}\.){2}[0-9]{1,10}$ ]]; then
echo "Starting to build version: $newVersion"
else
  echo "$newVersion is not in the right format."
  exit
fi

rm -r /Users/"$USER"/.m2/repository/com/tink/core/"$newVersion"

./gradlew ktlintFormat
./gradlew clean
./gradlew assemble
./gradlew publishToMavenLocal

echo Maven Local Files
echo Check if every file has a signed file with the same filename, \
including extension, and an additional .asc file extension
ls -R /Users/"$USER"/.m2/repository/com/tink/link/"$newVersion"
ls -R /Users/"$USER"/.m2/repository/com/tink/link-ui/"$newVersion"