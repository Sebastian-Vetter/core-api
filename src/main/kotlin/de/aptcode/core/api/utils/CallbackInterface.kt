package de.aptcode.core.api.utils

interface CallbackInterface<T> {

    fun execute(result: T)
    fun error(error: String)

}