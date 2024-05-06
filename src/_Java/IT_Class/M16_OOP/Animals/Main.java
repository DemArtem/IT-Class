package _Java.IT_Class.M16_OOP.Animals;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();

        Animal[] animals = new Animal[3];
        System.out.println(Arrays.toString(animals));
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Mouse();
        System.out.println(Arrays.toString(animals));
        for (Animal animal : animals)
            animal.sound(); //полиморфизм
    }
}
