set -e

echo "--------> Pre release check"
echo "--------> 1) Check that mavenLocal() is not used in the main build.gradle file"
echo "--------> 2) Check that you are pointing to the correct Tink Core sdk in Dependencies.kt"
echo "--------> If everything looks good, press any key to run ktlintFormat"
read -r
echo "--------> 3) Running ktlintFormat"
git checkout development
git fetch
git pull
./gradlew ktlintFormat

if [[ $(git status --porcelain) ]]; then
  echo "--------> There are changes to commit/discard before you can continue with the release"
  exit
else
 echo "--------> No changes to commit/discard, continuing with the release"
fi

echo "--------> Enter NEW version (x.y.z format):"
# shellcheck disable=SC2162
read newVersion
if [[ $newVersion =~ ^([0-9]{1,2}\.){2}[0-9]{1,10}$ ]]; then
   echo ""
else
  echo "--------> $newVersion is not in the right format."
  exit
fi

echo "--------> Enter PREVIOUS version (x.y.z format):"
# shellcheck disable=SC2162
read oldVersion
if [[ $oldVersion =~ ^([0-9]{1,2}\.){2}[0-9]{1,10}$ ]]; then
  echo ""
else
  echo "--------> $oldVersion is not in the right format."
  exit
fi

echo "--------> Enter Jira ticket number (xxxx format - skip PFMF):"
# shellcheck disable=SC2162
read jiraTicketNumber
if [[ $jiraTicketNumber =~ ^[0-9]{4}$ ]]; then
  echo ""
else
  echo "--------> jiraTicketNumber is not in the right format."
  exit
fi

echo "--------> Dry-run? (y/n):"
# shellcheck disable=SC2162
read isDryRun

printf "\n\n"
echo "--------> new version number: $newVersion"
echo "--------> previous version number: $oldVersion"
echo "--------> Jira ticket number: $jiraTicketNumber"
echo "--------> Dry-run: $isDryRun"
read -p "--------> Press enter to start the release process"

# Init branches
versionBumpBranch=version-bump-"$newVersion"
if [[ $isDryRun = 'y' ]]
then
  masterBranch=master-dry-run
  git checkout master
  git pull
  git checkout -b "$masterBranch"
  git push --set-upstream origin "$masterBranch"
  devBranch=dev-dry-run
  git checkout development
  git checkout -b "$devBranch"
  git push --set-upstream origin "$devBranch"
else
  masterBranch=master
  devBranch=development
fi

echo "--------> Creating branch $versionBumpBranch"
git checkout -b "$versionBumpBranch"

#echo "--------> Running Dokka"
./gradlew dokkaJekyll
git add docs/
echo "--------> Creating dokka commit"
git commit -m "Update Dokka documentation"

echo "--------> Updating TinkLinkVersion.kt file"
major=$(echo "$newVersion" | cut -d. -f1)
minor=$(echo "$newVersion" | cut -d. -f2)
patch=$(echo "$newVersion" | cut -d. -f3)

versionFilePath="./buildSrc/src/main/java/TinkLinkVersion.kt"
rm $versionFilePath

echo "object TinkLinkVersion {

    private const val major = $major
    private const val minor = $minor
    private const val patch = $patch

    const val name = \"\$major.\$minor.\$patch\"

    private const val minorOffset = 100 //make space for 100 patches per minor version
    private const val majorOffset = 100 * minorOffset //make space for 100 minor versions per major version

    //Will generate a readable int representation of the version
    //For example 4.12.3 will be 412003
    const val code = major * majorOffset + minor * minorOffset + patch
}
" >> $versionFilePath
git add $versionFilePath

echo "--------> Creating version bump commit"
git commit -m "Version bump to $newVersion"
git push --set-upstream origin "$versionBumpBranch"

gh pr create --repo tink-ab/tink-link-android-private --head "$versionBumpBranch" -t "PFMF-$jiraTicketNumber - Version bump to $newVersion" -b "Version bump to $newVersion" --base $devBranch -r tink-ab/android-maintainer
echo "--------> Created version bump PR from $versionBumpBranch to $devBranch"
echo "--------> NEXT: Merge version bump PR"
read -p "--------> Press enter when PR is merged"
read -p "--------> Press enter to confirm PR is merged"

git checkout $devBranch
git pull
gh pr create --repo tink-ab/tink-link-android-private --head $devBranch -t "PFMF-$jiraTicketNumber - Release $newVersion" -b "Release $newVersion" --base $masterBranch -r tink-ab/android-maintainer
echo "--------> Created release PR from $devBranch to $masterBranch"
echo "--------> NEXT: Merge release PR"
read -p "--------> Press enter when PR is merged"
read -p "--------> Press enter to confirm PR is merged"

echo "--------> Launching the script #2 to publish to Maven local"
./scripts/2-publish-to-maven-local.sh "$newVersion" "$oldVersion" "$jiraTicketNumber" "$isDryRun"



