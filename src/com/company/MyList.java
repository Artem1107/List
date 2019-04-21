package com.company;



import java.util.*;

class MyList implements List {

private Object array[] = new Object[15];
private  int size = 0;
Object value;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size!=0)
        return false;
        else return true;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++)
           if (array[i] == o)
                return true;
            return false;

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if(array.length <= size){
            int newValue = array.length*2;
            Object[] newArray = new Object[newValue];
            for(int i = 0; i < size; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = o;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
if (array.length>=index)
    value = array[index];
    return value;

    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
