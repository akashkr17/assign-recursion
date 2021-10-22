package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite

class TailRecursionSpec extends AnyFunSuite {
  val tailRecursion = new TailRecursion();

  test("Function should return correct factorial") {
    assert(tailRecursion.recursion(3) == 6)
  }

  test("Function should return one for negative,zero,one values") {
    assert(tailRecursion.recursion(0) == 1)
  }

}
