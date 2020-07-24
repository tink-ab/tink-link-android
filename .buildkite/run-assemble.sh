#!/bin/bash

set -euo pipefail

./gradlew link:assemble link-payment:assemble link-ui:assemble
