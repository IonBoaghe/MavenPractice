package Home;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Enter two numbers to find the Maximum");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Let's define our conditions. If num1>num2 then condition=0, else if num1<num2 then condition=1, else condition=2

        int condition;

        if (num1 > num2){
            condition = 0;
        } else if (num1 < num2) {
            condition = 1;
        } else  {
            condition = 2;

            // We have prepared above conditions, let's use these to find the maximum between two number
        }
        switch (condition){
            case 0:
                System.out.println("Number 1 is maximum " + num1);
                break;
            case 1:
                System.out.println("Number 2 is maximum " + num2);
                break;
            case 2:
                System.out.println("Number " + num1 + "with number " + num2);

            default:
                System.out.println("Something went wrong, try again to introduce the numbers");
        }

    }
}
