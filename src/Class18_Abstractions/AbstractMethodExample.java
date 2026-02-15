package Class18_Abstractions;

/*
 A method which contain abstract modifier at the time of declaration is called abstract method.
 It can only be used in abstract class.
 It doesn’t contain only body {} and always ends with ";"
 Abstract method must be overridden in subclasses otherwise it will also become an abstract class.
 Whenever the action is common but implementation are different from we should use abstract method.
*/

abstract class Programming {
    public abstract void htmlConcepts();
    public abstract void phpConcepts();
    public abstract void testingConcepts();
}

abstract class WebDesign extends Programming {
    public void htmlConcepts() {
        System.out.println("HTML is used for web design.");
    }
}

abstract class WebDevelop extends WebDesign {
    public void phpConcepts() {
        System.out.println("PHP is used for web development");
    }
}

class Testing extends WebDevelop {
    public void testingConcepts() {
        System.out.println("Software Testing");
    }
}

public class AbstractMethodExample {
    public static void main(String[] args) {
        Programming obj = new Testing();
        obj.htmlConcepts();
        obj.phpConcepts();
        obj.testingConcepts();
    }
}
