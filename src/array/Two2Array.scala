package array

import Array._

object Test {
  def main(args: Array[String]) {

    var d1 = ofDim[Int](3);

    for (i <- 0 to 1)
      d1(i) = i + 10;
    println(d1);

    var myMatrix = ofDim[Int](3, 3)

    // build a matrix
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // Print two dimensional array
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }

  }
}

/*def isOdd(in: Int) = in % 2 == 1
 * for {i <- 1 to 5 if isOdd(i)} println(i)
 * val lst = (1 to 18 by 3).toList
 * for {i <- lst if isOdd(i)} yield i
 * for {i <- lst; j <- lst if isOdd(i * j)} yield i * j
 * 
 * 
 * 
 * 
 */


