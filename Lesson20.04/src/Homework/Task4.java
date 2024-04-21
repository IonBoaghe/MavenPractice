package Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number to find his factorial result");
        System.out.print("Number is: ");


        int number = Integer.parseInt(scanner.nextLine());
        int result =1;

        //condition - let's consider that user have inserted the number 5
        // result =1 after check it will 1*2 result =2 after check it will 2*3 result = 6 ....
        for (int i=2; i <= number; i++){
            result = result* i;
        }
        System.out.println("Factrorial of number " + number + " is: " +result);
    }

}








