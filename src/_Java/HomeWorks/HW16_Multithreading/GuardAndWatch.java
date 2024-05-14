package _Java.HomeWorks.HW16_Multithreading;
/*
Два охранника попеременно стоят на посту по 12 часов.
Пока один стоит на посту, другой спит.
Когда срабатывает будильник, первый охранник засыпает, второй заменяет первого.
Процесс повторяется.
Должны быть классы Guard, Watch
 */

class Guard {
    private String name;
    private boolean isOnDuty;

    public Guard(String name) {
        this.name = name;
        this.isOnDuty = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOnDuty() {
        return isOnDuty;
    }

    public void goOnDuty() {
        isOnDuty = true;
        System.out.println(name + " is on duty.");
    }

    public void goOffDuty() {
        isOnDuty = false;
        System.out.println(name + " is off duty.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Watch {
    private Guard guard1;
    private Guard guard2;

    public Watch(Guard guard1, Guard guard2) {
        this.guard1 = guard1;
        this.guard2 = guard2;
    }

    public void startWatch() {
        while (true) {
            guard1.goOnDuty();
            guard2.sleep();
            try {
                Thread.sleep(5000); // simulating time passing by 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            guard2.goOnDuty();
            guard1.sleep();
            try {
                Thread.sleep(5000); // simulating time passing by 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class GuardAndWatch {
    public static void main(String[] args) {
        Guard guard1 = new Guard("Guard 1");
        Guard guard2 = new Guard("Guard 2");

        Watch watch = new Watch(guard1, guard2);
        watch.startWatch();
    }
}
