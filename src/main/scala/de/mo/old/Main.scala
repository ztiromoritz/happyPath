package de.mo.old

import de.mo.Pokemon._


//https://stackoverflow.com/questions/31641190/futures-map-vs-flatmap

/**
  * Created by mo on 02.07.17.
  */
object Main extends App {

  /*
  Service.getAllPeople match {
    case Success(body) => println(body)
    case Failure(e) => println("ERROR: " + e.getMessage)
  }
  Service.getPerson("12").foreach(println)
  Service.getPerson("13").foreach(println)
*/

  //Some("Pikachu").map(evolve).foreach(println)

  //List(Some("Bisasam"),Some("Glumanda"), Some("Pikachu")).map(evolve).map(evolve).foreach(println)
  val evolvedPokemon = List("Bisasam", "Glumanda", "Pikachu")
    .map(evolve)
    .map(evolve)
    .map(megaStone("X"))

  println(evolvedPokemon)

  /*
  Seq(1,2,3,4,5,6).map(x => x*x).filter(_ != 9)

  for {
    i <- Seq(1,2,3,4,5,6)
    j=i*i if j != 9

  } yield {
    j
  }
  */

  //Social Media Example
  /*
     val reply =
     for (
        user <- getUser,
        friend <- getBestFriend(user),
        message <- getLastMessage(friend),
        if(message.isFunny) //Guard als erweiterung des Beispiels
     ) yield {  // Wann kommt yield wann nicht, Faustregel, Merksatz
        createReply(user, friend, message)
     }

     =>
     flatMap Übersetzung
   */


}
