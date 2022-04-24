package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

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
})
