package Class16_Polymorphism;

/*
  CompileTime polymorphism, also known as method overloading, occurs when multiple methods in the same class have the same name but different
  parameters (different type, number, or both). The compiler determines which method to call based on the method signature at compile time.

  Method overloading allows you to create multiple methods with the same name but different parameter lists, making your code more flexible
  and easier to read. It is a way to achieve polymorphism in Java without using inheritance.

  The main advantage of compile-time polymorphism is that it allows you to use the same method name for different operations, which can improve code readability and maintainability.

  It also allows you to perform different operations based on the type or number of parameters passed to the method, providing more flexibility in your code.
*/


public class CompileTimePolymorphismExample {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePolymorphismExample example = new CompileTimePolymorphismExample();

        // Calling the method to add two integers
        System.out.println("Sum of 5 and 10: " + example.add(5, 10));

        // Calling the overloaded method to add three integers
        System.out.println("Sum of 5, 10 and 15: " + example.add(5, 10, 15));

        // Calling the overloaded method to add two double values
        System.out.println("Sum of 5.5 and 10.5: " + example.add(5.5, 10.5));
    }
}
