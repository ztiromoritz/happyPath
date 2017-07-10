package de.mo.livedemo

import de.mo.Service._

object SocialExampleComplex extends App {

  val id = "12"

  def fancyAnsweringKI(lastMessage: Map[String, String]):Option[String] = {
    Some("Huhu!")
  }

  //Friendly chat bot
  val niceReply: Option[String] =
    for {
      user <- fetchUser(id)                               //  Map[String,String] <- Option[Map[String,String]]
      name <- user.get(NAME)                              //  String <- Option[String]
      bestFriendId <- user.get(BEST_FRIEND_ID)            //  String <- Option[String]
      bestFriend <- fetchUser(bestFriendId)               //  Map[String,String] <- Option[Map[String,String]]
      bestFriendsName <- bestFriend.get(NAME)             //  String <- Option[String]
      lastMessageId <- bestFriend.get(LAST_MESSAGE_ID)    //  String <- Option[String]
      lastMessage <- fetchMessage(lastMessageId)          //  Map[String,String] <- Option[Map[String,String]]
      answerBody <- fancyAnsweringKI(lastMessage)         //  String <- Option[String]
    } yield {
      s"Hi $bestFriendsName, $answerBody. Greetings $name."
    }

  println(niceReply.getOrElse("No Message"))

}
