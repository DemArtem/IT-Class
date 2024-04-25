package IT_Class.M26_Multithreading;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/*
Касса в магазине.
Первый поток (продавец) находится на кассе.
Второй поток (покупатель) набирает корзину товаров, подходит к кассе.
Продавец подсчитывает сумму товара, сообщает ее покупателю.
Покупатель рассчитывается и уходит.
Создается еще один поток-покупатель и цикл повторяется.
Последовательность операторов вывода в консоль:
Продавец ждет
Нажмите Enter, чтобы создать следующего покупателя
Покупатель 1 набирает корзину
Покупатель 1 подходит к кассе
Покупатель 1 ждет продавца
Продавец рассчитал сумму товара покупателя: 1, сумма: 74,01
Покупатель 1 рассчитывается и уходит
 */
public class Checkout {
    static AtomicInteger numCustomer = new AtomicInteger(1); //операция выполн за 1 действие
    static Object mutex = new Object();
    static Seller seller = new Seller();
    static Customer customer;

    public static void main(String[] args) {
        new Thread(seller).start();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Нажмите Enter, чтобы создать следующего покупателя");
            String s = scanner.nextLine();
            customer = new Customer();
            new Thread(customer).start();
        }
    }

    static class Seller implements Runnable {
        Random random = new Random();

        @Override
        public void run() {
            while (true) {
                synchronized (mutex) {
                    System.out.println("Продавец ждет");
                    try {
                        mutex.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("Продавец рассчитал сумму товара покупателя: %d, сумма: %f%n",
                            customer.id
                            , customer.sum);
                    mutex.notify();
                    try {
                        mutex.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Customer implements Runnable{
        public int id = numCustomer.getAndIncrement();
        public double sum = Math.random()*100; //Общая сумма покупки

        @Override
        public void run() {
            synchronized (mutex) {
                System.out.printf("Покупатель %d набирает корзину%n", id);
                try {
                    Thread.sleep(200); //Набирает корзину
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Покупатель %d подходит к кассе%n", id);
                mutex.notify(); //Будит продавца
                System.out.printf("Покупатель %d ждет продавца%n", id);
                try {
                    mutex.wait(); //Ждет
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Покупатель %d рассчитывается и уходит%n", id);
                mutex.notify();
            }
        }
    }
}

