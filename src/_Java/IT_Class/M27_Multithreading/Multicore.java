package _Java.IT_Class.M27_Multithreading;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Multicore {
    public static void main(String[] args) throws Exception {
        //Число доступных ядер (или процессоров)
        int numCores = Runtime.getRuntime().availableProcessors();

        //System.out.println(numCores);

        //Multi core
        //Start clock
        Instant now = Instant.now();
        //Uses number of available processors
        ExecutorService executorService = Executors.newWorkStealingPool();

        List<Future<Double>> futures = new LinkedList<>();
        int numWorkers = 10;
        for (int i = 0; i < numWorkers; i++) {
            futures.add(i, executorService.submit(new Worker(i)));
        }
        Double avg = 0.0;
        for (int i = 0; i < numWorkers; i++)
            avg += futures.get(i).get();
        Duration duration = Duration.between(now, Instant.now());
        System.out.printf(" Average: %2.3f, duration: %s%n", avg / numWorkers, duration);

        //Single core
        now = Instant.now();
        avg = 0.0;
        for (int i = 0; i < numWorkers; i++){
            Worker worker = new Worker(i);

            avg+=worker.call();
        }
        duration = Duration.between(now, Instant.now());
        System.out.printf(" Average: %2.3f, duration: %s%n", avg / numWorkers, duration);
    }
}

class Worker implements Callable<Double> {
    int id;
    long count = 2 << 20; //Количество добавляемых данных
    List<Double> data = new ArrayList<>();

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public Double call() throws Exception {
        for (long i = 0; i < count; i++)
            data.add(Math.random());
        Double avg = data.stream()
                        .mapToDouble(Double::doubleValue)
                        .summaryStatistics()
                        .getAverage();
        return avg;
    }
}
