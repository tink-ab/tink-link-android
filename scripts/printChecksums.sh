#!/bin/bash
# This is a script to print the checksums of the generated binaries.
# Run this after running the 'assemble' task.
#
# If an output directory is specified (using the '-o {OUTPUT_DIRECTORY}' flag),
# the checksums will be printed to files within that directory.

outputDir=""

while getopts o: flag; do
  case "${flag}" in
    o) outputDir="${OPTARG}" ;;
    *) error "Unexpected option ${flag}" ;;
  esac
done

names=(link link-payments)
artifacts=(aar aar)

for index in ${!names[*]}; do
  name=${names[$index]}
  a=${artifacts[$index]}
  artifactPath=""
  if [ "$a" == "aar" ]; then
    artifactPath="$name/build/outputs/aar/$name-release.aar"
  else
    artifactPath="$name/build/libs/$name.jar"
  fi

  checksum=($(shasum -a 256 "$artifactPath"))

  if [ -z "$outputDir" ]; then
    echo "$name: $checksum"
  else
    echo "$checksum" > "$outputDir/$name.sha256"
    echo "$checksum > $outputDir/$name.sha256"
  fi
done

exit 0
