import scala.collection.compat.IterableOnce

// sbt +twelve-up/run
object CollectionsTest extends App {
  val xs: IterableOnce[Int] =
    List(1, 2, 3)

  xs
    .iterator
    .foreach(println)
}
