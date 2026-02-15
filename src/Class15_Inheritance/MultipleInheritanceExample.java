package Class15_Inheritance;

/*
 Multiple inheritance is not supported through classes, but it can be achieved using interfaces.
 This is because a class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
*/

class Printer {
    public void print() {
        System.out.println("Using for printing documents...");
    }
}

class Scanner extends Printer{
    public void scan() {
        System.out.println("Using for scanning document...");
    }
}

class MultiFunctionDevice extends Scanner {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the class that implements both interfaces
        MultiFunctionDevice device = new MultiFunctionDevice();
        device.print();
        device.scan();
    }
}
