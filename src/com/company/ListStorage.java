package com.company;

import java.util.ArrayList;
import java.util.List;


public class ListStorage implements Storage {

    List<String> list = new ArrayList();

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public void add(String str) {
        list.add(str);
    }

    @Override
    public void del(int index) {
        list.remove(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    public void getAll() {
        for (String n : list)
            System.out.print(n + " ");
        System.out.println(" ");

    }
}

