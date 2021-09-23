package org.example;

public interface Simple<E> extends Iterable<E>{
    boolean add(E c);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);

}
