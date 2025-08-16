package de.aptcode.coreapi.repositories;

import java.util.Optional;

/*
Repository interface for all data objects.
You will need a key to get data.
 */

public interface RepositoryInterface<Key, Data> {

    //get Optional<data>
    Optional<Data> get(Key key);

    //create data
    void create(Data data);

    //update data
    void update(Data data);

    //delete data
    void delete(Data data);

}
