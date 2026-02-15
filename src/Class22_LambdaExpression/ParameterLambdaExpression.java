package Class22_LambdaExpression;

@FunctionalInterface
interface Addition {
    double calculate(double x, double y);
}

public class ParameterLambdaExpression {
    public static void main(String[] args) {
        Addition addition = (x, y) -> x + y;
        System.out.println(addition.calculate(5, 10));
    }
}
