package com.soft.trg

class Department {

  def show(): Unit = {

    println("This is show method !!")
  }

}

object Department extends App {

  var dept = new Department();
  dept.show();
}