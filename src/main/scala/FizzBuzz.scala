// set the package of this file and object
package com.training.exercise1

// import the dependencies to read and write on file
import java.io.{BufferedWriter, File, FileWriter}
// import the dependencies of date
import java.time.ZonedDateTime

/**
 * Fizz if number is divisible by 3
 * Buzz if number is divisible by 5
 * FizzBuzz if number is both divisible by 3 and 5
**/

object FizzBuzz extends App {
  def exercise1(number: Int): String = {
    number match {
      //check if the number is both divisible by 3 and 5
      case x if x % 3 == 0 && x % 5 == 0 => "FizzBuzz"
      //check if the number iis divisible by 3
      case x if x % 3 == 0 => "Fizz"
      //check if the number is divisible by 5
      case x if x % 5 == 0 => "Buzz"
    }
  }
  /**
    write a `String` to the `filename`.
   **/
  def writeFile(filename: String, s: String): Unit = {
    //get datetime of now
    val datetime = ZonedDateTime.now
    //starting the file
    val file = new File(filename)
    //create folder if needs
    file.getParentFile.mkdirs
    //create file if doesn't exists
    file.createNewFile;
    //starting to write on file
    val bw = new BufferedWriter(new FileWriter(file, true))
    //write on the file with datetime and line break
    bw.write(s"${datetime}: ${s} \n")
    //end of buffer
    bw.close
  }

  def writeResult(number: Int, path: String): Unit = {
    //call the function to get the result
    val result = exercise1(number)
    //call the writefile
    writeFile(path, result)
  }

  //passing params
  writeResult(10, "/Users/debora/debora/result.txt")
  writeResult(9, "/Users/debora/debora/result.txt")
  writeResult(15, "/Users/debora/debora/result.txt")
}