package Class06_Loops;

/*
A for-each loop, also known as an enhanced for loop, is a control flow statement that allows
you to iterate over elements in an array or a collection without needing to use an index variable.
It provides a simpler and more readable syntax for iterating through collections.

The syntax of a for-each loop is as follows:
for (type variable : collection) {
    // code to be executed for each element
}
 */

import java.util.ArrayList;

public class ForEachLoopExample {
    public static void main(String[] args) {
        // Example with an array
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Using for-each loop to iterate over an array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Example with a collection (ArrayList)
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println();
        System.out.println("Using for-each loop to iterate over a collection:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
