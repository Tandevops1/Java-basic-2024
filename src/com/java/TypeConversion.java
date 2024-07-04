package com.java;

public class TypeConversion {


    //type competable another destional type
    // two process
    //widening - implicit type
    // narrowing explicit type

    public static void main(String[] args) {
     //widening
        byte a = 20;
        double b = a;
        System.out.println(b);

        int c  = 20;
        long d = c;
        System.out.println(c);

        byte m = 2;
        short n = m;
        System.out.println(m);

// narrowing

        long e = 2345678901l;
        float f = e;
        System.out.println(e);


        double x = 10;

        long y = (long) x;
        System.out.println(y);

    }





}
