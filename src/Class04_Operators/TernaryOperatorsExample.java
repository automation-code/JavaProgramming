package Class04_Operators;

/*
Ternary operator in Java is a shorthand for an if-else statement. It is represented by the symbol '?'.
The ternary operator is often used to simplify code and make it more concise.
It can be used in place of simple if-else statements, especially when assigning values to variables based on a condition.
The syntax of the ternary operator is as follows:

condition ? expression1 : expression2;
- condition: This is a boolean expression that evaluates to true or false.
- expression1: This is the expression that is evaluated and returned if the condition is true.
- expression2: This is the expression that is evaluated and returned if the condition is false.
 */


public class TernaryOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);

        // Using ternary operator to check if a number is even or odd
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is an " + result);

        // Using ternary operator to assign a grade based on a score
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("The grade for a score of " + score + " is: " + grade);

        // Using ternary operator to check if a person is eligible to vote
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("A person who is " + age + " years old is: " + eligibility);

        // Using ternary operator to check if a number is positive, negative or zero
        int num = -5;
        String sign = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(num + " is a " + sign + " number.");
    }
}
