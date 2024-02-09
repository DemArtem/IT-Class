package HomeWorks.HW04_For;
import java.util.Scanner;

/*
Составить программу возведения натурального числа в квадрат, учитывая
следующую закономерность:
 */
public class Task5_86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int res = 0;

        for (int i = 1; i<=num; i++) {
            res+=num;
        }
        System.out.println("Квадрат числа " + num + " равен " +res);

    }
}