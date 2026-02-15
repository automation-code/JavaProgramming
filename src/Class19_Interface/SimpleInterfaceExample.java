package Class19_Interface;

/*
    An interface is a similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
    Interfaces cannot contain instance fields or constructors.
    They are used to specify a set of methods that a class must implement, without providing the implementation details.
    This allows for abstraction and multiple inheritance in Java.
 */

interface MyInterface {
    void myMethod(); // Method signature (abstract method)
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Hello from MyClass!");
    }
}

public class SimpleInterfaceExample {
    public static void main(String[] args) {
        // Create an instance of the class that implements the interface
        MyClass myObject = new MyClass();
        myObject.myMethod(); // Output: Hello from MyClass!
    }
}
