package de.mo.old

import de.mo.Pokemon.evolve

/**
  * Created by rebbert on 10.07.17.
  */
//noinspection SpellCheckingInspection
object Example1Scala extends App {

  //--------------------------------------

  val evolvedPokemon =
    List("Bisasam", "Glumanda", "Pikachu")
      .map(evolve)
      .map(evolve)


  List("Bisasam", "Glumanda", "Pikachu")

  //--------------------------------------

  println(evolvedPokemon)

}
