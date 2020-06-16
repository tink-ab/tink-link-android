#!/bin/bash

set -euo pipefail

./gradlew link:test link-payments:test
