package IT_Class.M25_Multithreading;

//Имеются два калькулятора, которые должны работать параллельно.
//После того, как первый вывел сумму, он сообщает второму, что тот также может вывести сумму
public class Summator2 {
    public static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        Calc calculator1 = new Calc();
        calculator1.setName("Calc 1");
        calculator1.start();

        Calc calculator2 = new Calc();
        calculator2.setName("Calc 2");

        //calculator1.join(); вкл/выкл многопоточность
        calculator2.start();
    }
}

class Calc extends Thread{
    public int sum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            try {
                Thread.sleep(200+(int)Math.random()*200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum += i;
            System.out.printf("Calculator: %s, sum: %d%n", this.getName(), sum);
        }
        System.out.printf("%s, Sum = %d%n", this.getName(), sum);
    }
}