package Class11_Constructors;

/*
 Parameterized constructor allows us to create objects of the class with specific values for the attributes.
 We define parameters that are used to initialize the attributes of the class when an object is created.
 This allows us to create objects with different initial values, providing flexibility and convenience.
*/

public class ParameterizedConstructorExample {
    String name;
    int age;

    // Parameterized constructor
    public ParameterizedConstructorExample(String name, int age) {
        this.name = name; // 'this' keyword is used to refer to the current object's attributes
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        ParameterizedConstructorExample person1 = new ParameterizedConstructorExample("Alice", 30);
        ParameterizedConstructorExample person2 = new ParameterizedConstructorExample("Bob", 25);

        // Displaying information of the created objects
        person1.displayInfo();
        person2.displayInfo();
    }
}
