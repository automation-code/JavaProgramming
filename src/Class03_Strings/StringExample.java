package Class03_Strings;

/*
String in java is a sequence of characters. It is a class in the java.lang package.
Strings are immutable, which means that once a string is created, it cannot be changed.
However, you can create a new string based on an existing string.
 */

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = new String("Hello, World!");

        // Comparing strings using == operator
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2));
        //Output: true, because string literals are interned
        System.out.println("str1 == str3: " + (str1 == str3));
        //Output: false, because str3 is a new object

        // Comparing strings using equals() method
        System.out.println();
        System.out.println("Using equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        //Output: true
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        //Output: true

        // String concatenation
        String str4 = str1 + " How are you?";
        System.out.println();
        System.out.println("Concatenated string: " + str4);

        // String length
        System.out.println();
        System.out.println("Length of str1: " + str1.length());

        // Substring
        String substr = str1.substring(7, 12);
        System.out.println();
        System.out.println("Substring of str1 (7 to 12): " + substr);

        // String to uppercase
        String upperStr = str1.toUpperCase();
        System.out.println();
        System.out.println("Uppercase str1: " + upperStr);

        // String to lowercase
        String lowerStr = str1.toLowerCase();
        System.out.println();
        System.out.println("Lowercase str1: " + lowerStr);

        // String trimming
        String str5 = "   Hello, World!   ";
        String trimmedStr = str5.trim();
        System.out.println();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // String replacement
        String replacedStr = str1.replace("World", "Java");
        System.out.println();
        System.out.println("Replaced string: " + replacedStr);

        // String splitting
        String[] parts = str1.split(", ");
        System.out.println();
        System.out.println("Split string:");
        for (String part : parts) {
            System.out.println(part);
        }

        // String formatting
        String name = "Alice";
        int age = 30;
        String formattedStr = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println();
        System.out.println("Formatted string: " + formattedStr);

        // String comparison ignoring case
        String str6 = "hello, world!";
        System.out.println();
        System.out.println("Comparing str1 and str6 ignoring case: " + str1.equalsIgnoreCase(str6));
        //Output: true

        // String contains
        System.out.println();
        System.out.println("Does str1 contain 'World'? " + str1.contains("World"));
        //Output: true

        // String starts with
        System.out.println();
        System.out.println("Does str1 start with 'Hello'? " + str1.startsWith("Hello"));
        //Output: true

        // String ends with
        System.out.println();
        System.out.println("Does str1 end with 'World!'? " + str1.endsWith("World!"));
        //Output: true

        // String indexOf
        int index = str1.indexOf("World");
        System.out.println();
        System.out.println("Index of 'World' in str1: " + index);
        //Output: 7

        // String lastIndexOf
        String str7 = "Hello, World! Hello!";
        int lastIndex = str7.lastIndexOf("Hello");
        System.out.println();
        System.out.println("Last index of 'Hello' in str7: " + lastIndex);
        //Output: 14

        // String is empty
        String str8 = "";
        System.out.println();
        System.out.println("Is str8 empty? " + str8.isEmpty());
        //Output: true

        // String is blank
        String str9 = "   ";
        System.out.println();
        System.out.println("Is str9 blank? " + str9.isBlank());
        //Output: true

        // String repeat
        String repeatedStr = "Hello".repeat(3);
        System.out.println();
        System.out.println("Repeated string: " + repeatedStr);
        //Output: HelloHelloHello

        // String strip
        String str10 = "   Hello, World!   ";
        String strippedStr = str10.strip();
        System.out.println();
        System.out.println("Stripped string: '" + strippedStr + "'");
        //Output: 'Hello, World!'

        // String stripLeading
        String leadingStr = str10.stripLeading();
        System.out.println();
        System.out.println("Leading stripped string: '" + leadingStr + "'");
        //Output: 'Hello, World!   '

        // String stripTrailing
        String trailingStr = str10.stripTrailing();
        System.out.println();
        System.out.println("Trailing stripped string: '" + trailingStr + "'");
        //Output: '   Hello, World!'

        // String indent
        String indentedStr = "Hello\nWorld".indent(4);
        System.out.println();
        System.out.println("Indented string:\n" + indentedStr);
        //Output: Hello\n    World

        // String translateEscapes
        String escapedStr = "Hello\\nWorld".translateEscapes();
        System.out.println();
        System.out.println("Translated escapes string:\n" + escapedStr);
        //Output: Hello\nWorld

        // String formatted with locale
        String formattedLocaleStr = String.format(java.util.Locale.FRANCE, "My name is %s and I am %d years old.", name, age);
        System.out.println();
        System.out.println("Formatted string with locale: " + formattedLocaleStr);
        //Output: My name is Alice and I am 30 years old.

        // String formatted with argument index
        String formattedArgIndexStr = String.format("My name is %1$s and I am %2$d years old. %1$s is my name.", name, age);
        System.out.println();
        System.out.println("Formatted string with argument index: " + formattedArgIndexStr);
        //Output: My name is Alice and I am 30 years old. Alice is my name.

        // String formatted with flags
        String formattedFlagsStr = String.format("My name is %-10s and I am %04d years old.", name, age);
        System.out.println();
        System.out.println("Formatted string with flags: " + formattedFlagsStr);
        //Output: My name is Alice and I am 0030 years old.

        // String formatted with width
        String formattedWidthStr = String.format("My name is %10s and I am %5d years old.", name, age);
        System.out.println();
        System.out.println("Formatted string with width: " + formattedWidthStr);
        //Output: My name is Alice and I am 30 years old.

        // String formatted with precision
        String formattedPrecisionStr = String.format("My name is %.3s and I am %.2f years old.", name, (double) age);
        System.out.println();
        System.out.println("Formatted string with precision: " + formattedPrecisionStr);
        //Output: My name is Ali and I am 30.00 years old.

        // String formatted with argument index and flags
        String formattedArgIndexFlagsStr = String.format("My name is %1$-10s and I am %2$04d years old.", name, age);
        System.out.println();
        System.out.println("Formatted string with argument index and flags: " + formattedArgIndexFlagsStr);
        //Output: My name is Alice and I am 0030 years old.
    }
}
