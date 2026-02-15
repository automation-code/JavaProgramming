package Class18_Abstractions;

/*
 A class which contains the abstract keyword in its declaration is called abstract class.
 We can't create object for abstract class.
 It may or may not contain methods.
 It can have abstract and non-abstract methods.
 To use an abstract class you have to inherit it from subclass.
 If a class contain partial implementation then we should declare a class as abstract.
*/

abstract class Animal {
    public abstract void sound();
}

class DogSound extends Animal {
    public void sound() {
        System.out.println("Dog is Barking");
    }
}

class LionSound extends Animal {
    public void sound() {
        System.out.println("Lion is Roaring");
    }
}


public class AbstractClassExample {
    public static void main(String[] args) {
        DogSound dogSound = new DogSound();
        dogSound.sound();

        LionSound lionSound = new LionSound();
        lionSound.sound();
    }
}
