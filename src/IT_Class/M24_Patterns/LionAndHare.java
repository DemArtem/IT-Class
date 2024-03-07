package IT_Class.M24_Patterns;

import javax.sound.sampled.Line;

//шаблон мост (bridge)
public class LionAndHare {
    public static void main(String[] args) {
        Lion lion = new CleverLion();
        Hare hare = new CleverHare();
        hare.meetWithLion(lion);
    }
}

abstract class Lion{
    public boolean wit;
    abstract public void meetWithHare(Hare hare);
}

abstract class Hare{
    public boolean wit;
    abstract public void meetWithLion(Lion lion);
}

class CleverHare extends Hare{

    public CleverHare(){
        this.wit = true;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit)
            System.out.println("The Lion is clever, my attempt fails");
        else
            System.out.println("The Lion is stupid, i will try to fool him");
        lion.meetWithHare(this);

    }
}

class StupidLion extends Lion{

    public StupidLion(){
        this.wit = false;
    }

    @Override
    public void meetWithHare(Hare hare) {
        if (hare.wit)
            System.out.println("What? Another lion in my jungle? Take me to him immediately.");
        else
            System.out.println("It is another hare. I'm very hungry.");
    }
}

class CleverLion extends Lion{

    public CleverLion(){
        this.wit = true;
    }

    public void meetWithHare(Hare hare){
        if (hare.wit)
            System.out.println("The Hare is clever, I don't want to eat him.");
        else
            System.out.println("The Hare is stupid, I'd rather eat him.");
    }
}

class StupidHare extends Hare{
    public StupidHare(Lion lion) {
        this.wit = false;
    }

    @Override
    public void meetWithLion(Lion lion) {
        if (lion.wit)
            System.out.println("The clever Lion! I can't do anything!");
        else System.out.println("The stupid Lion! I afraid him!");
        lion.meetWithHare(this);
    }
}