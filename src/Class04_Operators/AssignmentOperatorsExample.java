package Class04_Operators;

/*
Assignment operators in Java are used to assign values to variables.
They include the basic assignment operator (=) and compound assignment operators (+=, -=, *=, /=, %=).
These operators perform an operation and then assign the result back to the variable.
 */


public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int a = 10; // Basic assignment
        System.out.println("Initial value of a: " + a);

        a += 5; // Equivalent to a = a + 5
        System.out.println("After a += 5: " + a);

        a -= 3; // Equivalent to a = a - 3
        System.out.println("After a -= 3: " + a);

        a *= 2; // Equivalent to a = a * 2
        System.out.println("After a *= 2: " + a);

        a /= 4; // Equivalent to a = a / 4
        System.out.println("After a /= 4: " + a);

        a %= 3; // Equivalent to a = a % 3
        System.out.println("After a %= 3: " + a);
    }
}
