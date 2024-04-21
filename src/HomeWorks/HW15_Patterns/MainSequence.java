package HomeWorks.HW15_Patterns;

import java.util.Scanner;
/*
Разработать приложение, генерирующее несколько последовательностей чисел
(по заранее заданному алгоритму, например, последовательность чисел Фибоначчи,
последовательность простых чисел, последовательность факториалов целых неотрицательных чисел).
Генерирование типа последовательности и количество генерируемых элементов должно определяться пользователем.
Для каждой последовательности после генерации указать время работы соответствующего алгоритма.
Определение этого времени реализовать, используя шаблон проектирования «Decorator».
 */
interface Sequence {
    void generateSequence(int n);
}

class FibonacciSequence implements Sequence {
    @Override
    public void generateSequence(int n) {
        long startTime = System.currentTimeMillis();

        int first = 0;
        int second = 1;
        int next;

        System.out.println("Fibonacci sequence:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

        System.out.println("\nTime taken: " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}

class PrimeSequence implements Sequence {
    @Override
    public void generateSequence(int n) {
        long startTime = System.currentTimeMillis();

        System.out.println("Prime number sequence:");

        int count = 0;
        int num = 2;

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }

        System.out.println("\nTime taken: " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}

class FactorialSequence implements Sequence {
    @Override
    public void generateSequence(int n) {
        long startTime = System.currentTimeMillis();

        System.out.println("Factorial sequence:");

        for (int i = 0; i < n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.print(factorial + " ");
        }

        System.out.println("\nTime taken: " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}

class SequenceDecorator implements Sequence {
    protected Sequence sequence;

    public SequenceDecorator(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void generateSequence(int n) {
        sequence.generateSequence(n);
    }
}

class MainSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sequence type: ");
        System.out.println("1. Fibonacci sequence");
        System.out.println("2. Prime number sequence");
        System.out.println("3. Factorial sequence");

        int choice = scanner.nextInt();
        System.out.println("Enter the number of elements to generate: ");
        int n = scanner.nextInt();

        Sequence sequence = null;

        switch (choice) {
            case 1:
                sequence = new FibonacciSequence();
                break;
            case 2:
                sequence = new PrimeSequence();
                break;
            case 3:
                sequence = new FactorialSequence();
                break;
            default:
                System.out.println("Invalid choice");
        }

        if (sequence != null) {
            sequence = new SequenceDecorator(sequence);
            sequence.generateSequence(n);
        }
    }
}