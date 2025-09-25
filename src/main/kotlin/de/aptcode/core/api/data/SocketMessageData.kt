package de.aptcode.core.api.data

import com.google.gson.JsonObject
import de.aptcode.core.api.events.Events

data class SocketMessageData(
    val event: Events,
    val data: JsonObject,
    val token: String
)