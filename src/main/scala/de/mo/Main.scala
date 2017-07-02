package de.mo

import scala.util.{Failure, Success}


//https://stackoverflow.com/questions/31641190/futures-map-vs-flatmap

/**
  * Created by mo on 02.07.17.
  */
object Main extends App{

  Service.getAllPeople match {
    case Success(body) => println(body)
    case Failure(e) => println("ERROR: " + e.getMessage)
  }
  Service.getPerson("12").foreach(println)
  Service.getPerson("13").foreach(println)

}
