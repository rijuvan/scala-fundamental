package caseclass

case class Test(name: String, age: Int) {
  override def toString = "Test(" + name + "," + age + ")"
  override def hashCode = name.hashCode + age

}

object CaseClassDemo extends App {

  val test = Test("Amit", 25);

  if (test.age == 25)
    println("equal", test)
  else
    println("not equal")

  println(test.toString);

}