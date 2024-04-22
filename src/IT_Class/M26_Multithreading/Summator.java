package IT_Class.M26_Multithreading;

//Имеются два калькулятора, которые должны работать параллельно.
//Окончательно сумма выводится сначала для первого, затем для второго
//Если второй калькулятор завершил вычисления быстрее, то программа зависнет (второй уведомил о завершении первым,
// а затем начался цикл ожидания его завершения.
// Нотификация не достигла цели. Ждали одного, а пришел другой.

public class Summator {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.setName("Calc 1");
        calculator1.start();
        Calculator calculator2 = new Calculator();
        calculator2.setName("Calc 2");
        calculator2.start();

        synchronized (calculator1) {
            try {
                calculator1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Calc1, Sum = "+ calculator1.sum);

        if (calculator2.isAlive()) //Решение: Проверяем, работает ли еще второй поток
        synchronized (calculator2) {
            try {
                calculator1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Calc2, Sum = "+ calculator2.sum);
    }
}

class Calculator extends Thread {
    public int sum = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 11; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sum += i;
                System.out.printf("Calculator: %s, sum: %d%n", this.getName(), sum);
                //while (true) notify(); //Нельзя, зависнет на этом цикле
            }
            notify();
        }
    }
}