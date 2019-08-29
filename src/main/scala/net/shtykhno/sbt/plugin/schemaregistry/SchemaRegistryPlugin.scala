package net.shtykhno.sbt.plugin.schemaregistry

import sbt._
import Keys._

object SchemaRegistryPlugin extends AutoPlugin {

  override def trigger            = allRequirements
  override lazy val buildSettings = Seq(commands += helloCommand)

  lazy val helloCommand =
    Command.command("hello") { (state: State) =>
      println("Hello Plugin!")
      state
    }
}
