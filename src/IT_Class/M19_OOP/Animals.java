package IT_Class.M19_OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Animals {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();

        Animal[] animals = new Animal[3];
        System.out.println(Arrays.toString(animals));
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Mouse();
        System.out.println(Arrays.toString(animals));
        for (Animal animal:animals)
            animal.sound(); //полиморфизм
    }
}

abstract class Animal{
    public abstract void sound();
}

class Cat extends Animal{
    @Override //переопределение метода sound
    public void sound() {
        System.out.println("meow");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("woof");
    }
}

class Mouse extends Animal{
    @Override
    public void sound() {
        System.out.println("peep");
    }
}
