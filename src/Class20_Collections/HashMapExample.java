package Class20_Collections;

/*
 HashMap is a class in Java that implements the Map interface and is part of the Java Collections Framework.
 It is used to store key-value pairs, where each key is unique and maps to a specific value.
 HashMap allows for fast retrieval of values based on their corresponding keys.

 Key features of HashMap include:
    It does not maintain any order of the elements.
    It allows one null key and multiple null values.
    It is not synchronized, which means it is not thread-safe. If multiple threads access a HashMap concurrently, and at least one of the threads modifies the map structurally, it must be synchronized externally.
    It provides constant-time performance for basic operations like get and put, assuming the hash function disperses the elements properly among the buckets.
    It uses a hash function to compute the hash code of the keys and stores the key-value pairs in an array of buckets. Each bucket can contain multiple key-value pairs in case of hash collisions, which are resolved using chaining (linked lists or trees).
    HashMap is commonly used when you need to store and retrieve data based on unique keys, such as in cases of caching, counting occurrences, or implementing associative arrays.
*/

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Retrieve a value based on its key
        int value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Check if a key exists in the HashMap
        boolean containsKey = map.containsKey("Apple");
        System.out.println("Does the key 'Apple' exist? " + containsKey);

        // Remove a key-value pair from the HashMap
        map.remove("Orange");

        // Iterate through the HashMap and print all key-value pairs
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
