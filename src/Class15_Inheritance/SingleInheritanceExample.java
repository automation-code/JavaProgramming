package Class15_Inheritance;

/*
 Single Inheritance class (called the child or subclass) inherits from another class (called the parent or superclass).
 The child class can access the properties and methods of the parent class, allowing for code reuse and a hierarchical relationship between classes.
*/

class Dog {
    // Dog class inherits from Animal class
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the child class
        Dog dog = new Dog();

        // Access properties and methods from the parent class
        dog.bark(); // Method specific to Dog class
    }
}
