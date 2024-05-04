tasks.register("ubn") {
    dependsOn ("g:common:test")
    dependsOn("ubnTasks")
}

val ubnGroup = "Universal Basic Network"
tasks.register("ubnTasks") {
    group = ubnGroup
    description = "see all ubn runnable tasks"
    tasks.named("tasks", TaskReportTask::class.java).get()
        .displayGroup = ubnGroup
    dependsOn("tasks")
}

tasks.register("ubnPromptJvm") {
    group = ubnGroup
    description = "open prompt on jvm"
    dependsOn("g:common:jvmRun")
}

tasks.register("ubnRun") {
    group = ubnGroup
    description = "press the button"
    dependsOn("ubnPromptJvm")
}

tasks.register("ubnInit") {
    group = ubnGroup
    description = "generate dependencies"
    dependsOn("g:common:createSwiftPackage")
}

tasks.register("ubnPromptMac") {
    group = ubnGroup
    description = "open prompt on mac"
    dependsOn("ubnInit")
    doLast {
        val script = "./x/bin/prompt.sh"
        println("running:\n > `$script`")
        project.exec {
            commandLine(script)
        }
    }
}
