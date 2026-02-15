package Class12_Methods;

/*
 Static methods are associated with the class rather than with any specific instance of the class.
 They can be called without creating an object of the class.
 Static methods are defined using the 'static' keyword and can only access static variables and other static methods directly.
 They cannot access instance variables or instance methods directly because they do not belong to any particular instance of the class.
*/


public class StaticMethodsExample {
    // Static method to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }

    // Static method to calculate the factorial of a number
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5;

        // Calling static methods without creating an instance of the class
        int squaredValue = StaticMethodsExample.square(num);
        int factorialValue = StaticMethodsExample.factorial(num);

        System.out.println("Square of " + num + " is: " + squaredValue);
        System.out.println("Factorial of " + num + " is: " + factorialValue);
    }
}
