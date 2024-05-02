//
//  main.swift
//  universal-prompt
//
//  Created by Studio A on 4/30/24.
//

import Foundation
import KMPNativeCoroutinesAsync
import UniversalNetworkKit

KoinKt.doInitKoin()
let repository = UniversalRepository()
let hello = repository.hello()
hello.forEach { str in
    print(str)
}
