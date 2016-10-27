package com.example.config

import org.gradle.listener.ActionBroadcast
import org.gradle.util.ConfigureUtil

class HelloConfig {

	def String paramString
	def Closure paramClosure

	def ActionBroadcast<String> paramClosureList = new ActionBroadcast<String>()

	def closureList(Closure closure) {
		paramClosureList.add(ConfigureUtil.configureUsing(closure))
	}
}
