package com.example

import org.gradle.api.Plugin
import org.gradle.api.Project

import com.example.config.HelloConfig
import com.example.task.HelloTask

class HelloPlugin implements Plugin<Project> {

	@Override
	void apply(Project project) {
		project.extensions.create('hello', HelloConfig)
		HelloTask hello = (HelloTask)project.task("hello", type: HelloTask)
	}
}
