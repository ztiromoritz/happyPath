package de.mo.old

/**
  * Created by rebbert on 09.07.17.
  */
object ExampleAScala extends App {

  val sunny: Boolean = ???
  val SUN_GLASSES = "🕶"
  val NORMAL_GLASSES = "\uD83D\uDC53"

  case class Point(x: Int, y: Int)

  //========================================================

  //for loop/with side effect
  for (x <- Seq(0, 1, 2, 3, 4, 5)) {
    println("" + x * x)
  }

  //for comprehension/functional
  val quad: Seq[Int] =
    for {x <- 0 to 5} yield {
      x * x
    }

  //BTW. if else has a return value, too.
  val glasses = if (sunny) {
    SUN_GLASSES
  } else {
    NORMAL_GLASSES
  }

  //=======================================================

  val points =
    for {
      x <- 0 to 10
      y <- 0 to 10
    } yield {
      Point(x, y)
    }

  val points2 =
    (0 to 10).flatMap(x => (0 to 10).map(y => Point(x, y)))


  val points3 =
    for {
      x <- 0 to 10 if x%2==0
      y <- 0 to 10
    } yield {
      Point(x, y)
    }

  val points4 =
    (0 to 10).withFilter(x => x % 2 == 0).flatMap(x => (0 to 10).map(y => Point(x, y)))


}
