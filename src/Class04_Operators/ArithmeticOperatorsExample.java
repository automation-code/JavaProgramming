package Class04_Operators;

/*
Arithmetic operators in Java are used to perform basic mathematical operations. They include:
- Addition (+): Adds two operands.
- Subtraction (-): Subtracts the second operand from the first.
- Multiplication (*): Multiplies two operands.
- Division (/): Divides the first operand by the second. If both operands are integers, the result is an integer (truncated).
- Modulus (%): Returns the remainder of the division of the first operand by the second.
- Increment (++): Increases an integer value by 1.
- Decrement (--): Decreases an integer value by 1.
*/

public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);

        // Division
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);

        // Pre-increment
        ++a; // This will increment 'a' before using it
        System.out.println("Pre-increment: ++a results in a = " + a);

        // Post-increment
        a++; // This will use 'a' first and then increment it
        System.out.println("Post-Increment: a++ results in a = " + a);

        // Pre-decrement
        --b; // This will decrement 'b' before using it
        System.out.println("Pre-decrement: --b results in b = " + b);

        // Post-decrement
        b--; // This will use 'b' first and then decrement it
        System.out.println("Post-decrement: b-- results in b = " + b);
    }
}
