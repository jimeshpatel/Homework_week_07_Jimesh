package javaprograms;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter sales id:");
        int id = scn.nextInt();
        System.out.println("Enter seller's name:");
        String name = scn.next();
        System.out.println("Enter sales amount:");
        float sale = scn.nextFloat();
        System.out.println("Enter basic salary:");
        float salary = scn.nextFloat();
        scn.close();
        float com;
        float gs;
        //gs = salary + com;
        if (sale >= 50000) {
            com = sale * 35 / 100;
            System.out.println("Commission is 35 % = " + com);
            System.out.println("Gross salary is = " + (salary + com));
        } else if (sale >= 30000 || sale <= 49999) {
            com = sale * 20 / 100;
            System.out.println("Commission is 20 % = " + com);
            System.out.println("Gross salary is = " + (salary + com));
        } else if (sale >= 20000 || sale <= 29999) {
            com = sale * 10 / 100;
            System.out.println("Commission is 10 %");
            System.out.println("Gross salary is = " + (salary + com));
        } else if (sale >= 10000 || sale <= 19999) {
            com = salary * 5 / 100;
            System.out.println("Commission is 5 %");
            System.out.println("Gross salary is = " + (salary + com));
        } else {
            com = sale * 2 / 100;
            System.out.println("Commission is 2 %");
            System.out.println("Gross salary is = " + (salary + com));
        }
    }
}