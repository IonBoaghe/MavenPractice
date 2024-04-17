package Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        System.out.println("Enter one year to check if it's a leap year or not");
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = Integer.parseInt(test.nextLine());

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year");
        }


    }
}
