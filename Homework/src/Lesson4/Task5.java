package Lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //5.Write a Java program to search for a specific element in an array and return its index.
        int []array = {2,4,6,8,1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the specific element from above array to find his index!");
        System.out.print("Element is: ");
        int element = Integer.parseInt(scanner.nextLine());
        int index =1;

        for (int i=0; i< array.length; i++){
            if (element == array[i]){
                index = i;
                break;
            }
        }
        System.out.println("For the element: " + element + "the index is: " + index);
    }
}
