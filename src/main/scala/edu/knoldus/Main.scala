package edu.knoldus

object Main extends App {
  val headRecursion = new HeadRecursion()
  val tailRecursion = new TailRecursion()
  val log = new Log()

  println(headRecursion.recursion(3))
  println(tailRecursion.recursion(3))

  println(
    log.setLog("Total time: 4 s, completed 20 Oct, 2021 7:56:21 PM", "success"))
  println(log.setLog("Total time: 4 s, completed 20 Oct, 2021 7:56:21 PM"))

}
