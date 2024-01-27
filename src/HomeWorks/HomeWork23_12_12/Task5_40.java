package HomeWorks.HomeWork23_12_12;
import java.util.Scanner;
/*
5.40. Даны натуральное число n и вещественные числа
а1, а2 ,а3, ...,аn
Определить сумму всех вещественных чисел
 */
public class Task5_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        System.out.println("Введите вещественные числа a1, a2, ..., an:");
        double sum = 0.;
        for (double i = 0; i < n; i++) {
            double number = scanner.nextDouble();
            sum += number;
        }
        System.out.println("Сумма всех вещественных чисел: " + sum);
    }
}