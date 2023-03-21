package javaprograms;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format.
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = s.nextLine();
        System.out.println("Enter your roll no.: ");
        int rollno = s.nextInt();
        System.out.println("Enter Maths Marks: ");
        int maths = s.nextInt();
        if (maths > 100 || maths < 0) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter English Marks: ");
        int english = s.nextInt();
        if (english > 100 || english < 0) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter Science Marks :");
        int science = s.nextInt();
        if (science > 100 || science < 0) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        s.close();
        int total = maths + science + english;
        int per = (total / 3);
        String result;

        System.out.println("+------------------------------+");
        System.out.println("|                              |");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|                              |");
        System.out.println(" ------------------------------ ");
        System.out.println("|   Name      : " + name + "         |");
        System.out.println("|   Roll No.  : " + rollno + "             |");
        System.out.println("|                              |");
        System.out.println("|------------------------------|");
        System.out.println("|   Subjects  : Marks          |");
        System.out.println("|------------------------------|");
        System.out.println("|   Maths     : " + maths + "             |");
        System.out.println("|   Science   : " + science + "             |");
        System.out.println("|   English   : " + english + "             |");
        System.out.println("|                              |");
        System.out.println("|------------------------------|");
        System.out.println("|   Total     : " + total + "            |");
        System.out.println("|------------------------------|");
        System.out.println("|   Percentage: " + per + "             |");
        if (per >= 35 && maths >= 35 && science >= 35 && english >= 35) {
            System.out.println("|   Result    : Pass           |");
        } else {
            System.out.println("|   Result    : Fail           |");
        }
        if (per >= 80) {
            System.out.println("|   Grade     : A+             |");
        } else if (per >= 60 && per < 80) {
            System.out.println("|   Grade     : A              |");
        } else if (per >= 50 && per < 60) {
            System.out.println("|   Grade     : B              |");
        } else if (per >= 35) {
            System.out.println("|   Grade     : C              |");
        } else if (per < 35) {
            System.out.println("|   Grade     : N/A            |");
        }
        System.out.println("|                              |");
        System.out.println("+------------------------------+");
    }
}
