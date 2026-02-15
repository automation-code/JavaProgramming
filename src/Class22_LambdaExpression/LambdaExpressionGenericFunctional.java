package Class22_LambdaExpression;

/*
    This code demonstrates the use of lambda expressions with a generic functional interface.
    The GenericFunction interface is defined to operate on any type T, allowing us to create
    lambda expressions for both String concatenation and Integer addition.
 */

@FunctionalInterface
interface GenericFunction<T> {
    T operate(T a, T b);
}

public class LambdaExpressionGenericFunctional {
    public static void main(String[] args) {
        GenericFunction<String> concat = (a, b) -> a + b;
        GenericFunction<Integer> add = (a, b) -> a + b;

        System.out.println(concat.operate("Hello ", "Java")); // Hello Java
        System.out.println(add.operate(5, 10));
    }
}
