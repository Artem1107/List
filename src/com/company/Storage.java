package com.company;

public interface Storage {

    String get(int index);

    void getAll();

    void add(String str);

    void del(int index);

    int size();


}

