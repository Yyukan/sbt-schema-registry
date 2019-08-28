lazy val root = (project in file("."))
  .settings(
    name := "sbt-schema-registry",
    organization := "net.shtykhno",
    version := "0.1-SNAPSHOT",
    sbtPlugin := true,
    scalaVersion := "2.12.8"
  )
