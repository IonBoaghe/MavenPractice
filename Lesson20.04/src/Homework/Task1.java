package Homework;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter the (M/F) to find the gender!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

                switch (input.toUpperCase()) {   //used toUpperCase -> this will convert characters to upper cases
            case "M":
                System.out.println("Gender is: Male");
                break;

            case "F":
                System.out.println("Gender is: Female");
                break;

            default:
                System.out.println("Try again, you haven't entered the right character, to find the gender write f/F for Female and m/M for Male");

        }

    }
}
