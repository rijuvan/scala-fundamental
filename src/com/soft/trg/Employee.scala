package com.soft.trg

class Test ; // minimal class

class AddressBean(var address1:String,var address2:String, var city:String,var zipCode:Int)




class Employee1(name:String="Amit")
{
  
  def showEmp():String=name;
  
}






class Employee(name: String, location: String) {

  //creating constructor 
  
 
  def show(name: String): String = {

    "This is show methiod in class" + name;
  }

}

object obj {

  def main(args: Array[String]) {

    var emp = new Employee("Rijuvan", "Noida");

    println(emp.show("Rijuvan Ansari"));

    var x=new Test;
    
    // using employee 1 with 
    var emp1=new Employee1;
    
   println(emp1.showEmp());
    
   var emp2=new Employee1("abhishek");
    
   println(emp2.showEmp());
   
   
   var localAddress = new AddressBean("230 43rd street", "", "Columbus",43233)

   
  }
}