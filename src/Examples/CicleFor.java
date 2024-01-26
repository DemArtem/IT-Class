package Examples;
import java.util.Scanner;
public class CicleFor {
    public static void main(String[] args) {
        //вывод чисел от 1 до 5
        for (int i = 1; i < 6; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");

        //вывод чисел от 5 до 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println("");

        //таблица умножения на 3
        for (int i = 1; i <11 ; i++) {
            System.out.print("3 * " + i + " = " + 3*i + "; ");
        }
        System.out.println("");

        //найти квадрат числа
        int j = 1;
        for (; j<3;){
            System.out.printf("Квадрат числа %d равен %d \n", j, j * j);
            j++;
        }

        //пользователь вводит число a. программа считает сумму всех чисел от 1 до a
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i;
        }
        System.out.print("Результат: " + result);
    }
}