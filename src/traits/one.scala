package traits

trait one {
  def print()={ "This is my method in one trait"}

}



class Test2 
{
  
  def show2()="";
  def disp()="";


}


object DemoApp extends App {
  
 var x=new Test2() with one;
 
Console.print( x.print());
 

}





