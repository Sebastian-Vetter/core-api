package de.aptcode.core.api.utils

interface CallbackService<T> {

    fun execute(result: T)
    fun error(error: String)

}