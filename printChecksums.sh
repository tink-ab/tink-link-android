#!/bin/bash
# This is a script to print the checksums of the generated binaries.
# Run this after running the 'assemble' task.

actualLinkChecksum=($(shasum -a 256 link/build/outputs/aar/link-release.aar))

echo "Link: $actualLinkChecksum"

exit 0