package HomeWorks.HW03_If_Switch;
import java.util.Scanner;
/*
Задание 5
Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
года по китайскому календарю.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день рождения: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц рождения: ");
        int month = scanner.nextInt();

        System.out.print("Введите год рождения: ");
        int year = scanner.nextInt();

        if      ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
            System.out.println("Знак зодиака: Козерог");
        else if ((month == 1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
            System.out.println("Знак зодиака: Водолей");
        else if ((month == 2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
            System.out.println("Знак зодиака: Рыба");
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
            System.out.println("Знак зодиака: Овен");
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
            System.out.println("Знак зодиака: Телец");
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
            System.out.println("Знак зодиака: Близнецы");
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
            System.out.println("Знак зодиака: Рак");
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
            System.out.println("Знак зодиака: Лев");
        else        if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
            System.out.println("Знак зодиака: Дева");
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
            System.out.println("Знак зодиака: Весы");
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            System.out.println("Знак зодиака: Скорпион");
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
            System.out.println("Знак зодиака: Стрелец");
        else
            System.out.println("Неверная дата");

        String[] yearsName ={"Крыса","Бык","Тигр","Кролик","Дракон","Змея","Лошадь","Овца","Обезьяна","Петух","Собака","Свинья"};
        int yearNow = 2023;
        int index;
        if (year>=yearNow)
            index = (year-yearNow)%12+3;
        else
            index = 12-(yearNow-year)%12+3;
        System.out.println("По китайскому календарю: " + yearsName[index]);
    }
}