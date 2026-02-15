package Class10_Objects;

/*
 Objects are instances of classes. They are created based on the blueprint provided by the class.
 An object can have its own state (attributes) and behavior (methods).
 In Java, you can create an object using the 'new' keyword followed by the class constructor
    Example:
        ClassName objectName = new ClassName();
    You can also have multiple objects of the same class, each with its own state.
    Example:
        ClassName object1 = new ClassName();
        ClassName object2 = new ClassName();
    Objects can interact with each other by calling methods and accessing attributes.
    They are fundamental to object-oriented programming (OOP) and allow for encapsulation, inheritance, and polymorphism.
 */

class Car {
    String make;
    String model;
    int year;

    // Constructor to initialize the attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to simulate starting the engine
    public void startEngine() {
        System.out.println("The " + make + " " + model + " engine has started.");
    }
}

public class ObjectsExample {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Accessing attributes of the object
        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);

        // Calling a method on the object
        myCar.startEngine();
    }
}
