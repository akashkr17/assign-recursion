package edu.knoldus


import org.scalatest.funsuite.AnyFunSuite


class LogSpec extends AnyFunSuite {

  val log = new Log

  test("When level argument is not provided") {
    assert(log.setLog("warning") == "[INFO]: warning")
  }

  test("When level argument is  provided") {
    assert(log.setLog("warning","success") == "[SUCCESS]: warning")
  }

}
