package de.aptcode.coreapi.repository;

import java.util.Optional;

/*
    Repository interface for all data objects.
    You will need a key to get data.
 */

public interface RepositoryInterface<Key, DataType> {

    //get Optional<DataType> from database and load in cache if there is no cache. Return Data
    Optional<DataType> get(Key key);

    //create data in cache
    void create(DataType dataType);

    //update data; use data from cache and upload it to database
    void update(DataType dataType);

    //delete data from cache and from database
    void delete(DataType dataType);

    //caching
    void cache(DataType dataType);

}
