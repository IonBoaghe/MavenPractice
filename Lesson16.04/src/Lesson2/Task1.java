package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner nr1 = new Scanner(System.in);
        System.out.println("Enter a number and find if it's a positive or negative number!");
        System.out.print("Number is: ");
        int number = Integer.parseInt(nr1.nextLine());

        if (number > 0) {
            System.out.println("Number " + number + " is positive"); // if entered nr is >0, output nr is positive
        }
        else if (number == 0) {
            System.out.println("Value 0 neither negative nor positive"); // if entered nr is =0, output exception
        }
        else {
            System.out.println("Number " + number + " is negative"); // if entered nr is <0, output nr is negative
        }
    }
}
