package Class07_Blocks;

/*
In Java, a static block (also known as a static initialization block) is a block of code that is executed when the class is loaded into memory.
It is used to initialize static variables or perform any setup that is required before the class can be used.
A static block is defined using the static keyword and is executed only once, when the class is first loaded.
The syntax of a static block is as follows:

static {
    // code to be executed when the class is loaded
}
 */


public class StaticBlockExample {
    static int staticVariable;

    // Static block to initialize the static variable
    static {
        staticVariable = 10;
        System.out.println("Static block executed. Static variable initialized to: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed. Static variable value: " + staticVariable);
    }
}
