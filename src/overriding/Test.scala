package overriding

abstract class Test {
def thing: String
}
class One extends Test {
def thing = "Moof"
}

class Test2 extends Test {
override val thing = (new java.util.Date).toString
}
