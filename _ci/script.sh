#!/bin/bash
set -e

echo "Task: $1"

case "$TRAVIS_COMMIT_MESSAGE" in
    *"[noci]"*)
        echo "Commit message has [noci]. CI skipped (reported successful)".
        ;;
    *)
        $1 && exit $?
        ;;
esac
