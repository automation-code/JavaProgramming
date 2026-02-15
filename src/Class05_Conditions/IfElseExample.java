package Class05_Conditions;

/*
In Java, if-else statements are used to perform different actions based on different conditions.
The syntax of an if-else statement is as follows:

if (condition) {
    // code to be executed if the condition is true
} else {
    // code to be executed if the condition is false
}
 */

public class IfElseExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
