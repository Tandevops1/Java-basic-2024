package com.java;

public class DoWhileLoops {

    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println(counter < 5);
            counter++;
        } while (counter <= 5);
    }
}