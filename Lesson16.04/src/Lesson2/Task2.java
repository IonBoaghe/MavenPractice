package Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Enter 3 numbers to define which is the greatest number!");

        System.out.print("First number is: ");
        int number1 = Integer.parseInt(scan1.nextLine());

        System.out.print("Second number is: ");
        int number2 = Integer.parseInt(scan2.nextLine());

        System.out.print("Third number is: ");
        int number3 = Integer.parseInt(scan3.nextLine());

        int result;                                          // let's define "result" as int variable for greatest number
        result = Math.max(number1, number2);                 // in "result" we store max between number1 and number2
        result = Math.max(result, number3);                  // then result will take the greatest value between number3 and number1,2

        System.out.println("The greatest number is: " + result); // output the greatest number

     /*   alternative method to identify the greatest number
        int result = number1;
        if (number1 < number2){
            result = number2;
        }
        if (result < number3){
            result = number3;
        }
        System.out.println(result); */
    }
}

