package de.mo

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

import scala.util.Try
import scala.util.parsing.json.{JSON, JSONObject}
import scalaj.http._


class Service {}


/**
  * Created by mo on 01.07.17.
  */
object Service {


  val BEST_FRIEND_ID = "bestFriendId"
  val LAST_MESSAGE_ID = "lastMessageId"
  val NAME = "name"
  val NICE = "nice"
  val AUTHOR_ID = "authorId"
  val TEXT = "text"


  val BASE_URL: String = "http://localhost:3000"

  val mapper: ObjectMapper = new ObjectMapper().registerModule(DefaultScalaModule)

  case class Message(authorId: String, isNice: Boolean, text: String)

  val list = List(Some("foo"),None,Some("adsf"))

  for{
    e <- list.flatten
  }{

  }


  def fetchAllUsers: Option[List[Map[String, String]]] = {
    Try(Http(s"$BASE_URL/users").asString)
      .toOption
      .map(_.body)
      .map(str => mapper.readValue(str, classOf[List[Map[String, String]]]))
  }

  def fetchUser(id: String): Option[Map[String, String]] = {
    Try(Http(s"$BASE_URL/users/$id").asString)
      .toOption
      .map(_.body)
      .map(str => mapper.readValue(str, classOf[Map[String, String]]))
  }


  def fetchAllMessages: Option[List[Map[String, String]]] = {
    Try(Http(s"$BASE_URL/messages").asString)
      .toOption
      .map(_.body)
      .map(str => mapper.readValue(str, classOf[List[Map[String, String]]]))
  }

  //getOrElse Version of fetch, only complete messages
  def getAllMessages: Iterable[Message] =
    for {
      messages <- fetchAllMessages.toSeq              // <- Option[List[Map[String,String]]] !!! toSeq
      msg <- messages                                 // <- List[Map[String,String]]
      authorId <- msg.get(AUTHOR_ID)                  // <- Option[String]
      niceStr <- msg.get(NICE)                        // <- Option[String]
      nice = niceStr == "true"                       //  String
      text <- msg.get(TEXT) if text.length > 30      // <- Option[String]
    } yield {
      Message(authorId, nice, text)
    }


  def fetchMessage(id: String): Option[Map[String, String]] = {
    Try(Http(s"$BASE_URL/messages/$id").asString)
      .toOption
      .map(_.body)
      .map(str => mapper.readValue(str, classOf[Map[String, String]]))
  }


}
