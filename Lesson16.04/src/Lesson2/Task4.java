package Lesson2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);

        System.out.println("Input the 5 numbers: ");

        int number1 = Integer.parseInt(scan1.nextLine());
        int number2 = Integer.parseInt(scan2.nextLine());
        int number3 = Integer.parseInt(scan3.nextLine());
        int number4 = Integer.parseInt(scan4.nextLine());
        int number5 = Integer.parseInt(scan5.nextLine());

        int sum = number1 + number2 + number3 + number4 + number5;
        System.out.println("The sum of 5 no is: " + sum);

        double average = (number1 + number2 + number3 + number4 + number5) / 5;
        System.out.println("The average is: " + average);
    }
}
