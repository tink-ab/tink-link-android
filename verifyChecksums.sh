#!/bin/bash
# This is a script to verify the checksums of the generated binaries.
# Run this after running the 'assemble' task, and compare it with versions uploaded on bintray.

# LINK
echo "Enter the checksum for link aar"
read linkChecksum

actualLinkChecksum=($(shasum -a 256 link/build/outputs/aar/link-release.aar))

if [ "$linkChecksum" = "$actualLinkChecksum" ]
then
  echo "VALID: link checksum"
else
  echo "INVALID: link checksum. Expected: $actualLinkChecksum"
fi

exit 0