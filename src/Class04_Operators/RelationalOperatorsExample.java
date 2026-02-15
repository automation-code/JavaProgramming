package Class04_Operators;

/*
Relational operators in Java are used to compare two values.
They return a boolean value (true or false) based on the comparison.
The relational operators in Java include:

1. == (equal to): Checks if two values are equal.
2. != (not equal to): Checks if two values are not equal.
3. > (greater than): Checks if the left value is greater than the right value.
4. < (less than): Checks if the left value is less than the right value.
5. >= (greater than or equal to): Checks if the left value is greater than or equal to the right value.
6. <= (less than or equal to): Checks if the left value is less than or equal to the right value.
 */


public class RelationalOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Equal operator (a == b): " + (a == b));
        //Output: false
        System.out.println("Not-equal operator (a != b): " + (a != b));
        //Output: true
        System.out.println("Greater then (a > b): " + (a > b));
        //Output: false
        System.out.println("Less then (a < b): " + (a < b));
        //Output: true
        System.out.println("Greater and equal then (a >= b): " + (a >= b));
        //Output: false
        System.out.println("Less and equal then (a <= b): " + (a <= b));
        //Output: true
    }
}
