package Class05_Conditions;

/*
Switch statement is a control flow statement that allows you to execute different blocks of code based on the value of a variable or expression.
It is an alternative to using multiple if-else statements when you have a variable that can take on multiple values.

The syntax of a switch statement is as follows:
switch (expression) {
    case value1:
        // code block for value1
        break;
    case value2:
        // code block for value2
        break;
    // more cases...
    default:
        // code block for default case
 */

public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        // 1 for Monday, 2 for Tuesday, ..., 7 for Sunday

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
        }
    }
}
