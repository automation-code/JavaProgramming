package Class12_Methods;

/*
 Synchronized methods are used to control access to a particular resource or block of code by multiple threads.
 When a method is declared as synchronized, only one thread can access it at a time.
 This is particularly useful when you have shared resources that need to be accessed by multiple threads,
 such as a shared counter or a shared data structure.
 When a thread calls a synchronized method, it acquires a lock on the object that contains the method.
 Other threads that try to call the same method will be blocked until the lock is released.
 This ensures that only one thread can execute the synchronized method at any given time, preventing race conditions and ensuring thread safety.
*/

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedMethodsExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads to increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}
