package Class09_Classes;

/*
 Class is a blueprint for creating objects.
 Class doesn't consume any space.
 It can contain fields (variables) and methods (functions) that define the behavior of the objects created from the class.
 Inner Class: An inner class is defined within another class and can access all members (even private ones) of the outer class.
 Outer Class: An outer class is the top-level class that can contain: Fields, Methods, Constructors, Inner classes.
 */


public class ClassExample {

    int outerField; // Field of the outer class

    class InnerClass {
        void innerMethod() {
            System.out.println("This is an inner method.");
            System.out.println("Accessing outer field: " + outerField); // Accessing outer class field
        }
    }

    public static void main(String[] args) {
        ClassExample outer = new ClassExample();
        outer.outerField = 10; // Setting the outer class field
        ClassExample.InnerClass inner = outer.new InnerClass(); // Creating an instance of the inner class
        inner.innerMethod(); // Calling the inner method
    }
}
