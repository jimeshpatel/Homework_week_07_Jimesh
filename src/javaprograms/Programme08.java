package javaprograms;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 */
public class Programme08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any alphabet between \"A\" and \"F\"");
        String city = s.next();
        s.close();

        if (city.equals("A")) {
            System.out.println("City is Anand");
        } else if (city.equals("B")) {
            System.out.println("City is Baroda");
        } else if (city.equals("C")) {
            System.out.println("City is California");
        } else if (city.equals("D")) {
            System.out.println("City is Detroit");
        } else if (city.equals("E")) {
            System.out.println("City is Edmonton");
        } else if (city.equals("F")) {
            System.out.println("City is Florida");
        } else {
            System.out.println("Input is invalid");
        }
    }
}
