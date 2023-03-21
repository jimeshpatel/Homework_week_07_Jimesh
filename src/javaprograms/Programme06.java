package javaprograms;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = s.nextInt();
        s.close();
        if (number % 2 == 0) {
            System.out.println("It is even number.");
        } else {
            System.out.println("It is odd number.");
        }
    }
}
