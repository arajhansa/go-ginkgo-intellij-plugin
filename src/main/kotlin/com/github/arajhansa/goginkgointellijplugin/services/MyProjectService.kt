package com.github.arajhansa.goginkgointellijplugin.services

import com.intellij.openapi.project.Project
import com.github.arajhansa.goginkgointellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
