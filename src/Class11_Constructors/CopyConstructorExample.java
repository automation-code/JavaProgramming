package Class11_Constructors;

/*
 Copy constructor is a special type of constructor that creates a new object as a copy of an existing object.
 It takes an object of the same class as a parameter and initializes the new object's attributes with the values from the existing object.
*/


public class CopyConstructorExample {
    int id;
    String name;

    // Default constructor
    public CopyConstructorExample() {
        this.id = 0;
        this.name = "Default Name";
    }

    // Parameterized constructor
    public CopyConstructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    public CopyConstructorExample(CopyConstructorExample obj) {
        this.id = obj.id;
        this.name = obj.name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        CopyConstructorExample original = new CopyConstructorExample(1, "Original Object");

        // Creating a new object using the copy constructor
        CopyConstructorExample copy = new CopyConstructorExample(original);

        // Displaying both objects
        System.out.println("Original Object:");
        original.display();

        System.out.println("Copy Object:");
        copy.display();
    }
}
