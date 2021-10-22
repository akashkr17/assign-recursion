package edu.knoldus

class HeadRecursion() extends Recursion {
  val recursion: Int => Int = (x: Int) => {
    x match {
      case x if (x <= 1) => 1
      case _             => x * recursion(x - 1)
    }
  }

}
