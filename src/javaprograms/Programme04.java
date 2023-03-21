package javaprograms;

import java.util.Scanner;

/**
 * Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,  otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400. Example of input/Output:
 * isLeapYear(-1600); should return false since the parameter is not in the range(1-9999) ● isLeapYear(1600);  should return true since 1600 is a leap year
 * isLeapYear(2017);  should return false since 2017 is not a leap year
 * isLeapYear(2000); should return true because 2000 is a leap year
 */
public class Programme04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a month number");
        int month = scn.nextInt();
        System.out.println("Enter a year");
        int year = scn.nextInt();
        System.out.println(getDaysInMonth(month, year));
        scn.close();
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Invalid value entered.");
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Is a Leap Year.");
            return true;
        } else {
            System.out.println("Is Not a Leap Year.");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            System.out.println(month + " is invalid month, it should be between 1 to 12");
            System.exit(0);
            return -1;
        } else {
            switch (month) {
                case 1:
                    System.out.println("January month have 31 days");
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        System.out.println("February month have 29 days");
                    } else {
                        System.out.println("February month have 28 days");
                    }
                    break;
                case 3:
                    System.out.println("March month have 31 days");
                    break;
                case 4:
                    System.out.println("April month have 30 days");
                    break;
                case 5:
                    System.out.println("May month have 31 days");
                    break;
                case 6:
                    System.out.println("June month have 30 days");
                    break;
                case 7:
                    System.out.println("July month have 31 days");
                    break;
                case 8:
                    System.out.println("August month have 31 days");
                    break;
                case 9:
                    System.out.println("September month have 30 days");
                    break;
                case 10:
                    System.out.println("October month have 31 days");
                    break;
                case 11:
                    System.out.println("November month have 30 days");
                    break;
                case 12:
                    System.out.println("December month have 31 days");
                    break;
            }
        }
        if (year < 1 || year > 9999) {
            System.out.println(year + " is not valid year");
            return -1;
        }
        return 1;
    }
}
