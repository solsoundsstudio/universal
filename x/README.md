# Xcode Root
## universal/x

This folder is managed primarily by xcode and swift build and package systems.

Applications based in this folder have access to Universal Network function through a local dependency generated at

`universal/x/.generated/UniversalNetworkPackage/`

## Run Prompt

`swift build -c release --cache-path ".swiftcache" && .build/release/prompt`

## Troubleshooting

Clear swift cache:
`rm -rf .swiftcache`

Clear generated code (will have to rebuild [/g](../g/README.md)):
`rm -rf .generated`