package com.code;

public interface MyList<E>  {
    void addElement(E element);
    void add(int index, E element);

    E remove(int index);

    int size();

    E cloneN();

    boolean contains(E e);

    int indexOf(E e);

    int lastIndexOf();

    boolean add(E e);

    void ensureCapacity(int minCapacity);

    E get(int i);

    void clear();


}
