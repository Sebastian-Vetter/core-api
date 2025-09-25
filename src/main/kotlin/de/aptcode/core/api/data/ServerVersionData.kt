package de.aptcode.core.api.data

import de.aptcode.core.api.utils.ServerTypes

data class ServerVersionData(
    val version: String,
    val serverType: ServerTypes,
    val downloadURL: String
)