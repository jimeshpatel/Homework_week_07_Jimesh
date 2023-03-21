package javaprograms;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme01 {
    public static void main(String[] args) {    // main method
        Scanner s = new Scanner(System.in);  // declare a scanner
        System.out.println("Enter number");
        int number = s.nextInt();
        String msg = (number % 2 == 0) ? "This number is even" : "This number is odd";
        System.out.println(msg);
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter number");
//        int number1 = s.nextInt();
//        String result = number1 % 2 == 0 ? "Even" : "Odd";
//        System.out.println(number1 + " is " + result);
        s.close();
    }
}
