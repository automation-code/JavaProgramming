package Class07_Blocks;

/*
In Java, a block is a group of statements enclosed in curly braces {}.
Blocks are used to define the scope of variables and to group statements together.

There are several types of blocks in Java:
1. Local Block: A local block is a block of code that is defined within a method.
It can contain variable declarations and statements, and the variables declared within a local block are only accessible within that block.

2. Static Block: A static block is a block of code that is executed when the class is loaded.
It is used to initialize static variables or to perform any setup that needs to be done before the class is used.

3. Instance Block: An instance block is a block of code that is executed when an instance of a class is created.
It is used to initialize instance variables or to perform any setup that needs to be done when an object is created.
 */

public class LocalBlockExample {
    public static void main(String[] args) {
        // Local block within the main method
        {
            int x = 10; // This variable is only accessible within this block
            System.out.println("Value of x in local block: " + x);
        }

        // The following line would cause a compile-time error because x is not accessible outside the block
        // System.out.println(x); // Uncommenting this line will cause an error
    }
}
