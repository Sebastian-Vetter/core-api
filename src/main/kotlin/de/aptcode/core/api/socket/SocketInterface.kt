package de.aptcode.core.api.socket

import de.aptcode.core.api.utils.CallbackInterface

interface SocketInterface<T> {

    fun start(callbackInterface: CallbackInterface<T>)
    fun stop(callbackInterface: CallbackInterface<T>)
    fun listen(callbackInterface: CallbackInterface<T>)

}