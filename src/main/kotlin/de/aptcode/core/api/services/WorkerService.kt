package de.aptcode.core.api.services

import de.aptcode.core.api.data.ServerVersionData

interface WorkerService {
    // Class parameters
    val workerId: String
    val ip: String
    val port: Int
    val token: String
    var ram: Int
    val serverVersionsInstalled: List<ServerVersionData>

    // Methods of a worker
    fun connect()
    fun disconnect()
    fun startServer()
    fun stopServer()
    fun isOnline()
}