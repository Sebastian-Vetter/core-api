package de.aptcode.core.api.services

interface RepositoryService<Data, Key> {

    fun create(data: Data)
    fun delete(key: Key)
    fun get(key: Key)
    fun update(data: Data);

}