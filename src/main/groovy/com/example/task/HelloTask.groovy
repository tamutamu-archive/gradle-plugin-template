package com.example.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

import com.example.config.HelloConfig;

class HelloTask extends DefaultTask {

	@TaskAction
	void runTask() {

		if(project.hello.paramString){
			println project.hello.paramString
		}

		if(project.hello.paramClosure){
			project.hello.paramClosure("Test Param 1", "Test Param 2")
		}

		if(project.hello.paramClosureList){
			project.hello.paramClosureList.execute("Test ClosureList")
		}
	}
}