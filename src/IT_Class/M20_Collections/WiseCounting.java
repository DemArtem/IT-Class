package IT_Class.M20_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WiseCounting {
    public static void main(String[] args) {
        Emperor emperor = new Emperor("Akbar");
        List<Courtier> courtiers  = new LinkedList<>();
        courtiers.add(new Courtier("first courtier"));
        courtiers.add(new Courtier("second courtier"));
        courtiers.add(new Courtier("3th courtier"));
        Birbal birbal = new Birbal("Birbal");

        emperor.ask(0);
        /*
        for (int i=0; i<courtiers.size(); i++)
            courtiers.get(i).think();
        for (Courtier courtier:courtiers)
            courtier.think();
        courtiers.forEach(courtier -> courtier.think());
        */
        courtiers.forEach(Courtier::think);

        birbal.enter();
        birbal.ask();
        emperor.ask(0);
        birbal.reply();
        emperor.ask(0);
        birbal.say();
    }
}

class Person{
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Emperor extends Person{
    private final List<String> questions = new ArrayList<>();

    public Emperor(String name) {
        super(name);
        questions.add("\"How many crows are there in this city?\"");
        questions.add("\"How can you be so sure?\"");
    }

    public void ask(int number){
        System.out.println(getName()+" asks: "+questions.get(number));
    }

    public void looks(){
        System.out.println(getName()+" glanced at his courtiers");
    }
}

class Courtier extends Person{

    public Courtier(String name) {
        super(name);
    }

    public void think(){
        System.out.println("Head of the "+getName()+ " began to hang low.");
    }
}

class Birbal extends Person{
    Birbal(String name){
        super(name);
    }

    public void enter(){
        System.out.println(getName()+" enters the courtyard");
    }

    public void ask(){
        System.out.println(getName()+" asks: \"May I know the question so that I can try for an answer?\"");
    }

    public void reply(){
        System.out.println(getName()+" replies: \"There are fifty thousand five hundred and eighty nine crows, my lord\"");
    }

    public void say(){
        System.out.println(getName()+" says: \"Make you men count, My lord. \n"+
                "If you find more crows it means some have come to visit their relatives here.\n"+
                "If you find less number of crows it means some have gone to visit their relatives elsewhere\"");
    }
}