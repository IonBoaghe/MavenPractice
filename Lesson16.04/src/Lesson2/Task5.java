package Lesson2;

public class Task5 {
    public static void main(String[] args) {
        String statement = "I love Java";
        System.out.println(statement);
        System.out.println("a. " + statement.charAt(4));
        System.out.println("b. " + statement.indexOf("J"));
        System.out.println("c. " + statement + "" + " and QA Automation");
        boolean isString = statement instanceof String;
        System.out.println("d. " + statement + ", is a type of string: " + isString);

    }
}
