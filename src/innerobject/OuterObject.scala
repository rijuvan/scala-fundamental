package innerobject

object OuterObject extends App {
  
  var x=200;
  
  object inner extends App
  {
    var y=300;
    
    print(x);
  }
//print(y);
}