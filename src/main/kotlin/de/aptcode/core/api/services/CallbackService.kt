package de.aptcode.core.api.services

interface CallbackService<T> {

    fun execute(result: T)
    fun error(error: String)

}