package de.aptcode.core.api.repository

interface Repository<Data, Key> {

    fun create(data: Data)
    fun delete(key: Key)
    fun get(key: Key)
    fun upload(data: Data);

}