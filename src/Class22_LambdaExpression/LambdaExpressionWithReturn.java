package Class22_LambdaExpression;


@FunctionalInterface
interface MaxFinder {
    int max(int a, int b);
}

public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        MaxFinder findMax = (a, b) -> {
            if (a > b) return a;
            else return b;
        };
        System.out.println(findMax.max(10, 20));
    }
}
