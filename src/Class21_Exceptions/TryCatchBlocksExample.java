package Class21_Exceptions;

/*
 Try-catch blocks are used to handle exceptions in Java.
 They allow you to write code that can gracefully handle errors without crashing the program.
 The try block contains code that may throw an exception, while the catch block contains code that handles the exception if it occurs.

 Here's a simple example of using try-catch blocks in Java:
    public class TryCatchBlocksExample {
        public static void main(String[] args) {
            try {
                int result = 10 / 0; // This will throw an ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
*/


public class TryCatchBlocksExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
