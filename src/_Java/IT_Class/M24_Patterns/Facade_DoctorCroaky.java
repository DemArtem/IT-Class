package _Java.IT_Class.M24_Patterns;

import java.util.ArrayList;
import java.util.List;

//Facade
public class Facade_DoctorCroaky {
    public static void main(String[] args) {
        Story.tellStory();
    }
}

class Frog{
    public Frog went(){
        System.out.println("went");
        return this;
    }
    public Frog sayHello(){
        System.out.println("say hello");
        return this;
    }
    public Frog introduce(){
        System.out.println("introduce");
        return this;
    }
    public Frog advertise(){
        System.out.println("advertise");
        return this;
    }
    public Frog listen(){
        System.out.println("listen");
        return this;
    }
}
interface Animal{
    void come();
}
class Fox implements Animal{

    @Override
    public void come() {
        System.out.println("The fox is came");
    }
    public void ask(){
        System.out.println("The fox asked");
    }
}
class Dear implements Animal{

    @Override
    public void come() {
        System.out.println("The dear is came");
    }
}
class Tortoise implements Animal{

    @Override
    public void come() {
        System.out.println("The tortoise is came");
    }
}

class Story{
    private static List<Animal> animalList = new ArrayList<>();
    public static void tellStory(){
        Frog frog = new Frog();
        animalList.add(new Dear()); //анонимный объект
        animalList.add(new Tortoise());
        Animal fox = new Fox(); //именованный объект
        animalList.add(fox);

        frog.went().sayHello();
        animalList.forEach(Animal::come);
        frog.introduce().advertise();

        ((Fox)fox).ask();
        frog.listen();
    }
}