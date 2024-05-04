// swift-tools-version: 5.10
// The swift-tools-version declares the minimum version of Swift required to build this package.

import PackageDescription

let package = Package(
    name: "universal-prompt",
    platforms: [.macOS(.v14)],
    dependencies: [
        .package(url: "https://github.com/rickclephas/KMP-NativeCoroutines.git", exact: "1.0.0-ALPHA-18"),
        .package(name: "UniversalNetworkPackage", path: ".generated/UniversalNetworkPackage/"),
    ],
    targets: [
        // Targets are the basic building blocks of a package, defining a module or a test suite.
        // Targets can depend on other targets in this package and products from dependencies.
        .executableTarget(
            name: "prompt",
            dependencies: [
                .product(name: "KMPNativeCoroutinesAsync", package: "KMP-NativeCoroutines"),
                .product(name: "UniversalNetwork", package: "UniversalNetworkPackage")
            ],
    	    path: "universal-prompt/Sources"
        )
    ]
)
