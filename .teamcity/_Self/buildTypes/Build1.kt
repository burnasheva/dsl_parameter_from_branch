package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Build1 : BuildType({
    name = "build 1"

    vcs {
        root(DslContext.settingsRoot)
    }

    params {
        param("a", "")
    }

    steps {
        script {
            scriptContent = """echo "param a=%a%""""
        }
    }
})
