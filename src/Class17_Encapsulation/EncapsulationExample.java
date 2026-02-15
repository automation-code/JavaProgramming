package Class17_Encapsulation;

/*
 Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP).
 It refers to the bundling of data (variables) and methods (functions) that operate on the data into a single unit, typically a class.
 Encapsulation helps to protect the internal state of an object from unauthorized access and modification,
 ensuring that the object's data is accessed and modified only through well-defined interfaces (methods).

 Key features of encapsulation include:
    Data Hiding: Encapsulation allows you to hide the internal state of an object from the outside world.
    This is typically achieved by declaring the class variables as private and providing public getter and setter methods to access and modify the variables.

    Improved Security: By controlling access to the internal state of an object, encapsulation helps to prevent unintended interference and misuse of the object's data.
    This can lead to more secure and robust code, as it reduces the chances of accidental or malicious modifications to the object's state.

    Modularity: Encapsulation promotes modularity by allowing you to change the internal implementation of a class without affecting the code that uses the class.
    As long as the public interface remains unchanged, you can modify the internal workings of the class without breaking the code that relies on it.

    Easier Maintenance: Encapsulation makes it easier to maintain and update code.
    Since the internal state of an object is hidden, you can make changes to the implementation without affecting other parts of the codebase that interact with the object.
    This can lead to faster development and easier debugging, as you can isolate and fix issues within the class without worrying about unintended consequences on other parts of the codebase.

 Encapsulation is a powerful concept in OOP that helps to create more secure, modular, and maintainable code by controlling access to the internal state of objects
 and providing well-defined interfaces for interacting with them.
*/

class Person {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();

        // Set the person's name and age using setter methods
        person.setName("Alice");
        person.setAge(30);

        // Get the person's name and age using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
