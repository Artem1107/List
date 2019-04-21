package com.company;

import java.util.List;

public class MyListUse {
    public static void main(String[] args) {
        List cats = new MyList();
        cats.add("Simba");
        cats.add("Sema");
        cats.add("Puma");
        System.out.println(cats.isEmpty());
        System.out.println("Amount value in MyList: "+cats.size());
        System.out.println(cats.contains("Ivs"));
    }
}
