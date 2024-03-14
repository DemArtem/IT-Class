package IT_Class.M24_Patterns;

//Абстрактная фабрика
public class AbstractFabric_FantasyGame {
    public static void main(String[] args) {
        //races: human, elf, ork
        //personages: warrior, archer, mage
        //barracks
        Barracks humanBarracks = new HumanBarracks();
        Warrior warrior1 = humanBarracks.createWarrior();
        warrior1.attack();
    }
}

abstract class Barracks {
    public abstract Warrior createWarrior();
    public abstract Mage createMage();
    public abstract Archer createArcher();
}

interface Warrior{
    void attack();
}
interface Mage{
    void cast();
}interface Archer{
    void shoot();
}

class HumanWarrior implements Warrior{
    @Override
    public void attack() {
        System.out.println("The human warrior is attacking with sword");
    }
}
class HumanMage implements Mage {
    @Override
    public void cast() {
        System.out.println("The human mage is casting a spell");
    }
}

class HumanArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("The human archer is shooting");
    }
}

class HumanBarracks extends Barracks{

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }
}