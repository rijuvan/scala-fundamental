package outerpkg.innerpkg
class Outer { 
class Inner {
private[Outer] def f() = "This is f"
private[innerpkg] def g() = "This is g"
private[outerpkg] def h() = "This is h"
}}


object DemoA
{
  
  
  def main(args:Array[String]):Unit={
    
var o1=new Outer();

    
    
  }
}