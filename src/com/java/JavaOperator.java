package com.java;

public class JavaOperator {
   // 5 types
  //
    public static void main(String[] args) {



        int a =30 ;
        int b = 10;
        int c = a/b;
        System.out.println(c);



        String firstName = "Mina";
        String lastName = "Raju";
        String fullName = firstName+lastName;
        System.out.println(fullName);


        String firstSemister = "1000";
        String secondSemister = "2000";
        String Final = firstSemister+"            "+ secondSemister;
        System.out.println(Final);


        int h= 1;
        int k = 1+1;
        System.out.println(k);


        h = 1;
        k = h++;
        System.out.println(k);

        int g = 20;
        int m = ++g;
        System.out.println(m);


        int o = 20;
        int p = ++g;
        System.out.println("pre increment = " + p);

        int x = 20;
        int y = g++;
        System.out.println("post increment = " + y);


        //relational operator
        // ==, >,<,<=, >=

        int y1 =10;
        int y2 = 10;
        System.out.println(y1>y2);

       // logical operator( &&, logical AND, logical or,logical not)
         int a1 = 10;
         int b1 = 20 ;
         int f1 = 30;
        System.out.println(a1> b1);

       // assignment operator
        // =, +=, -+, *=,/=

        int hello = 10;
        hello = 6;
        System.out.println(hello);

        int aa = 10;
        aa *= 10; // aa = aa+ 10
        System.out.println(aa);

    }
}
