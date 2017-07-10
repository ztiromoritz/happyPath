package de.mo.basics

import java.util.Optional

import de.mo.Pokemon
import de.mo.Pokemon.evolve


object ExampleOption extends App {
  val evolvedPokemon =
    Some("Bisasam")
      .map(evolve)
      .filter(Pokemon.isFire)

  val none: Option[String] = None
  val noPokemon =
    none
      .map(evolve)
      .filter(Pokemon.isFire)


}


object SumExample extends App {

  def mayBeX = Some(3)

  def mayBeY = Some(4)

  val mayBeSum: Option[Int] =
    for {
      x <- mayBeX
      y <- mayBeY
    } yield {
      x + y
    }
}
