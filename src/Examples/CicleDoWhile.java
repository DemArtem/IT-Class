package Examples;

import java.util.Scanner;

public class CicleDoWhile {
    public static void main(String[] args) {
        //вводим в консоль числа. пока не введем 5 программа работает
        //цикл While
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 5: ");
        int a = scanner.nextInt();
        while (a!=5){
            System.out.print("Введите число 5: "); //дублирование кода = моветон
            a = scanner.nextInt(); //дублирование кода = моветон
        }
        System.out.println("Вы ввели число 5");
        System.out.println("");

        //цикл Do While
        Scanner scanner2 = new Scanner(System.in);
        int b;
        do {
            System.out.print("Введите число 8: ");
            b = scanner2.nextInt();
        } while (b!=8);
        System.out.println("Вы ввели число 8");
    }
}