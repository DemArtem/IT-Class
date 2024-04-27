package IT_Class.M27_Multithreading;

public class RunnersSynchronized2 {
    public static void main(String[] args) {
        //Создать бегуна
        //Поместить бегуна на беговую дорожку
        Runner runner = new Runner();
        Runner runner2 = new Runner();
        //Старт
        runner.start();
        runner2.start();

        runner.resumeProcess();
        runner2.runProcess();

        System.out.println("Бег 1 с");
        runner.runProcess(); //Запустить
        runner2.runProcess(); //1
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Стоп 1 с");
        runner.stopProcess(); //Остановиться
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Бег 1 с");
        runner.resumeProcess();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Финиш");
        runner.interrupt();
        runner2.interrupt(); //2
    }

    static class Runner extends Thread {
        private volatile boolean paused = true;
        public Object lock = new Object(); //Объект для синхронизации

        @Override
        public void run() {
            int i = 0;
            while (!isInterrupted()) {
                System.out.println("Runner " + Thread.currentThread().getName() + " is running, step: " + i);
                waitProcess(); //Бегун сам себя залочил и ждет, кто возобновит его движение с помощью метода notifyAll
                i++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                //e.printStackTrace();
                break;
                }
            }

        //System.out.println("The runner "+Thread.currentThread().getName()+" finished...");
        }

        public void waitProcess() {
            synchronized (lock) {
                if (paused) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


        public void resumeProcess() {
            synchronized (lock) {
                if (paused) {
                    lock.notifyAll();
                    paused = false;
                }
            }
        }

        public void stopProcess() {
            paused = true;
        }

        public void runProcess() {
            paused = false;
        }
    }
} 