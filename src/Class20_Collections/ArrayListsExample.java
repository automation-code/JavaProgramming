package Class20_Collections;

/*
 ArrayList is a resizable array implementation of the List interface in Java.
 It allows us to store and manipulate a dynamic collection of objects.

 Here are some key features of ArrayList:
    Dynamic Sizing: Unlike arrays, ArrayLists can grow and shrink in size dynamically as elements are added or removed.
    Ordered Collection: ArrayLists maintain the order of elements based on their insertion order.
    Allows Duplicates: ArrayLists can contain duplicate elements, meaning you can have multiple occurrences of the same value.
    Provides Methods: ArrayLists come with various methods for adding, removing, and accessing elements, such as add(), remove(), get(), and size().
    Not Synchronized: ArrayLists are not synchronized, which means they are not thread-safe. If multiple threads access an ArrayList concurrently, it must be synchronized externally.
*/

import java.util.ArrayList;

public class ArrayListsExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Adding a duplicate element

        // Accessing elements in the ArrayList
        System.out.println("First name: " + names.get(0));
        // Output: Alice
        System.out.println("Second name: " + names.get(1));
        // Output: Bob

        // Removing an element from the ArrayList
        names.remove("Bob");

        // Checking the size of the ArrayList
        System.out.println("Size of the ArrayList: " + names.size());
        // Output: 3

        // Iterating through the ArrayList
        System.out.println("Names in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
