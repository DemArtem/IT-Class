package IT_Class.M27_Multithreading;

import java.util.concurrent.ThreadLocalRandom;

/*
Отправитель посылает пакеты Получателю.
Получатель не может обрабатывать пакет данных, пока отправитель не закончит его отправку.
Отправитель не должен пытаться отправить следующий пакет, пока получатель не закончит обработку предыдущего пакета.
Такой процесс называется aсинхронным (блокирующим).
 */
public class SenderReceiver {
    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }
}

class Data {
    private String packet;

    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;

    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        transfer = true;

        this.packet = packet;
        notifyAll();
        return packet;
    }

    public synchronized void send(String packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        transfer = false;

        this.packet = packet;
        notifyAll();
    }
}

class Sender implements Runnable {
    private Data data;

    public Sender(Data data){

        this.data = data;
    }

    public void run() {
        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };

        for (String packet : packets) {
            data.send(packet);

            // Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 500));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }
}

class Receiver implements Runnable {
    private Data data;

    public Receiver(Data data){

        this.data = data;
    }

    public void run() {
        for(String receivedMessage = data.receive();
            !"End".equals(receivedMessage);
            receivedMessage = data.receive()) {

            System.out.println(receivedMessage);


            //Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 500));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }
}