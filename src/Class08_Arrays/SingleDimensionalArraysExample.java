package Class08_Arrays;

/*
 This class demonstrates the use of single-dimensional arrays in Java.
 It includes examples of declaring, initializing, and accessing elements of an array.
 Single-dimensional arrays are a collection of elements of the same type, stored in contiguous memory locations.
 They are useful for storing a list of items, such as numbers, strings, or objects.
 */

public class SingleDimensionalArraysExample {
    public static void main(String[] args) {
        // Declaring and initializing a single-dimensional array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements of the array using their index
        System.out.println("First element: " + numbers[0]); // Output: 10
        System.out.println("Third element: " + numbers[2]); // Output: 30

        // Modifying an element in the array
        numbers[1] = 25; // Changing the second element from 20 to 25
        System.out.println("Modified second element: " + numbers[1]); // Output: 25

        // Iterating through the array using a for loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Declaring and initializing a single-dimensional array of strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        // Accessing elements of the string array
        System.out.println("First fruit: " + fruits[0]); // Output: Apple
        System.out.println("Last fruit: " + fruits[fruits.length - 1]); // Output: Elderberry

        // Modifying an element in the string array
        fruits[2] = "Citrus"; // Changing "Cherry" to "Citrus"
        System.out.println("Modified third fruit: " + fruits[2]); // Output: Citrus

        // Iterating through the string array using an enhanced for loop
        System.out.println("All fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
