package com.company;



public class Main {


    public static void main(String[] args) {

        Storage x = new ListStorage();
        int i = 0;
        while (i < 10) {
x.add("ffffff"+i);
            System.out.println(x.get(i));
            i++;

        }
    }}



