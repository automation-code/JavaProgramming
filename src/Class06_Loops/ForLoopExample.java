package Class06_Loops;

/*
For loop in Java is a control flow statement that allows you to execute a block of code a specified number of times.
It consists of three parts: initialization, condition, and increment/decrement.
The syntax of a for loop is as follows:

for (initialization; condition; increment/decrement) {
    // code to be executed
}
 */

public class ForLoopExample {
    public static void main(String[] args) {
        // Using for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Using for loop to calculate the factorial of a number
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // factorial = factorial * i
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
