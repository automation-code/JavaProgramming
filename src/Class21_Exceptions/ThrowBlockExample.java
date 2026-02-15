package Class21_Exceptions;

/*
 Throw block is used to throw an exception explicitly from a method or a block of code.
 It allows you to create and throw your own exceptions based on specific conditions.
*/

public class ThrowBlockExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
