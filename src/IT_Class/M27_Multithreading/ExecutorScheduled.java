package IT_Class.M27_Multithreading;

import java.util.concurrent.*;
import java.util.stream.Stream;

public class ExecutorScheduled {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        Callable<String> callable1 = getCallable();
        Callable<String> callable2 = getCallable();

        //Можно убрать future, тогда будут выведены только промежуточные результаты

        ScheduledFuture<String> future1 = executorService.schedule(callable1, 1, TimeUnit.SECONDS);
        ScheduledFuture<String> future2 = executorService.schedule(callable2, 2, TimeUnit.SECONDS);

        System.out.println(future1.get());
        System.out.println(future2.get());

        executorService.shutdown();
    }

    static Callable<String> getCallable() {
        Callable<String> callable = () -> {
            Integer sum = Stream.iterate(0, i -> i+1)
                    .limit(10)
                    .map(p->{
                        try {
                            Thread.sleep(10);
                            System.out.println(Thread.currentThread().getName()+": "+p);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return p;})
                    .reduce(0, Integer::sum);
            return Thread.currentThread().getName()+" is finished; sum = "+Long.toString(sum);
        };
        return callable;
    }
}
