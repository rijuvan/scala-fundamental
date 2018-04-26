package objectdemo

object Simple {

}

// Object with one method
trait SimpleObject
{
  
def show;
}

class DemoForObject extends SimpleObject
{
  
def show() { println("This is my show mwtho in DemoForObject class");
}
}



object Two  extends DemoForObject with SimpleObject  // Object extending class and traits 
{
  
//override  show(name:String)="Hello" + name;


def display(){"This is my new method added in object " } // adding a new method


{
  
}

}