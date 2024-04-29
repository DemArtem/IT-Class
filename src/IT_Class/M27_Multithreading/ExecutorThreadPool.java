package IT_Class.M27_Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        Максимум 2 потока будут активны для обработки задач.
        Если передано более двух потоков, они удерживаются в очереди, пока потоки не станут доступными.
        Новый поток создается, чтобы занять его место, если поток завершается из-за сбоя во время выполнения,
        и завершение выполнения для исполнителя (Executor) еще не вызвано.
        Любой поток существует до тех пор, пока пул не будет закрыт.
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        //Из предыдущего приложения взят метод getCallable
        /*
        Callable<String> callable1 = FutureAndCallable.getCallable();
        Callable<String> callable2 = FutureAndCallable.getCallable();
        Callable<String> callable3 = FutureAndCallable.getCallable();

        Future<String> future1 = executorService.submit(callable1);
        Future<String> future2 = executorService.submit(callable2);
        Future<String> future3 =executorService.submit(callable3);

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());

         */

        //То же самое в виде цикла
        List<Future<String>> futures = new ArrayList<>();

        for (int i=0; i<10; i++){
            Callable<String> callable = FutureAndCallable.getCallable();
            futures.add(executorService.submit(callable));
        }


        futures.stream().forEach(f-> {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        System.out.println(Thread.currentThread().getName()+" is finished");

        executorService.shutdown();
    }
}