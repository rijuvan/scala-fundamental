package varargs;

object VarArgs  extends App {
  override  def main(args: Array[String]) {
        printStrings("Hello", "Scala", "Python");
   }
   def printStrings( args:String* ) = {
      var i : Int = 0;
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
   }
}

/*
class DemoTest
{
  
def show(args: String *)
{
  
for ( x <- args ) {
         println( x )
      }



}

}


object DemoVarArgs extends App
{
  

val demo=new DemoTest();


demo.show("a","b","c");


}
*/


