package de.mo.old

import de.mo.Trainer
import de.mo.Pokemon._

/**
  * Created by rebbert on 10.07.17.
  */
//noinspection SpellCheckingInspection
object Example2Scala extends App {

  //--------------------------------------


  val misty = Trainer("Misty", List(Some("Enton"), None, Some("Seeper")))
  val ash = Trainer("Ash", List(Some("Pikachu"), Some("Karnimani"), None))

  val trainers: List[Trainer] = List(misty, ash)


  val allPokeballs: List[List[Option[String]]] =
    trainers
      .map(trainer => trainer.bag)

  val allPokeballs2: List[Option[String]] =
    trainers
      .flatMap(trainer => trainer.bag)


  val allPokemon: List[String] =
    trainers
      .flatMap(trainer => trainer.bag)
      .flatten   //flatMap( _=>_ )

  val evolvedPokemon =
    List("Bisasam", "Glumanda", "Pikachu")
      .map(evolve)


  //--------------------------------------

  println(evolvedPokemon)

}
