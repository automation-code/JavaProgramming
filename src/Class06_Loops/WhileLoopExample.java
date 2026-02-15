package Class06_Loops;

/*
While loop in Java is a control flow statement that allows code to be executed repeatedly based on a given boolean condition.
The while loop will continue to execute the block of code as long as the condition remains true.
The syntax of a while loop is as follows:

while (condition) {
    // code to be executed
}
 */

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        // Using while loop to print numbers from 1 to 5
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // Incrementing the count variable
        }

        // Using while loop to calculate the sum of first 10 natural numbers
        int sum = 0;
        int number = 1;

        while (number <= 10) {
            sum += number; // Adding the current number to the sum
            number++; // Incrementing the number variable
        }

        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}
