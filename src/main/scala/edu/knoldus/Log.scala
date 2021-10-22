package edu.knoldus

class Log {
  def setLog(message: String, level: String = "INFO"): String = {
    s"[${level.toUpperCase}]: $message"
  }
}
