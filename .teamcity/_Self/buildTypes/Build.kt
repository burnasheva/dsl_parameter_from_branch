package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object Build : BuildType({
    name = "build 3"

    vcs {
        root(DslContext.settingsRoot)
    }

    params {
        param("a", "a's value")
    }

    steps {
        script {
            scriptContent = """echo "param a=%a%""""
        }
    }


    triggers {
        vcs {
            perCheckinTriggering = true
        }
    }
})
