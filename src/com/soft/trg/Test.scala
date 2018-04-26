

abstract class A {
  def thing: String
}
class C extends A {
 def thing = "Moof";
}

class B extends A {
  override val thing = (new java.util.Date).toString
}
