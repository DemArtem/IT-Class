package _Java.HomeWorks.HW03_If_Switch;
import java.util.Scanner;
/*
Написать программу, которая предлагает пользователю
выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
ответ показывает, какие звуки издает выбранное животное.
В списке должно быть не менее 10 животных.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Выберите животное:\n1-кошка\n2-собака\n3-корова\n4-голубь\n5-ворона\n6-лошадь\n7-рыбы\n8-петух\n9-утка\n10-лягушка ");
        int animal = scanner.nextInt();

        switch (animal) {
            case 1:
                System.out.print("Мяу-мяу");
                break;
            case 2:
                System.out.print("Гав-гав");
                break;
            case 3:
                System.out.print("Мууу");
                break;
            case 4:
                System.out.print("Уррр");
                break;
            case 5:
                System.out.print("Кааар");
                break;
            case 6:
                System.out.print("Игогооо");
                break;
            case 7:
                System.out.print("---");
                break;
            case 8:
                System.out.print("Кукареку");
                break;
            case 9:
                System.out.print("Кря-кря");
                break;
            case 10:
                System.out.print("Ква-ква");
                break;
            default:
                System.out.print("Вы что-то не так ввели");
        }
    }
}