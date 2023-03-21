package javaprograms;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        int[] numbers = new int[]{15, 25, 45, 65, 85, 90};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        System.out.println("Sum value of an array: " + sum);
    }
}
