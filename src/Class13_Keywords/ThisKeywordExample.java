package Class13_Keywords;

/*
 The "this" keyword in Java is a reference variable that refers to the current object.
 It is commonly used to differentiate between instance variables and local variables when they have the same name.
 The "this" keyword can also be used to call other constructors in the same class or to pass the current object as an argument to a method.

 Here are some common uses of the "this" keyword:
 Differentiating between instance variables and local variables:

   public class Example {
       private int value;

       public Example(int value) {
           this.value = value; // 'this.value' refers to the instance variable, while 'value' refers to the parameter
       }
   }

 Calling another constructor in the same class:
   public class Example {
       private int value;
         public Example() {
              this(0); // Calls the constructor that takes an int parameter
         }
         public Example(int value) {
              this.value = value;
            }
    }

 Passing the current object as an argument to a method:
    public class Example {
        private int value;

        public Example(int value) {
            this.value = value;
        }

        public void display() {
            System.out.println("Value: " + this.value);
        }

        public void callDisplay() {
            this.display(); // Calls the display method on the current object
        }
    }
*/


public class ThisKeywordExample {
    private int value;

    public ThisKeywordExample(int value) {
        this.value = value; // 'this.value' refers to the instance variable, while 'value' refers to the parameter
    }

    public void display() {
        System.out.println("Value: " + this.value);
    }

    public void callDisplay() {
        this.display(); // Calls the display method on the current object
    }

    public static void main(String[] args) {
        ThisKeywordExample example = new ThisKeywordExample(10);
        example.callDisplay(); // Output: Value: 10
    }
}
