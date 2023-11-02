# KSP 1.9.20 generated code bug

After upgrading to KSP 1.9.20 generated source code is now picked up by detekt `./gradlew detektMain`

Downloading and running `./gradlew detektMain` will show detekt errors for generated code, if you downgrade KSP to
1.9.10 and re-run `./gradew detektMain` the generated code is no longer flagged by detekt.
