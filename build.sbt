lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-schema-registry",
    organization := "net.shtykhno",
    version := "0.1-SNAPSHOT",
    sbtPlugin := true,
    scalaVersion := "2.12.8",
    resolvers ++= Seq(
      "MvnRepository" at "http://mvnrepository.com/artifact/",
      "Confluent" at "http://packages.confluent.io/maven/",
      "ICM" at "http://maven.icm.edu.pl/artifactory/repo/"
    ),
    libraryDependencies ++= Seq(
      "io.confluent" % "kafka-schema-registry-client" % "5.2.1" classifier ""
    ),
    scriptedLaunchOpts := {
      scriptedLaunchOpts.value ++
        Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
    },
    scriptedBufferLog := false
  )
