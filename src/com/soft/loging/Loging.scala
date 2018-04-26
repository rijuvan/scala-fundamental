package com.soft.loging

object Loging {

  def info(message: String): Unit = println(s"INFO: $message")

}

import com.soft.loging.Loging.info;

class Project(name: String, daysToComplete: Int)

object TestLog {

  def main(args: Array[String]) {

    val project1 = new Project("New Project", 1)
    val project2 = new Project("Website developments", 5)
    info("Created projects") // Prints "INFO: Created projects"
  }

}