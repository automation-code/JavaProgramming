package Class04_Operators;

/*
Bitwise operators in Java are used to perform bit-level operations on integer types (byte, short, int, long).
They operate on the individual bits of the operands. The main bitwise operators in Java are:
1. Bitwise AND (&): This operator performs a logical AND operation on each pair of corresponding bits of the operands.
The result is 1 if both bits are 1, otherwise it is 0.

2. Bitwise OR (|): This operator performs a logical OR operation on each pair of corresponding bits of the operands.
The result is 1 if at least one of the bits is 1, otherwise it is 0.

3. Bitwise XOR (^): This operator performs a logical exclusive OR operation on each pair of corresponding bits of the operands.
The result is 1 if the bits are different, otherwise it is 0.

4. Bitwise NOT (~): This operator performs a logical NOT operation on each bit of the operand.
The result is 1 if the bit is 0, and 0 if the bit is 1.

5. Left Shift (<<): This operator shifts the bits of the left operand to the left by the number of positions specified by the right operand.
The vacated bits on the right are filled with zeros.

6. Right Shift (>>): This operator shifts the bits of the left operand to the right by the number of positions specified by the right operand.
The vacated bits on the left are filled with the sign bit (0 for positive numbers and 1 for negative numbers).

7. Unsigned Right Shift (>>>): This operator shifts the bits of the left operand to the right by the number of positions specified by the right operand.
The vacated bits on the left are filled with zeros, regardless of the sign of the number.
 */


public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        int a = 5;  // In binary: 0101
        int b = 3;  // In binary: 0011

        // Bitwise AND
        System.out.println("Bitwise AND (a & b): " + (a & b)); // Output: 1 (0001)

        // Bitwise OR
        System.out.println("Bitwise OR (a | b): " + (a | b)); // Output: 7 (0111)

        // Bitwise XOR
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // Output: 6 (0110)

        // Bitwise NOT
        System.out.println("Bitwise NOT (~a): " + (~a)); // Output: -6 (in binary: 1010)

        // Left Shift
        System.out.println("Left Shift (a << 1): " + (a << 1)); // Output: 10 (1010)

        // Right Shift
        System.out.println("Right Shift (a >> 1): " + (a >> 1)); // Output: 2 (0010)

        // Unsigned Right Shift
        System.out.println("Unsigned Right Shift (a >>> 1): " + (a >>> 1)); // Output: 2 (0010)
    }
}
