package _Java.HomeWorks.HW16_Threading;
/*
Два охранника попеременно стоят на посту по 12 часов.
Пока один стоит на посту, другой спит. Когда срабатывает будильник,
первый охранник засыпает, второй заменяет первого.
Процесс повторяется. Должны быть классы Guard, Watch
*/

public class GuardAndWatch{
    public static void main(String[] args) {
        Guard guard1 = new Guard("Охранник 1");
        Guard guard2 = new Guard("Охранник 2");

        guard1.start();
        guard2.start();

        while(true) {
            Watch.getInstance().sleep();
        }
    }
}

class Guard extends Thread {
    private String name;

    public Guard(String name) {
        this.name = name;
    }

    public void run() {
        while(true) {
            System.out.println(name + " проснулся и стоит на посту");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " пошел спать");
            Watch.getInstance().wakeUp();
        }
    }
}

class Watch {
    private static Watch instance = new Watch();
    private boolean isAwake;

    private Watch() {
        this.isAwake = true;
    }

    public static Watch getInstance() {
        return instance;
    }

    public synchronized void wakeUp() {
        this.isAwake = true;
        notify();
    }

    public synchronized void sleep() {
        this.isAwake = false;
        try {
            while(!isAwake) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}