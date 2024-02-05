package IT_Class.M20_Tree_Interfaces_Dates.Interfaces;
//https://training.epam.com/static/news/Books/Ihar_Blinou.Java.from.EPAM.v2.2021.pdf
import java.util.ArrayList;
import java.util.List;

public class AnimalScool {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.run();
        duck.swimm();

        Squirrel squirrel = new Squirrel();
        squirrel.run();
        squirrel.climb();

        List<Running> animals = new ArrayList<>();
        animals.add(duck);
        animals.add(squirrel);
        for (Running animal:animals)
            animal.run();
    }
}

//причастие: содежит не реализованные, но запланированные в будущем действия
//-able, -ing;
interface Running{
    public void run();
}

interface Swimming{
    public void swimm();
}

interface Climbing{
    public void climb();
}

class Duck implements Running, Swimming{

    @Override
    public void run() {
        System.out.println("duck is run");
    }

    @Override
    public void swimm() {
        System.out.println("duck is swimm");
    }
}

class Squirrel implements Running, Climbing{

    @Override
    public void run() {
        System.out.println("squirrel is run");
    }

    @Override
    public void climb() {
        System.out.println("squirrel is climb");
    }
}
