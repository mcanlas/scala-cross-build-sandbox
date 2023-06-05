lazy val root = Project("scala-cross-build-sandbox", file("."))
  .aggregate(`scala-collection-compat`)

lazy val `scala-collection-compat` = project
  .settings(libraryDependencies += "org.scala-lang.modules" %% "scala-collection-compat" % "2.10.0")
  .settings(crossScalaVersions := List("2.11.12", "2.12.17", "2.13.10"))
