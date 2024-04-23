package Lesson4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] array = {2, 4, 6, 8, 10};
        System.out.println("Default array is: " + Arrays.toString(array));

        int a = 0;
        int [] reverse = new int[array.length];

        for (int i = array.length - 1; i >= 0 ;i--) {
            reverse[a] = array[i];
            a++;
        }
        System.out.println("Reverse array is: " + Arrays.toString(reverse));
    }
}
