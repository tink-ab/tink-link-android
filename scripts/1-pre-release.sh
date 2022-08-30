# shellcheck disable=SC2162
clear

printf "\n"
echo "--------> TINK LINK RELEASE"
printf "\n"
echo "--------> !! You can stop this release process at any time by clicking 'control+c' !!"
printf "\n"
read  -p '--------> Press any key to start'
printf "\n"

if ! git remote show public; then
  clear
  echo "--------> Error: add the public repository as a remote. Run the following: 'git remote add public git@github.com:tink-ab/tink-link-android-private.git'"
  exit
else
  :
fi

clear
read -p "--------> Enter NEW version (x.y.z format): " newVersion
if [[ $newVersion =~ ^([0-9]{1,2}\.){2}[0-9]{1,10}$ ]]; then
   if ! git checkout release-"$newVersion"; then
     clear
     echo "--------> Error: a release branch named 'release-x.y.z' must exist LOCALLY"
     exit
   else
     git push --set-upstream origin "release-$newVersion"
   fi
else
  echo "--------> Error: $newVersion is not in the right format."
  exit
fi

clear
read -p "--------> Enter PREVIOUS version (x.y.z format): " oldVersion
if [[ $oldVersion =~ ^([0-9]{1,2}\.){2}[0-9]{1,10}$ ]]; then
  :
else
  echo "--------> Error: $oldVersion is not in the right format."
  exit
fi

clear
read -p "--------> Enter Jira ticket number (xxxx format - skip PFMF): " jiraTicketNumber
if [[ $jiraTicketNumber =~ ^[0-9]{4}$ ]]; then
  :
else
  echo "--------> Error: $jiraTicketNumber is not in the right format."
  exit
fi

clear
echo "--------> Dry-run 'y': simulate a release using copy of master, development and release branches."
echo "--------> Dry-run 'n': does a real release"
read -p "--------> Dry-run? (y/n): " isDryRun

clear
echo "--------> new version number: $newVersion"
echo "--------> previous version number: $oldVersion"
echo "--------> Jira ticket number: $jiraTicketNumber"
echo "--------> Dry-run: $isDryRun"
read -p "--------> Press any key to continue if the values are correct"

# Init branches
if [[ $isDryRun = 'y' ]]
then
  masterBranch=master-dry-run
  git branch -d $masterBranch
  git push origin --delete $masterBranch
  git checkout master
  git pull
  git checkout -b $masterBranch
  git push --set-upstream origin $masterBranch
  devBranch=dev-dry-run
  git branch -d $devBranch
  git push origin --delete $devBranch
  git checkout development
  git pull
  git checkout -b $devBranch
  git push --set-upstream origin $devBranch
  releaseBranch=release-$newVersion-dry-run
  git branch -d "$releaseBranch"
  git push origin --delete "$releaseBranch"
  git checkout release-"$newVersion"
  git pull
  git checkout -b "$releaseBranch"
  git push --set-upstream origin "$releaseBranch"
  publicMasterBranch=public-master-dry-run
  git branch -d $publicMasterBranch
  git push origin --delete $publicMasterBranch
else
  masterBranch=master
  devBranch=development
  releaseBranch=release-"$newVersion"
  publicMasterBranch=public-master
  git branch -d $publicMasterBranch
  git push origin --delete $publicMasterBranch
fi

git checkout "$releaseBranch"
git pull

echo "--------> Running ktlintFormat"
./gradlew ktlintFormat

if [[ $(git status --porcelain) ]]; then
  echo "--------> There are changes to commit/discard before you can continue with the release"
  exit
else
 echo "--------> No changes to commit/discard, continuing with the release"
fi

echo "--------> Running Dokka"
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
echo "--------> Creating version bump commit"
git add $versionFilePath
git commit -m "Version bump to $newVersion"
git push

if [[ $isDryRun = 'y' ]]
then
  prTitlePrefix="DRY-RUN"
else
  prTitlePrefix=""
fi

gh pr create --repo tink-ab/tink-link-android-private --head "$releaseBranch" -t "$prTitlePrefix PFMF-$jiraTicketNumber - Release $newVersion" -b "Release $newVersion" --base $masterBranch -r tink-ab/android-maintainer
clear
echo "--------> DONE: Created release PR from $releaseBranch to $masterBranch"
echo "--------> NEXT: Merge release PR using MERGE PULL REQUEST (don't SQUASH & MERGE, we want to see all the commits made into the release branch)"
read -p "--------> Press enter when PR is merged"
read -p "--------> Press enter to confirm PR is merged"

gh pr create --repo tink-ab/tink-link-android-private --head "$releaseBranch" -t "$prTitlePrefix PFMF-$jiraTicketNumber - Release $newVersion" -b "Release $newVersion" --base $devBranch -r tink-ab/android-maintainer
clear
echo "--------> DONE: Created release PR from $releaseBranch to $devBranch"
echo "--------> NEXT: Merge release PR using MERGE PULL REQUEST (don't SQUASH & MERGE, we want to see all the commits made into the release branch)"
read -p "--------> Press enter when PR is merged"
read -p "--------> Press enter to confirm PR is merged"

git checkout $masterBranch
git pull

read -p "--------> Press enter to launch the script #2 for publishing to Maven local"
./scripts/2_publish_to_maven_local.sh "$newVersion" "$oldVersion" "$jiraTicketNumber" "$isDryRun"



