package _Java.HomeWorks.HW04_For;
import java.util.Scanner;

/*
Даны числа a1, a2, a3, a4, a5, a6.
Определить их произведение.
*/
public class Task5_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 6 чисел: ");
        int multi = 1;
        for (int i = 1; i <7 ; i++) {
            int a = scanner.nextInt();
            multi *=a;
        }
        System.out.print("Произведение всех чисел равно: " + multi);

    }
}