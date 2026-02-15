package Class12_Methods;

/*
 Final method is a method that cannot be overridden by subclasses.
 When a method is declared as final, it means that the implementation of that method is fixed and cannot be changed by any subclass.

 This can be useful for several reasons:
 Security: Final methods can help prevent unintended behavior by ensuring that critical methods cannot be overridden and potentially
 altered in a way that could compromise the integrity of the class.

 Performance: The Java compiler can optimize calls to final methods because it knows that they cannot be overridden.
 This can lead to faster execution of the code.

 Design: Final methods can be used to enforce a specific behavior in subclasses.
 By declaring a method as final, you can ensure that all subclasses will use the same implementation of that method,
 which can be important for maintaining consistency across different classes in a hierarchy.

 Simplicity: Final methods can simplify the design of a class by preventing subclasses from changing the behavior of certain methods.
 This can make it easier to understand and maintain the code, as there will be fewer variations in how methods are implemented across
 different classes.

 Final methods are a powerful tool in Java that can help improve security, performance, design, and simplicity in your code by preventing
 subclasses from overriding critical methods.
 */

class SubClass {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

public class FinalMethodsExample {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.display(); // Output: This is a final method.
    }
}
