package callbyname

class CallByName {

  def nano() = {
    println("Getting nano")
    System.nanoTime
  }

  def delayed(t: => Long) = {
    println("In delayed method")
    println("Param: " + t)
    t
  }

}

object DemoCallByName extends App {

  var x = new CallByName()

  x.delayed(x.nano); //what happens when we call delayed with nano as a parameter

}

//This indicates that delayed is entered before the call to nano and that nano is called twice