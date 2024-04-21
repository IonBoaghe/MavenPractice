package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The program calculates the sum of all numbers from 1 to the number entered by the user");
        System.out.print("Number is: ");
        int num = Integer.parseInt(scanner.nextLine());

        int sum = (num * (num + 1)) / 2; // this is the simplest math operations that will calculate the sum of 1 to entered num by user
        System.out.println("Sum of all number is: " + sum);

    }
}

