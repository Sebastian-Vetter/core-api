package de.aptcode.coreapi.utlis;

public interface Callback<T> {

    void subscribe(T done);
    void exception(Exception e);

}
