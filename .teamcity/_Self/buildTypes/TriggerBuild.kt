package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TriggerBuild : BuildType({
    name = "trigger build"

    params {
        param("reverse.dep.*.a", "a's overridden value (from head, the value differs in branch)")
    }

    vcs {
        root(DslContext.settingsRoot)
    }

    dependencies {
        snapshot(Build) {
        }
        snapshot(Build2) {
        }
        snapshot(Build4) {
        }
    }
})
