package Class13_Keywords;

/*
 The "super" keyword in Java is used to refer to the immediate parent class of a subclass.
 It can be used to access members (fields and methods) of the parent class, as well as to call the parent class's constructor.

 Here are some common uses of the "super" keyword:
    1. Accessing Parent Class Members: You can use "super" to access fields and methods of the parent class that are hidden by the subclass.

    2. Calling Parent Class Constructor: You can use "super()" to call the constructor of the parent class from the subclass constructor.
    This is often used to initialize the parent class's fields before initializing the subclass's fields.

    3. Overriding Methods: When a subclass overrides a method from the parent class,
    you can use "super" to call the overridden method from the parent class within the subclass's method.

    4. Accessing Parent Class's Static Members: You can also use "super" to access static members of the parent class,
    although it's more common to access static members using the class name.
 */


class Animal{
    void animalSound(String sound){
        System.out.println("The animal makes a sound: " + sound);
    }
}

public class SuperKeywordExample extends Animal{
    SuperKeywordExample(){
        super(); // Calling the parent class constructor
    }

    public static void main(String[] args) {
        SuperKeywordExample dog = new SuperKeywordExample();
        dog.animalSound("Woof!"); // Using the method from the parent class
    }
}
