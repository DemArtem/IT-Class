package IT_Class.M27_Multithreading;
//Имеются два калькулятора, которые должны работать параллельно.
//После того, как первый вывел сумму, он сообщает второму, что тот также может вывести сумму
public class Summator2 {
    public static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        Calc calculator1 = new Calc();
        calculator1.setName("Calc 1");
        calculator1.start();

        //calculator1.join(300);

        Calc calculator2 = new Calc();
        calculator2.setName("Calc 2");

        calculator2.start();

        calculator1.join(); //фора для кальк1
        calculator2.join(); //фора для кальк2
        System.out.println("Main finished");

    }
}

class Calc extends Thread{
    public int sum = 0;
    public static  Object object = new Object();
    public static volatile boolean finished = false; //завершил ли работу 1й калькулятор

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(200+(int)Math.random()*200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum += i;
            System.out.printf("Calculator: %s, sum: %d%n", this.getName(), sum);
        }

        synchronized (object){
            if (this.getName().equals("Calc 2") && !finished){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        synchronized (object){
            if (this.getName().equals("Calc 1")){
                finished = true;
                object.notify();
            }
        }
        System.out.printf("%s, Sum = %d%n", this.getName(), sum);
    }
}