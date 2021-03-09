package com.training.exercise1

object FizzBuzz extends App {
  def exercise1(number: Int): String = {
    number match {
      case x if x % 3 == 0 && x % 5 == 0 => "FizzBuzz"
      case x if x % 3 == 0 => "Fizz"
      case x if x % 5 == 0 => "Buzz"
    }
  }

  exercise1(10)
  exercise1(9)
  exercise1(15)
}