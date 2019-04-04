package com.code;
//import java.lang.Object;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elments;
    //Constructor

    public MyArrayList() {
        elments = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size) {
        this.size = size;
        elments = (E[]) new Object[size];
    }

    @Override
    public void addElement(E element) {
        ensureCapacity(size);
        elments[size] = element;
        size++;
    }

    @Override
    public void add(int index, E element) {
        ensureCapacity(size);
//        if (add(element)){
        if (index <= lastIndexOf()){
            for (int i=lastIndexOf();i>=index;i--){
                elments[i+1] = elments[i];
            }
            elments[index] = element;
            size++;
        }else {
            elments[index] = element;
            size++;
        }

//        }
    }

    @Override
    public E remove(int index) {
        if (index>=0 && index<lastIndexOf()){
            for (int i=index-1;i<lastIndexOf();i++){
                elments[i] = elments[i+1];
            }
            elments[lastIndexOf()] = null;
            size--;
            return elments[index];
        }else{
            return null;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E cloneN() {
        return null;
    }

    @Override
    public boolean contains(E e) {
        //Case 1:
        for (int i=0;i<size;i++){
            if (elments[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        for (int i=0; i<size;i++){
            if (elments[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf() {
        for (int i=elments.length-1;i>0;i--){
            if (elments[i] != null){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean add(E e) {
        return size < elments.length;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        if (size > elments.length){
            //Case 1
//            E[] newElement = (E[]) new Object[2*elments.length+1];
//            System.arraycopy(elments,0,newElement,0,size);
//            elments = newElement;
            //Case 2
            int newSize = 2*elments.length + 1;
            elments = Arrays.copyOf(elments,newSize);
        }
    }

    @Override
    public E get(int i) {
        if (i >=0 && i<= lastIndexOf()){
            return elments[i];
        }else {
            return null;
        }
    }

    @Override
    public void clear() {
    elments = (E[]) new Object[DEFAULT_CAPACITY];
    size = 0;
    }
}
