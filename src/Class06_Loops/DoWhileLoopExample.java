package Class06_Loops;

/*
A do-while loop is a control flow statement that executes a block of code at least once
and then repeatedly executes the block as long as a specified condition is true.
The syntax of a do-while loop is as follows:

do {
    // block of code to be executed
} while (condition);
 */

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
    }
}
