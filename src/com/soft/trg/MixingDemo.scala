package com.soft.trg

// Mixing Demo

abstract class A {
  val message: String
}
class B extends A {
  val message = "I'm an instance of class B"
}
trait C extends A {
  def loudMessage = message.toUpperCase()
}

class D extends B with C {

}

// Mixing Demo 2


abstract class One
{
  def show();
  
}

class Two extends One
{
  def show()={
    println("This is show method in Two");
  }
  
  def print()={
    
    println("This is print method in Two");
  }
}


trait Three extends One
{
  override def show()={
    println("Show method in trait three");
    
  }
}

class OneTwoThree extends Two with Three
{
  def disp="this is method in disp"
}



object DemoAl {
  def main(args: Array[String]): Unit = {
    /*val d = new D
    println(d.message) // I'm an instance of class B
    println(d.loudMessage) // I'M AN INSTANCE OF CLASS B
*/ 
    
  val ob=new OneTwoThree();
  println(ob.disp);
  println(ob.print());
  println(ob.show());
  
  
  }
}






