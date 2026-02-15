package Class03_Strings;

/*
StringBuffer in java is a mutable sequence of characters. It is a class in the java.lang package.
StringBuffer is used when you need to modify a string frequently, as it is more efficient than using String for such operations.
StringBuffer provides methods for appending, inserting, deleting, and modifying characters in the string.
 */

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("Hello, World!");

        // Appending to the string buffer
        strBuffer.append(" How are you?");
        System.out.println("Appended string: " + strBuffer);

        // Inserting into the string buffer
        strBuffer.insert(7, "Java ");
        System.out.println("Inserted string: " + strBuffer);

        // Deleting from the string buffer
        strBuffer.delete(7, 12);
        System.out.println("Deleted string: " + strBuffer);

        // Reversing the string buffer
        strBuffer.reverse();
        System.out.println("Reversed string: " + strBuffer);

        // Converting StringBuffer to String
        String str = strBuffer.toString();
        System.out.println("Converted to String: " + str);

        // Length of the string buffer
        System.out.println("Length of string buffer: " + strBuffer.length());

        // Capacity of the string buffer
        System.out.println("Capacity of string buffer: " + strBuffer.capacity());

        // Setting the length of the string buffer
        strBuffer.setLength(5);
        System.out.println("String buffer after setting length to 5: " + strBuffer);

        // Clearing the string buffer
        strBuffer.setLength(0);
        System.out.println("String buffer after clearing: '" + strBuffer + "'");

        // Appending after clearing
        strBuffer.append("New String");
        System.out.println("Appended after clearing: " + strBuffer);

        // Reversing again
        strBuffer.reverse();
        System.out.println("Reversed again: " + strBuffer);

        // Inserting at the beginning
        strBuffer.insert(0, "Start: ");
        System.out.println("Inserted at the beginning: " + strBuffer);

        // Deleting a portion of the string buffer
        strBuffer.delete(0, 7);
        System.out.println("Deleted portion: " + strBuffer);

        // Reversing one more time
        strBuffer.reverse();
        System.out.println("Reversed one more time: " + strBuffer);

        // Final string buffer content
        System.out.println("Final string buffer content: " + strBuffer);

        // Final string buffer length and capacity
        System.out.println("Final length: " + strBuffer.length());
        System.out.println("Final capacity: " + strBuffer.capacity());
    }
}
