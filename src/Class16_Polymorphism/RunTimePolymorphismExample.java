package Class16_Polymorphism;

/*
 Run time polymorphism occurs when a call to an overridden method is resolved at runtime rather than compile time.
 This is achieved through method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass.
 The decision about which method to call is made at runtime based on the actual object type, not the reference type.
 Run time polymorphism is typically implemented using method overriding and upcasting.
 When a superclass reference variable points to a subclass object, the overridden method in the subclass is called,
 even if the reference type is of the superclass. This allows for dynamic method invocation, enabling more flexible and extensible code.
*/

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Calls the overridden method in Dog class

        myAnimal = new Cat(); // Upcasting
        myAnimal.makeSound(); // Calls the overridden method in Cat class
    }
}
