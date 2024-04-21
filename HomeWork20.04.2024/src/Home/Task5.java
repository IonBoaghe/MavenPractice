package Home;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired number to find his multiplication table!");
        System.out.print("Number is: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i=1; i <= 10; i++){

            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}