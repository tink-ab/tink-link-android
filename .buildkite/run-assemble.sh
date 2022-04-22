#!/bin/bash

set -euo pipefail

./gradlew link:assemble link-ui:assemble
