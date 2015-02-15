// Turn this project into a Scala.js project by importing these settings

enablePlugins(ScalaJSPlugin)

name := "$name$"

version := "$version$"

scalaVersion := "2.11.5"


libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.8.0",
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "com.lihaoyi" %%% "scalatags" % "0.4.5"
  //"org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test"
)


