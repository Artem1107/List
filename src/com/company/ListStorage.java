package com.company;

import java.util.*;


public class ListStorage implements Storage {

    List<String> list = new ArrayList();
int index = 0;
    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public void add(String str) {
        list.add(str);

    }
}
