package javaprograms;

import java.util.Scanner;

/**
 * **
 * 10.Write a java program to input any two number and ask user to enter their symbol
 * (+,-,/,*) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = s.nextInt();
        System.out.println("Enter the symbol you want(+, -, *, /) : ");
        char ch = s.next().charAt(0);
        if (ch == '+') {
            System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Subtraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("Division of " + num1 + " / " + num2 + " = " + (num1 / num2));
        }
        s.close();
    }
}