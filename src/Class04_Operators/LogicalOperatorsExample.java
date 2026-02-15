package Class04_Operators;

/*
Logical operators in Java are used to perform logical operations on boolean values.
They are typically used in conditional statements and loops to control the flow of the program based on certain conditions.
The main logical operators in Java are:

1. Logical AND (&&): This operator returns true if both operands are true, and false otherwise.
2. Logical OR (||): This operator returns true if at least one of the operands is true, and false if both operands are false.
3. Logical NOT (!): This operator returns true if the operand is false, and false if the operand is true. It is a unary operator, meaning it only operates on one operand.
4. Logical XOR (^): This operator returns true if exactly one of the operands is true, and false if both operands are true or both operands are false.
5. Logical NAND: This operator returns false if both operands are true, and true otherwise.
6. Logical NOR: This operator returns true if both operands are false, and false otherwise.
7. Logical XNOR: This operator returns true if both operands are the same (both true or both false), and false if they are different.
 */


public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        System.out.println("Logical AND (&&):");
        System.out.println("a && b: " + (a && b)); // false

        // Logical OR
        System.out.println();
        System.out.println("Logical OR (||):");
        System.out.println("a || b: " + (a || b)); // true

        // Logical NOT
        System.out.println();
        System.out.println("Logical NOT (!):");
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true

        // Logical XOR
        System.out.println();
        System.out.println("Logical XOR (^):");
        System.out.println("a ^ b: " + (a ^ b)); // true

        // Logical NAND
        System.out.println();
        System.out.println("Logical NAND:");
        System.out.println("!(a && b): " + !(a && b)); // true

        // Logical NOR
        System.out.println();
        System.out.println("Logical NOR:");
        System.out.println("!(a || b): " + !(a || b)); // false

        // Logical XNOR
        System.out.println();
        System.out.println("Logical XNOR:");
        System.out.println("!(a ^ b): " + !(a ^ b)); // false
    }
}
