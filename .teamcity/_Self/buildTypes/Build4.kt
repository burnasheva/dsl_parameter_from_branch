package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Build4 : BuildType({
    name = "build 4"

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
