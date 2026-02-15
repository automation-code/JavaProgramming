package Class21_Exceptions;

/*
  This class demonstrates the use of the 'throws' keyword in Java to indicate that a method may throw an exception.
  The 'throws' keyword is used in the method signature to declare that a method can throw one or more exceptions.
  This allows the caller of the method to handle the exception appropriately.
  In this example, we will create a method that throws an IOException, and we will use the 'throws' keyword to indicate this.
  We will also create a main method to call this method and handle the exception using a try-catch block.
  This example will help you understand how to use the 'throws' keyword to manage exceptions in Java effectively.
*/

public class ThrowsBlockExample {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
