package de.aptcode.core.api.socket

import com.google.gson.JsonObject
import de.aptcode.core.api.worker.Events

data class SocketMessageData(
    val event: Events,
    val data: JsonObject,
    val token: String
)