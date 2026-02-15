package Class20_Collections;

/*
 TreeMap is a class in Java that implements the Map interface and is part of the Java Collections Framework.
 It is a Red-Black tree-based implementation of the Map interface, which means that it stores key-value pairs
 in a sorted order based on the natural ordering of the keys or by a specified comparator.

 Here are some key features of TreeMap:
    Sorted Order: TreeMap maintains the keys in a sorted order, which allows for efficient retrieval of values based on the keys.
    The keys are sorted according to their natural ordering (if they implement the Comparable interface) or by a specified Comparator.

    No Null Keys: TreeMap does not allow null keys. If you try to insert a null key, it will throw a NullPointerException.
    However, it allows null values.

    Performance: TreeMap provides logarithmic time complexity for basic operations like get, put, remove, and containsKey.
    This is because it uses a Red-Black tree structure to maintain the sorted order of the keys.

    NavigableMap Interface: TreeMap implements the NavigableMap interface, which provides additional methods for navigating the map,
    such as firstKey(), lastKey(), lowerKey(), higherKey(), and subMap().

    Thread Safety: TreeMap is not synchronized, which means that it is not thread-safe.
    If you need to use a TreeMap in a multi-threaded environment, you should consider using Collections.
    synchronizedMap() to wrap the TreeMap or use a ConcurrentSkipListMap instead.

 TreeMap is a useful data structure when you need to maintain a sorted order of keys and perform efficient retrieval of values based on those keys.
 It is commonly used in scenarios where you need to store data in a sorted manner and perform range queries or need to access the first or last entries in the map.
*/


import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 30);
        treeMap.put("Date", 40);

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Retrieve a value based on a key
        int value = treeMap.get("Banana");
        System.out.println("Value for 'Banana': " + value);

        // Check if a key exists
        boolean containsKey = treeMap.containsKey("Cherry");
        System.out.println("Contains key 'Cherry': " + containsKey);

        // Remove a key-value pair
        treeMap.remove("Date");
        System.out.println("TreeMap after removing 'Date': " + treeMap);

        // Get the first and last keys
        String firstKey = treeMap.firstKey();
        String lastKey = treeMap.lastKey();
        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);
    }
}
