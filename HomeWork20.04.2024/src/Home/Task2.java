package Home;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter first number and one of the '+' or '-' or '*' or '/' operator and then the second number");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double result;

        switch (operator){
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result is: " + result);
                break;

            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result is: " + result);
                break;

            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result is: " + result);
                break;

            case '/':
                result = firstNumber / secondNumber;
                System.out.println("Result is: " + result);

            default:
                System.out.println("Try again, probably you haven't enter required values and program can't calculate it");

        }

    }
}
