package de.mo.old

import de.mo.Pokemon.evolve

/**
  * Created by rebbert on 10.07.17.
  */
//noinspection SpellCheckingInspection
object Example0Scala extends App {

  //--------------------------------------

  val evolvedPokemon: Option[String] =
    Some("Bisasam")
      .map(evolve)


  //--------------------------------------

  println(evolvedPokemon)

}
