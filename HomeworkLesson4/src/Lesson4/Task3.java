package Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        // .Write a Java program to find the intersection of two arrays (common elements).
        int[] array1 = {1, 5, 7, 8, 2};
        int[] array2 = {2, 9, 3, 8, 7};
        int j;
        int i;
        System.out.print("Common elements are: ");

        // in this method we will check first element from array1 to all elements from array 2
        //when program will find that array[i] == array[j] then we go out from loop and display
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + ",");
                    break;
                }

            }
        }
    }
}
