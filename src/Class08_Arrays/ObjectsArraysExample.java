package Class08_Arrays;

/*
 This class demonstrates how to create and use arrays of objects in Java.
 Example: Object x[] = {100, "Welcome", 10.5, true, 'A'}
 We will create an array of a custom class called 'Person' and populate it with instances of 'Person'.
 */

public class ObjectsArraysExample {
    // Define a simple Person class with name and age attributes
    static class Person {
        String name;
        int age;

        // Constructor to initialize the Person object
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to return a string representation of the Person object
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {
        // Create an array of Person objects with a size of 3
        Person[] people = new Person[3];

        // Populate the array with Person instances
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);

        // Iterate through the array and print each Person object
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
