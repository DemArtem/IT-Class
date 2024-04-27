package IT_Class.M27_Multithreading;

public class RunnersSynchronized {
    public static void main(String[] args) {
        //Создать бегуна
        //Поместить бегуна на беговую дорожку
        Runner runner = new Runner();
        //Старт
        runner.start(); //1

        System.out.println("Бег 1 с");
        runner.runProcess(); //Запустить
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
        runner.resumeProcess(); //2-й комментарий. Продолжить движение после stop можно только с помощью нотификации
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Финиш");
        runner.interrupt();  //1-й комментарий
    }

    static class Runner extends Thread {
        private volatile boolean paused = true;
        public final Object lock = new Object(); //Объект для синхронизации

        @Override
        public void run() {  //2
            int i = 0;
            while (!isInterrupted()) {
                System.out.println("Runner " + Thread.currentThread().getName() + " is running, step: " + i);
                waitProcess(); //3 Бегун сам себя залочил и ждет, кто возобновит его движение с помощью метода notifyAll
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
                        lock.wait(); //4
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