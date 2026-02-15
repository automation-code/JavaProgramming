package Class02_DataTypes;

/*
Primitive Data Types: Include byte, short, int, long, float, double, char, and boolean. They store simple values and have a fixed size.
Non-Primitive Data Types: Include classes, interfaces, and arrays. They can store complex data and have methods associated with them.
Type Casting: The process of converting a variable from one data type to another. It can be implicit (automatic) or explicit (manual).
*/


public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive Data Types
        byte myByte = 100;
        short myShort = 1000;
        int myInt = 10;
        long myLong = 100000L;
        float myFloat = 5.5f;
        double myDouble = 5.5;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("Byte: " + myByte);
        System.out.println("ByteMixValue: " + Byte.MIN_VALUE);
        System.out.println("ByteMaxValue: " + Byte.MAX_VALUE);

        System.out.println("Short: " + myShort);
        System.out.println("ShortMinValue: " + Short.MIN_VALUE);
        System.out.println("ShortMaxValue: " + Short.MAX_VALUE);

        System.out.println("Integer: " + myInt);
        System.out.println("IntegerMinValue: " + Integer.MIN_VALUE);
        System.out.println("IntegerMaxValue: " + Integer.MAX_VALUE);

        System.out.println("Long: " + myLong);
        System.out.println("LongMinValue: " + Long.MIN_VALUE);
        System.out.println("LongMaxValue: " + Long.MAX_VALUE);

        System.out.println("Float: " + myFloat);
        System.out.println("FloatMinValue: " + Float.MIN_VALUE);
        System.out.println("FloatMaxValue: " + Float.MAX_VALUE);

        System.out.println("Double: " + myDouble);
        System.out.println("DoubleMinValue: " + Double.MIN_VALUE);
        System.out.println("DoubleMaxValue: " + Double.MAX_VALUE);

        System.out.println("Character: " + myChar);
        System.out.println("CharacterMinValue: " + Character.MIN_VALUE);
        System.out.println("CharacterMaxValue: " + Character.MAX_VALUE);

        System.out.println("Boolean: " + myBoolean);
        System.out.println("Boolean values can be either true or false.");

        // Non-Primitive Data Types
        String myString = "Hello, World!";
        System.out.println("String: " + myString);
        System.out.println("String is a sequence of characters used to represent text.");

        int[] myArray = {1, 2, 3, 4, 5};

        for (int num : myArray) {
            System.out.print(num + " ");
        }

        // Type Casting
        double implicitCasting = myInt; // Implicit casting (int to double)
        int explicitCasting = (int) myDouble; // Explicit casting (double to int)

        System.out.println();
        System.out.println("Implicit Casting (int to double): " + implicitCasting);
        System.out.println("Explicit Casting (double to int): " + explicitCasting);
    }
}
