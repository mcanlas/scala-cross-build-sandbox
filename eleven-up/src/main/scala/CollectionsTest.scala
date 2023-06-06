import scala.collection.compat._

// sbt +eleven-up/run
object CollectionsTest extends App {
  val xs: IterableOnce[Int] =
    List(1, 2, 3)

  locally {
    xs
      .iterator
      .foreach(println)
  }
}
