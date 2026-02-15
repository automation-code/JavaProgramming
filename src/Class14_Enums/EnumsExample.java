package Class14_Enums;

/*
 Enums are a special data type in Java that allows you to define a collection of constants.
 They are used to represent a fixed set of values, such as days of the week, months of the year, or any other group of related constants.
 You can define an enum using the `enum` keyword. Each constant in the enum is typically written in uppercase letters.
 Enums can also have fields, methods, and constructors, making them more powerful than simple constants.
*/


public class EnumsExample {
    // Define an enum for days of the week
    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        // Using the enum
        Day today = Day.WEDNESDAY;

        // Print the value of today
        System.out.println("Today is: " + today);

        // Using a switch statement with enums
        switch (today) {
            case SUNDAY:
                System.out.println("It's a weekend!");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday.");
                break;
            case SATURDAY:
                System.out.println("It's a weekend!");
                break;
        }
    }
}
