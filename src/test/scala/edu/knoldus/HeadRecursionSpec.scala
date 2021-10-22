package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class HeadRecursionSpec extends AnyFunSuite {
  val headRecursion = new HeadRecursion();

  test("Function should return correct factorial") {
    assert(headRecursion.recursion(3) == 6)
  }

  test("Function should return one for negative,zero,one values") {
    assert(headRecursion.recursion(0) == 1)
  }
}
