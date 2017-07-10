package de.mo.basics

import java.util.Optional


object ExampleOption extends App {


  val valueA =
    Some(2)
      .map(x => x * x)
      .map(x => x - 3)
      .filter(_ > 2)

  val none: Option[Int] = None
  val valueB =
    none
      .map(x => x * x)
      .map(x => x - 3)
      .filter(_ > 2)


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
