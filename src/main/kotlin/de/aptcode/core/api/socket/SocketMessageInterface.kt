package de.aptcode.core.api.socket

import com.google.gson.JsonObject
import de.aptcode.core.api.worker.WorkerEvents

interface WorkerSocketMessageInterface {
    val event: WorkerEvents
    val data: JsonObject
    val token: String
}

interface CoreSocketMessageInterface {
    val event: WorkerEvents
    val data: JsonObject
}