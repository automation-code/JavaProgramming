package Class22_LambdaExpression;

@FunctionalInterface
interface SayHello {
    void say();
}

public class NoParameterLambdaExpression {
    public static void main(String[] args) {
        SayHello sayHello = () -> {
            System.out.println("Hello World");
        };

        sayHello.say();
    }
}
