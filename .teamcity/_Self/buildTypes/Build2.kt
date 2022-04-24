package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Build2 : BuildType({
    name = "build 2"

    vcs {
        root(DslContext.settingsRoot)
    }

    params {
        param("a", "")
        param("reverse.dep.*.a", "a's overridden value (from build 2)")
    }

    steps {
        script {
            scriptContent = """echo "param a=%a%""""
        }
    }

    dependencies {
        snapshot(Build1) {
        }
    }
})
