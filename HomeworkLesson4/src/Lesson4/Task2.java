package Lesson4;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        Integer []array = {2, 6, 4, 8, 10, 7};
        System.out.println("Default array is: " + Arrays.toString(array));

        // Task 1, I utilized conditional statements to determine the reversed array.
        // In Task 2, I explored the Java Collections framework, which offers simplified solutions, to sort ascending and descending

        Arrays.sort(array);
        System.out.println("Sorting ascending array is: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorting descending array is: " + Arrays.toString(array));

    }
}
