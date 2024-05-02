# Universal Basic Network

>>## `./gradlew ubnRun`
> `./gradlew ubnPromptMac`
> `./gradlew ubnTasks`

## IDEs [Open with IntelliJ](settings.gradle.kts)

### [`/g`](g/README.md) [Open with Android Studio](g/settings.gradle.kts)

The workhorse behind this project is Kotlin Compose Multiplatform.
This module builds the Android application directly
and produces artifacts used in other modules.
try:
`./gradlew g:common:jvmRun`

### [`/x`](x/README.md) [Open with XCode](x/universal.xcworkspace) 

Apple Build systems are finicky but unavoidable.
Keep things simple by keeping them separate.
try:
`./x/bin/prompt.sh`

## Goals

This project is designed to serve as the foundation for a variety of multi-platform applications I want to build.
The ultimate goal is to be able to quickly bootstrap applications with surfaces across a variety of systems.
Initially I am targeting a minimal footprint of Android and Mac, creating a network for collaboration between desktop and mobile. 
I am excited to expand to iOS and javascript targets once these foundations are in place.
I will also likely have some solutions for executing Python as well.  

With these fundamentals in place, I can be confident in getting right to the good parts of application development.
With core dependencies drawing from the formidable Java ecosystem,
logic and scripting in Kotlin, 
basic swift support for deep mac and ios integration,
and "good enough for javascript" javascript support, 
we can be quickly deploying code in a huge variety of environments.

I will be adding more functionality to this core as I work on various projects. 
I want to share it with anybody enterprising enough to press `./gradlew ubnRun`.
Say hi at [solsoundsstudio@jaybobzin.com](mailto:solsoundsstudio@jaybobzin.com?subject=hi)

## Inspirations

### [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
Grateful and inspired by the progress this ecosystem has made in recent years.

### [People In Space by joreilly](https://github.com/joreilly/PeopleInSpace)
I drew on this project heavily for my first Multiplatform prototype. I tried and discarded several template projects, this one was my favorite. I am grateful for the head start. I did preserve many aspects I liked but I have tried to make it my own. 
