lazy val root = Project("scala-cross-build-sandbox", file("."))
  .aggregate(`eleven-up`, `twelve-up`)

lazy val `eleven-up` = project
  .settings(scalaVersion := "2.13.10")
  .settings(libraryDependencies += "org.scala-lang.modules" %% "scala-collection-compat" % "2.10.0")
  .settings(crossScalaVersions := List("2.11.12", "2.12.17", "2.13.10"))

lazy val `twelve-up` = project
  .settings(scalaVersion := "2.13.10")
  .settings(libraryDependencies += "org.scala-lang.modules" %% "scala-collection-compat" % "2.10.0")
  .settings(crossScalaVersions := List("2.12.17", "2.13.10"))
