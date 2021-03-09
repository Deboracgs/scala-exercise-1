package com.training.exercise1

import FizzBuzz.exercise1

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FizzBuzzSpec extends AnyFunSuite with Matchers {

  test("Fizz"){
    val result = exercise1(9)
    result shouldEqual "Fizz"
  }
  test("FizzBuzz"){
    val result = exercise1(15)
    result shouldEqual "FizzBuzz"
  }
  test("Buzz"){
    val result = exercise1(10)
    result shouldEqual "Buzz"
  }
}
