package Class11_Constructors;

/*
 In Java, a private constructor is a constructor that is declared with the private access modifier.
 This means that it cannot be accessed from outside the class, and it can only be called from within the class itself.
 Private constructors are often used in design patterns such as the Singleton pattern,
 where you want to restrict the instantiation of a class to a single instance.
*/


public class PrivateConstructorExample {
    private static PrivateConstructorExample instance;

    // Private constructor to prevent instantiation from outside the class
    private PrivateConstructorExample() {
        // Initialization code can go here
    }

    // Public method to provide access to the single instance of the class
    public static PrivateConstructorExample getInstance() {
        if (instance == null) {
            instance = new PrivateConstructorExample();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("This is a message from the singleton instance.");
    }

    public static void main(String[] args) {
        // Attempting to create an instance using the private constructor will result in a compilation error
        // PrivateConstructorExample obj = new PrivateConstructorExample(); // This line will cause an error
        // Instead, we use the getInstance method to get the single instance of the class

        PrivateConstructorExample singletonInstance = PrivateConstructorExample.getInstance();
        singletonInstance.displayMessage();
    }
}
