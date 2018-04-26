package com.soft.trg

trait tax {
  def calcTax(salary: Int): Double = {

    0.0;
  }

  def show();

}

class TaxImpl(salary: Int) extends tax {

  override def calcTax(salary: Int) = {

    if (salary >= 20000)
      salary * .1;
    else
      salary * .1;
  }

  override def show() =
    {

      println("This is show methods and its overriden!!");
    }

}

object TraitDemo {

  def main(args: Array[String]): Unit = {

    var tax = new TaxImpl(50000);
    println(tax.calcTax(50000));
  }
}


