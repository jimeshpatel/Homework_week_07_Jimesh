package javaprograms;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme20 {
    public static void main(String[] args) {
        int[] array = {1996, 1997, 1998, 1999, 2001, 2005, 2021};
        System.out.println(contains(array, 2005));
        System.out.println(contains(array, 2013));
    }

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}
