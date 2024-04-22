package IT_Class.M26_Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//гонки
public class ConcurrencyCondition {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Counter counter = new Counter();
        for(int i = 0; i < 1000; i++) {
            executorService.submit(() -> counter.increment());
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println("Final count is : " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    public void increment() {
        count = count+1;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getCount() {
        return count;
    }
}