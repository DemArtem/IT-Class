package IT_Class.M24_Patterns;

//chain of resposibility
public class Chain_RoosterAndBeanSeed {
    public static void main(String[] args) {
        Hen hen = new Hen();
        Cow cow = new Cow();
        Mower mower = new Mower();
        Stove stove = new Stove();
        hen.setNext(cow);
        cow.setNext(mower);
        mower.setNext(stove);

        hen.help();
    }
}

abstract class Helper {
    private Helper next;

    public void setNext(Helper next) {
        this.next = next;
    }

    public void help() {
        sendMessage();
        if (next != null)
            next.help();
    }

    abstract void sendMessage();
}

class Hen extends Helper {
    @Override
    void sendMessage() {
        System.out.println("Курица - корове: дай маслица.");
    }
}

class Cow extends Helper {
    @Override
    void sendMessage() {
        System.out.println("Корова - косарям: дайте сена.");
    }
}

class Mower extends Helper {
    @Override
    void sendMessage() {
        System.out.println("Косари - печке: дай калачей.");
    }
}

class Stove extends Helper {
    @Override
    void sendMessage() {
        System.out.println("Печка - дровосеку: дай дров.");
    }
}