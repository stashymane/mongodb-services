package dev.stashy.mongoservices.model

import kotlin.jvm.JvmInline

/**
 * A replacement for MongoDB's `ObjectId` class.
 * This allows you to share the same data model across modules/projects without having a dependency on MongoDB's libraries.
 *
 * You must register a contextual [DocumentIdSerializer] for this to be serialized.
 * Having a default serializer will prevent this from working in MongoDB. See [kotlinx.serialization issue #2489](https://github.com/Kotlin/kotlinx.serialization/issues/2489)
 *
 * ```kotlin
 *  @Serializable
 *  data class YourDocument(
 *      @SerialName("_id") @Contextual val id: DocumentId? = null,
 *      val foo: String, val bar: String
 *  )
 * ```
 *
 * It is recommended to add a typealias for EntityId so that you can omit the `@Contextual` annotation:
 * ```kotlin
 * typealias Id = @Contextual DocumentId
 * ```
 */
@JvmInline
value class DocumentId(val value: String)
