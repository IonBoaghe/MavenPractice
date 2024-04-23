package Lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // 6.Write a Java program to merge two sorted arrays into a single sorted array.
        int[] array1 = {6, 3, 5, 7, 9};
        int[] array2 = {7, 4, 6, 8, 10};
        int[] arrayMerged = new int[array1.length + array2.length];
        int k = 0;
        // here we create an array with 10elements from 2 arrays with 5 elements
        for (int i = 0; i < array1.length; i++) {
            arrayMerged[k++] = array1[i];
            arrayMerged[k++] = array2[i];
        }

        //Sorting using collections method:

        //Arrays.sort(arrayMerged);
        //System.out.println("Sorted array from two other arrays is: " + Arrays.toString(arrayMerged));

        // Applied bubble sort, not the most efficient method for sorting, but in our case it's a good one
        for (int i = 0; i < arrayMerged.length - 1; i++) {
            for (int j = 0; j < arrayMerged.length - 1 - i; j++) {
                if (arrayMerged[j] > arrayMerged[j + 1]) {

                    int temp = arrayMerged[j];
                    arrayMerged[j] = arrayMerged[j + 1];
                    arrayMerged[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is:" + Arrays.toString(arrayMerged));
    }
}
