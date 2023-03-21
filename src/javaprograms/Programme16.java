package javaprograms;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a number: ");
        int A = s.nextInt();
        if (A > 0) {
            System.out.println("Number is positive");
        } else if (A < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
