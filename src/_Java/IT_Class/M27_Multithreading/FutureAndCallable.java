package _Java.IT_Class.M27_Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class FutureAndCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Напоминает runnable, но в отличие от него:
        //возвращает результат,
        //выбрасывает исключение (поэтому не надо писать его обработку)
        Callable<String> callable = getCallable();

        FutureTask<String> future = new FutureTask<>(callable);
        new Thread(future).start();
        System.out.println(future.get());
        System.out.println(Thread.currentThread().getName()+" is finished");
    }

    static Callable<String> getCallable() {
        Callable<String> callable = () -> {
            Integer sum = Stream.iterate(0, i -> i+1)
                    .limit(10)
                    .map(p->{
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return p;})
                    .reduce(0, Integer:: sum);
            return Thread.currentThread().getName()+" is finished; sum = " + sum;
        };
        return callable;
    }
}