cd "x"
xcodebuild -resolvePackageDependencies || exit 1
swift build -c release --cache-path ".swiftcache" || exit 1
.build/release/prompt
