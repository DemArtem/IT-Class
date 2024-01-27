package HomeWorks.HomeWork23_12_08;

import java.util.Scanner;

/*
Написать программу, которая предлагает пользователю
ввести c клавиатуры номер дня недели, и в ответ показывает название этого дня (например, 6 – это суббота). Решить с
использованием switch.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите номер дня недели: ");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.print("Понедельник"); break;
            case 2:
                System.out.print("Вторник"); break;
            case 3:
                System.out.print("Среда"); break;
            case 4:
                System.out.print("Четверг"); break;
            case 5:
                System.out.print("Пятница"); break;
            case 6:
                System.out.print("Суббота"); break;
            case 7:
                System.out.print("Воскресенье"); break;
            default:
                System.out.print("Вы что-то не так ввели");
        }
    }
}