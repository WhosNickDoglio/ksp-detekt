package dev.whosnickdoglio.moshi

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Test(
    val something: String,
    val somethingElse: Int,
)
