package net.shtykhno.sbt.plugin.schemaregistry

import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient

object RegistryClient {
  lazy val client = new CachedSchemaRegistryClient("", 0)
}
