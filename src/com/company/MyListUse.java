package com.company;

import java.util.List;

public class MyListUse {
    public static void main(String[] args) {
        List cats = new MyList();

        cats.add("Simba");
        cats.add("Sema");
        cats.add("Puma");
        cats.add("feda");
        cats.add("bars");
        cats.add("masha");

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }

        System.out.println(" ");

        cats.remove("feda");

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }

        System.out.println(" ");

        System.out.println("MyList is empty? " + cats.isEmpty());

        System.out.println("Amount value in MyList: " + cats.size());

        System.out.println("MyList has this value? " + cats.contains("Ivs"));
    }
}
