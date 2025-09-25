package de.aptcode.core.api.socket

import de.aptcode.core.api.utils.CallbackService

interface SocketInterface<T> {

    fun start(callbackInterface: CallbackService<T>)
    fun stop(callbackInterface: CallbackService<T>)
    fun listen(callbackInterface: CallbackService<T>)

}