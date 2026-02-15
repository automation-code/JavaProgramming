package Class03_Strings;

/*
StringBuilder in java is a mutable sequence of characters. It is a class in the java.lang package.
Unlike String, StringBuilder can be modified after it is created.
It is more efficient than String when you need to perform a lot of modifications to a string, such as concatenation,
insertion, or deletion. StringBuilder is not thread-safe, which means that it should not be used in multi-threaded environments.
If you need a thread-safe alternative, you can use StringBuffer, which is similar to StringBuilder but is synchronized.
 */

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, World!");
        System.out.println("Original StringBuilder: " + sb);

        // Append to StringBuilder
        sb.append(" How are you?");
        System.out.println("After append: " + sb);

        // Insert into StringBuilder
        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        // Replace in StringBuilder
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // Delete from StringBuilder
        sb.delete(3, 8);
        System.out.println("After delete: " + sb);

        // Reverse StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Convert StringBuilder to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);

        // Length of StringBuilder
        System.out.println("Length of StringBuilder: " + sb.length());

        // Capacity of StringBuilder
        System.out.println("Capacity of StringBuilder: " + sb.capacity());

        // Set length of StringBuilder
        sb.setLength(5);
        System.out.println("After setting length to 5: " + sb);

        // Clear StringBuilder
        sb.setLength(0);
        System.out.println("After clearing StringBuilder: " + sb);

        // Check if StringBuilder is empty
        System.out.println("Is StringBuilder empty? " + (sb.length() == 0));

        // Append multiple times to StringBuilder
        sb.append("Hello").append(" ").append("World").append("!");
        System.out.println("After multiple appends: " + sb);

        // Substring of StringBuilder
        String substr = sb.substring(0, 5);
        System.out.println("Substring of StringBuilder (0 to 5): " + substr);

        // Char at index in StringBuilder
        char ch = sb.charAt(6);
        System.out.println("Character at index 6: " + ch);

        // Set char at index in StringBuilder
        sb.setCharAt(6, 'w');
        System.out.println("After setting char at index 6 to 'w': " + sb);

        // Get index of substring in StringBuilder
        int index = sb.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // Get last index of substring in StringBuilder
        int lastIndex = sb.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex);

        // Check if StringBuilder contains a substring
        boolean contains = sb.indexOf("Hello") != -1;
        System.out.println("Does StringBuilder contain 'Hello'? " + contains);

        // Check if StringBuilder starts with a substring
        boolean startsWith = sb.substring(0, 5).equals("Hello");
        System.out.println("Does StringBuilder start with 'Hello'? " + startsWith);

        // Check if StringBuilder ends with a substring
        boolean endsWith = sb.substring(sb.length() - 6).equals("World!");
        System.out.println("Does StringBuilder end with 'World!'? " + endsWith);

        // Clear StringBuilder using delete method
        sb.delete(0, sb.length());
        System.out.println("After clearing StringBuilder using delete: " + sb);

        // Append a large string to StringBuilder
        String largeString = "This is a large string that we will append to the StringBuilder to test its performance.";
        sb.append(largeString);
        System.out.println("After appending a large string: " + sb);

        // Check the length and capacity after appending a large string
        System.out.println("Length of StringBuilder after appending large string: " + sb.length());
        System.out.println("Capacity of StringBuilder after appending large string: " + sb.capacity());

        // Trim the capacity of StringBuilder to the current length
        sb.trimToSize();
        System.out.println("Capacity of StringBuilder after trimToSize: " + sb.capacity());

        // Append more to StringBuilder after trimming capacity
        sb.append(" Adding more text to see if capacity increases.");
        System.out.println("After appending more text: " + sb);
        System.out.println("Length of StringBuilder after appending more text: " + sb.length());
        System.out.println("Capacity of StringBuilder after appending more text: " + sb.capacity());

        // Clear StringBuilder again
        sb.setLength(0);
        System.out.println("After clearing StringBuilder again: " + sb);

        // Append a string with special characters to StringBuilder
        sb.append("Hello, World! @#$%^&*()_+");
        System.out.println("After appending a string with special characters: " + sb);

        // Check if StringBuilder contains a special character
        boolean containsSpecialChar = sb.indexOf("@") != -1;
        System.out.println("Does StringBuilder contain '@'? " + containsSpecialChar);

        // Check if StringBuilder starts with a special character
        boolean startsWithSpecialChar = sb.charAt(0) == '@';
        System.out.println("Does StringBuilder start with '@'? " + startsWithSpecialChar);

        // Check if StringBuilder ends with a special character
        boolean endsWithSpecialChar = sb.charAt(sb.length() - 1) == '+';
        System.out.println("Does StringBuilder end with '+'? " + endsWithSpecialChar);

        // Reverse StringBuilder again
        sb.reverse();
        System.out.println("After reversing StringBuilder again: " + sb);

        // Convert StringBuilder to String again
        String str2 = sb.toString();
        System.out.println("Converted to String again: " + str2);

        // Check if the converted String is equal to the original StringBuilder
        boolean isEqual = str2.equals(sb.toString());
        System.out.println("Is the converted String equal to the original StringBuilder? " + isEqual);

        // Clear StringBuilder one last time
        sb.setLength(0);
        System.out.println("After clearing StringBuilder one last time: " + sb);

        // Append a string with Unicode characters to StringBuilder
        sb.append("Hello, World! 👋🌍");
        System.out.println("After appending a string with Unicode characters: " + sb);

        // Check if StringBuilder contains a Unicode character
        boolean containsUnicodeChar = sb.indexOf("👋") != -1;
        System.out.println("Does StringBuilder contain '👋'? " + containsUnicodeChar);

        // Check if StringBuilder starts with a Unicode character
        boolean startsWithUnicodeChar = sb.charAt(0) == 'H';
        System.out.println("Does StringBuilder start with 'H'? " + startsWithUnicodeChar);

        // Check if StringBuilder ends with a Unicode character
        boolean endsWithUnicodeChar = sb.charAt(sb.length() - 1) == 'H';
        System.out.println("Does StringBuilder end with '🌍'? " + endsWithUnicodeChar);
    }
}
