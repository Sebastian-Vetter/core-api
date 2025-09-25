package de.aptcode.core.api.worker

import de.aptcode.core.api.cloud.ServerTypes

data class ServerVersionData(
    val version: String,
    val serverType: ServerTypes,
    val downloadURL: String
)