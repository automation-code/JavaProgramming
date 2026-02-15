package Class22_LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionWithCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "Go");

        list.forEach(lang -> System.out.println(lang));

        list.stream()
                .filter(lang -> lang.startsWith("P"))
                .forEach(System.out::println);
    }
}
