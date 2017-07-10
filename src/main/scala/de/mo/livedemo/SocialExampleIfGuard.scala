package de.mo.livedemo

import de.mo.Service._

object SocialExampleIfGuard extends App {

  val id = "12"


  for (message <- getAllMessages)
    println(message.text)
/*
  for (message <- getAllMessages if message.isNice)
    println(message.text)


  val message: Iterable[String] = for (message <- getAllMessages) yield message.text

  val niceMessages: Iterable[String] =
    for {
      message <- getAllMessages if message.isNice
    } yield {
      message.text
    }
*/
}
