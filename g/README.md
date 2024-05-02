# Gradle Root
## universal/g

This folder is managed primarily by gradle and kotlin multiplatform build and package systems

## Run Prompt

`./gradlew jvmRun`

### Install App
`./gradlew app:installDebug`

## Troubleshooting

Clear all ignored, untracked files
`git clean -fdX`
 * (Open Android Studio to recreate local.properties)

## [/x](../x/README.md)

Applications based in this folder have access to Universal Network function through a local dependency generated at
`universal/x/.generated/UniversalNetworkPackage/`
