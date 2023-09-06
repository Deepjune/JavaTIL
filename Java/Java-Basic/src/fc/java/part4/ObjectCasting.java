package fc.java.part4;

import fc.java.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal-->Dog, Cat
        Animal dog = new Dog();
        dog.eat();

        Animal cat = new Cat();
        cat.eat();
        // cat.night(); // ?

        ((Cat)cat).night();


    }
}
