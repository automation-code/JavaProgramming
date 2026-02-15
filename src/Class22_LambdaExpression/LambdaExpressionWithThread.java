package Class22_LambdaExpression;

public class LambdaExpressionWithThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Running old thread...");
            }
        });

        Thread thread2 = new Thread(() -> System.out.println("Running with Lambda!"));
        thread1.start();
        thread2.start();
    }
}
