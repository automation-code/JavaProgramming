package Class19_Interface;

/*
 Multiple interfaces allows a class to inherit the behavior of multiple types, which can be useful for creating flexible and reusable code.
 This is useful for creating flexible and reusable code, as it allows a class to be used in different contexts without being tied to a specific implementation.
*/

interface InterfaceA {
    int alpha = 100;
    void display();
}

interface InterfaceB {
    default void displayWithData() {
        System.out.println("Display with Data");
    }
}

public class MultipleInterfaceExample implements InterfaceA, InterfaceB {

    public void display() {
        System.out.println("This is display Method");
    }

    public static void main(String[] args) {
        MultipleInterfaceExample example = new MultipleInterfaceExample();
        example.display();
        // Output: This is display Method
        example.displayWithData();
        // Output: Display with Data
    }
}
