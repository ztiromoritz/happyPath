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

  val BASE_URL: String = "http://localhost:3000"

  val mapper: ObjectMapper = new ObjectMapper().registerModule(DefaultScalaModule)

  def getAllPeople: Try[List[Map[String, String]]] = {
    Try(Http(s"${BASE_URL}/people").asString)
      .map(_.body)
      .map(str => mapper.readValue(str, classOf[List[Map[String,String]]]))

  }

  def getPerson(id:String): Try[Map[String, String]] = {
    Try(Http(s"${BASE_URL}/people/${id}").asString)
      .map(_.body)
      .map(str => mapper.readValue(str, classOf[Map[String,String]]))
  }

}
