package Class20_Collections;

/*
 HashSet is a collection class in Java that implements the Set interface.
 It is part of the Java Collections Framework and is used to store a collection of unique elements.
 The HashSet class is backed by a hash table, which allows for fast access and retrieval of elements.

 Key features of HashSet:
    Unique Elements: HashSet does not allow duplicate elements. If you try to add a duplicate element, it will simply ignore the addition.
    No Order: HashSet does not maintain any order of the elements. The order of elements in a HashSet is not guaranteed and can change over time.
    Null Values: HashSet allows one null element, but it does not allow multiple null values.
    Performance: HashSet provides constant time performance for basic operations like add, remove, and contains, assuming the hash function disperses the elements properly.
    Not Synchronized: HashSet is not synchronized, which means it is not thread-safe. If multiple threads access a HashSet concurrently, and at least one of the threads modifies the set, it must be synchronized externally.
*/


import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        // Attempt to add a duplicate element
        boolean added = hashSet.add("Apple"); // This will return false
        System.out.println("Was 'Apple' added again? " + added);

        // Display the contents of the HashSet
        System.out.println("HashSet contents: " + hashSet);

        // Check if an element exists in the HashSet
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Does the HashSet contain 'Banana'? " + containsBanana);

        // Remove an element from the HashSet
        boolean removed = hashSet.remove("Cherry");
        System.out.println("Was 'Cherry' removed? " + removed);

        // Display the contents of the HashSet after removal
        System.out.println("HashSet contents after removal: " + hashSet);
    }
}
