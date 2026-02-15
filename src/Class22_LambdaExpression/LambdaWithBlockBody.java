package Class22_LambdaExpression;

@FunctionalInterface
interface Printer {
    void print(String message);
}

public class LambdaWithBlockBody {
    public static void main(String[] args) {
        Printer printer = message -> {
            System.out.println("Printing message...");
            System.out.println(message);
        };
        printer.print("Lambda Expressions are cool!");
    }
}
