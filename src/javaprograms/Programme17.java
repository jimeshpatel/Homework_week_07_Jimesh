package javaprograms;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {
    public static void main(String[] args) {
        int A [] ={400, 500, 300, 600, 800};
        String name []= {"Java", "Python","PHP","C#","C Programme"};
        // System.out.println(A[1]);
        //System.out.println(name[4]);
        System.out.println("Original numeric array : "+ Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Sorted numeric array : "+Arrays.toString(A));


        System.out.println("Original string array : "+Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted string array : "+ Arrays.toString(name));
    }
}
