package Lesson4;

public class Task4 {
    public static void main(String[] args) {
        int [] array = {1,3,6,8,5};

        // 4.Write a Java program to calculate the average of all elements in an integer array.
        int sum=0;
        double average;

        // calculate the sum of array
        for (int i=0; i<array.length; i++){
            sum += array[i];

        }
        System.out.println("Sum of array is: " + sum);

        // calculate the average of array
        average = (double) sum / array.length;
        System.out.println("Average is: " + average);
    }
}
