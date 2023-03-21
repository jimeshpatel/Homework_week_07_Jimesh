package javaprograms;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
public class Programme09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);                  // Declared a Scanner
        System.out.println("Enter any alphabet from A to F");  // For user to read
        String letter = scn.next();                            // User input data type
   /*
   letter.toUpperCase(Locale.forLanguageTag(letter));
   System.out.println(letter);
   */
        scn.close();                                           //Closing Scanner
        switch (letter.toUpperCase()) {    //Switch statement converting in upper if input in lowercase
            case "A":
                System.out.println("Your city name is Anand");
                break;
            case "B":
                System.out.println("Your city name is Baroda");
                break;
            case "C":
                System.out.println("Your city name is Chennai");
                break;
            case "D":
                System.out.println("Your city name is Dhwarka");
                break;
            case "E":
                System.out.println("Your city is Easter");
                break;
            case "F":
                System.out.println("Your city is Florentina");
                break;
            default:                                              //For all other inputs
                System.out.println("Invalid input");
        }
    }
}
