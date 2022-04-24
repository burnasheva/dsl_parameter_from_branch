package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Build2 : BuildType({
    name = "build 2"

    params {
        param("a", "")
        param("reverse.dep.*.a", "a's overridden value (from build 2)")
    }

    steps {
        script {
            scriptContent = """echo "param a=%a%""""
            param("org.jfrog.artifactory.selectedDeployableServer.downloadSpecSource", "Job configuration")
            param("org.jfrog.artifactory.selectedDeployableServer.useSpecs", "false")
            param("org.jfrog.artifactory.selectedDeployableServer.uploadSpecSource", "Job configuration")
        }
    }

    dependencies {
        snapshot(Build1) {
        }
    }
})
