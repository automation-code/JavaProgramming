package Class20_Collections;

/*
 TreeSet is a class in Java that implements the Set interface and is part of the Java Collections Framework.
 It is a sorted collection that stores unique elements in a tree structure.
 The elements in a TreeSet are ordered according to their natural ordering or by a specified comparator.

 Key features of TreeSet include:
    Sorted Order: TreeSet maintains the elements in a sorted order, which means that the elements
    are stored in a way that allows for efficient retrieval and traversal.

    Unique Elements: TreeSet does not allow duplicate elements. If you try to add a duplicate element, it will simply ignore the addition.

    Null Elements: TreeSet does not allow null elements. If you try to add a null element, it will throw a NullPointerException.

    Performance: TreeSet provides logarithmic time complexity for basic operations like add, remove, and contains, making it efficient
    for large collections of data.

    NavigableSet Interface: TreeSet implements the NavigableSet interface, which provides additional methods for navigating the set,
    such as lower(), floor(), ceiling(), and higher().

 TreeSet is a useful collection when you need to maintain a sorted set of unique elements and want to perform efficient operations on that set.
*/

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // Print the TreeSet (elements will be in sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Check if an element exists
        System.out.println("Contains 'Banana': " + treeSet.contains("Banana"));

        // Remove an element
        treeSet.remove("Date");
        System.out.println("After removing 'Date': " + treeSet);

        // Get the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Get a subset of the TreeSet
        System.out.println("Subset from 'Banana' to 'Elderberry': " + treeSet.subSet("Banana", "Elderberry"));
    }
}
