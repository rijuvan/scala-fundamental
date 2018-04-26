package innerImport

object DemoOuter {
  
  def name="amit";
  def age="23"
    
    def show()
  {
    
    
  }

}


object DemoImportInner extends App
{
  
import DemoOuter._

println(name);
println(age);
println(show)

}