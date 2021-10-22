package edu.knoldus

import scala.annotation.tailrec

class TailRecursion() extends Recursion {
  val recursion: Int => Int = (x: Int) => {
    @tailrec def factorialAcc(acc: Int, x: Int): Int = {
      if (x <= 1) {
        acc
      } else {
        factorialAcc(x * acc, x - 1)
      }
    }
    factorialAcc(1, x)
  }
}
