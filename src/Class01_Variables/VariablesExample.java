package Class01_Variables;

/*
A variable declared inside the body of the method is called local variable
A variable declared inside the class but outside the body of the method, is called an instance variable.
A variable declared as static is called a static variable.
A variable declared as final is called a final variable the value is constant.
*/


public class VariablesExample {
    // instance variable
    String name = "John";

    // static variable
    static int age = 30;

    // final variable
    final double PI = 3.14;

    public void display() {
        // local variable
        String message = "Hello, World!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        VariablesExample example = new VariablesExample();
        example.display();
        System.out.println("Name: " + example.name);
        System.out.println("Age: " + age);
        System.out.println("PI: " + example.PI);
    }
}
