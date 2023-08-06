package com.salnikoff.camel.demo

import org.apache.camel.Main
import org.apache.camel.builder.RouteBuilder

fun main(args: Array<String>) {
    println("Camel demo")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val camelMain = Main()
    camelMain.routeBuilders.add(FileMove())
    camelMain.run()
}

class FileMove() : RouteBuilder() {
    override fun configure() {
        from("file:/input?noop=true")
            .choice()
            .`when`(xpath("/person/city = 'London'"))
            .log("UK message")
            .to("file:/target/messages/uk")
            .otherwise()
            .log("Other message")
            .to("file:/target/messages/others")
    }
}