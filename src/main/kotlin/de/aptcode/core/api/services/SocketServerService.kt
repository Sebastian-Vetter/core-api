package de.aptcode.core.api.services

interface SocketServerService<T> {

    fun start(callbackInterface: CallbackService<T>)
    fun stop(callbackInterface: CallbackService<T>)
    fun listen(callbackInterface: CallbackService<T>)

}