package IfElsePractise.com;

public class OddOrEven {
    public static void main(String[] args) {

        // inter view qus 9123456 can you find odd or even


        int numbber = 9123456;


        int number = 0;
        String findEvenOdd = (number % 2 == 0) ? "Even" : "odd";
        System.out.println(findEvenOdd);

        if (number %2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}