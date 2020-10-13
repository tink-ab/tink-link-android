#!/bin/bash
# This is a script to print the checksums of the generated binaries.
# Run this after running the 'assemble' task.
#
# If an output directory is specified (using the '-o {OUTPUT_DIRECTORY}' flag),
# the checksums will be printed to files within that directory.

echo "input version: "
read version

names=(link link-payments link-ui)
artifacts=(aar aar aar)

outputDir=""

while getopts o: flag; do
  case "${flag}" in
    o) outputDir="${OPTARG}" ;;
    *) error "Unexpected option ${flag}" ;;
  esac
done

for index in ${!names[*]}; do
  name=${names[$index]}
  a=${artifacts[$index]}
  bintray=$(curl -s https://dl.bintray.com/tink/tink-link/com/tink/$name/$version/$name-$version.$a.sha256)

  if [ -z "$outputDir" ]; then
    echo "$name: $bintray"
  else
    echo "$bintray" > "$outputDir/$name.sha256"
    echo "$bintray > $outputDir/$name.sha256"
  fi
done

exit 0
