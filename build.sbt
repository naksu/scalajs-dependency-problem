enablePlugins(ScalaJSPlugin)

name := "Example project"

name := "example"
version := "0.1-SNAPSHOT"
scalaVersion := "2.11.7"

persistLauncher in Compile := true
persistLauncher in Test := false

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.2"

jsDependencies += "org.webjars.npm" % "protobufjs" % "5.0.0" /
  "dist/protobuf.js" commonJSName "Protobuf"
