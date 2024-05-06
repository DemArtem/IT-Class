package _Java.HomeWorks.HW03_If_Switch;
import java.util.Scanner;
/*
С клавиатуры вводится время (количество часов от 0 до
24) – программа выводит приветствие, соответствующее
введенному времени (например, ввели 15 часов – выводится
приветствие «Добрый день»).
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите время (количество часов): ");
        int hour = scanner.nextInt();
/*
с 0 до 6 часов — ночь
с 6 до 12 часов — утро
с 12 до 18 часов — день
с 18 до 24 часов — вечер
 */
        if (hour>=0 && hour<6)
            System.out.println("Сейчас ночь");
        else if (hour>=6 && hour<12)
            System.out.println("Сейчас утро");
        else if (hour>=12 && hour<18)
            System.out.println("Сейчас день");
        else if (hour>=18 && hour<=24)
            System.out.println("Сейчас вечер");
        else
            System.out.println("Вы что-то не то ввели");
    }
}