package IT_Class.M26_Multithreading;
public class Names {
    public static String message;
    public static Object object = new Object();
    public static long count = 0;

    public static void main(String[] args) {
        YoungMan youngMan = new YoungMan();
        youngMan.start();
        YoungMan.OldMan oldMan = new YoungMan.OldMan();
        oldMan.start();
    }

    public static void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class YoungMan extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Names.object){
            Names.message = Long.toString(Names.count++)+" Young: ";
            Names.sleep(50);
            Names.message += "10 years old";
            Names.sleep(50);
            System.out.println(Names.message);
        }
        //Names.sleep(50);
    }
}

static class OldMan extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Names.object) {
                Names.message = Long.toString(Names.count++) + " Old:   ";
                Names.sleep(70);
                Names.message += "50 years old";
                Names.sleep(50);
                System.out.println(Names.message);
            }
        }
            //Names.sleep(70);
        }
    }
}
