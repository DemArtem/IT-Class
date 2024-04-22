package IT_Class.M26_Multithreading;

public class MemoryConsistencyErrorExample {
    //Значение переменной, считанной потоком thread, не обновляется
    private static boolean sayHello = false;
    //private static volatile boolean sayHello = false;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while(!sayHello) {}
            System.out.println("Hello World!");
            while(sayHello) {}
            System.out.println("Good Bye!");
        });

        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Say Hello..");
        sayHello = true;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Say Bye..");
        sayHello = false;
    }
}