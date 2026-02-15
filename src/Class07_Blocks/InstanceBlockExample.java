package Class07_Blocks;

/*
instance block is a block of code that is executed when an instance of a class is created.
It is defined within a class but outside of any method or constructor.
The instance block is executed before the constructor is called, and it can be used to initialize
instance variables or perform any setup that is required for the object.
The syntax of an instance block is as follows:

{
    // code to be executed when an instance is created
}
 */

public class InstanceBlockExample {
    // Instance variable
    int instanceVariable;

    // Instance block
    {
        instanceVariable = 10;
        // Initializing the instance variable
        System.out.println("Instance block executed. Instance variable initialized to: " + instanceVariable);
    }

    // Constructor
    public InstanceBlockExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        InstanceBlockExample example = new InstanceBlockExample();
    }
}
