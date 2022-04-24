package _Self

import _Self.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({

    buildType(Build)
    buildType(Build1)
    buildType(Build2)
    buildType(Build4)
    buildType(TriggerBuild)
})
