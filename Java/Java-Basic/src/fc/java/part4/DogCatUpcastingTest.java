package fc.java.part4;

import fc.java.model.*;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();

        Animal cat = new Cat();
        cat.eat();
    }
}
