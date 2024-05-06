package _Java.HomeWorks.HW02_Math;
//Определить, является ли число а делителем числа b? А наоборот? (Получить
//        два ответа.)
public class Task4_34 {
    public static void main(String[] args) {
        int a = 5, b = 15;
        if ((a == 0) || (b == 0))
            System.out.println("Error");
        else if (b % a == 0)
            System.out.println("Да, a является делителем числа b");
        else
            System.out.println("Нет, a не является делителем числа b");

        if ((a == 0) || (b == 0))
            System.out.println("Error");
        else if (a % b == 0)
            System.out.println("Да, b является делителем числа a");
        else
            System.out.println("Нет, b не является делителем числа a");
    }

}