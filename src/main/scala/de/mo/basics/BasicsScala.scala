package de.mo.basics

import de.mo.old.ExampleAScala.Point
import de.mo.Pokemon
import de.mo.Pokemon._
import de.mo.basics.NestedLoop.createMatch

object BasicsScala {

}


//noinspection SpellCheckingInspection
object SimpleForLoop extends App {

  val fire = true


  //for-loop with side effect
  for (p <- Seq("Glumanda", "Bisasam", "Schiggy"))
    println(p)

  //for-comprehension with return value
  val evolvedPokemon: Seq[String] =
    for (p <- Seq("Glumanda", "Bisasam", "Schiggy"))
      yield {
        evolve(p)
      }

  //Btw. if has a return value, too
  val starter: String =
    if (fire) {
      "Glumanda"
    } else {
      "Bisasam"
    }


}


//noinspection SpellCheckingInspection
object ForWithGuard extends App {

  val evolvedFirePokemon =
    for {
      p <- Seq("Glumanda", "Bisasam") if isFire(p)
    } yield {
      evolve(p)
    }

}

//noinspection SpellCheckingInspection
object NestedLoop extends App {


  def createMatch(p1: String, p2: String) = ???

  for {
    p1 <- Seq("Glumanda", "Bisasam", "Schiggy")
    p2 <- Seq("Pikachu", "Ottaro")
  } {
    createMatch(p1, p2)
  }
}


//noinspection SpellCheckingInspection
object Assignment extends App {

  for {
    p1 <- Seq("Glumanda", "Bisasam", "Schiggy")
    p2 <- Seq("Pikachu", "Ottaro")
    evolved1 = evolve(p1)
    evolved2 = evolve(p2)
  } {
    createMatch(evolved1, evolved2)
  }

}

//noinspection SpellCheckingInspection
object Combine extends App {

  for {
    p1 <- Seq("Glumanda", "Bisasam", "Schiggy")
    p2 <- Seq("Pikachu", "Ottaro") if isFire(p2)
    evolved1 = evolve(p1)
    evolved2 = evolve(p2)
  } {
    createMatch(evolved1, evolved2)
  }

}


object DeSugar extends App {
  case class Point(x: Int, y: Int)

  val pointsA: Seq[Point] =
    for {
      x <- 0 to 10
      y <- 0 to 10 if y % 2 == 0
    } yield {
      Point(x, y)
    }

  val pointsB: Seq[Point] =
    (0 to 10)
      .flatMap(x =>
        (0 to 10)
          .withFilter(y => y % 2 == 0)
          .map(y => Point(x, y))
      )

}




