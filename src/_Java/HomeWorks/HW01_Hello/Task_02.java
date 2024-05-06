package _Java.HomeWorks.HW01_Hello;

public class Task_02 {
    public static void main(String[] args) {
        //В переменной n хранится натуральное (целое) трехзначное число.
        int n=123;
        System.out.println("Сумма цифр числа " + n +" равна "+((n%10)+((n/10)%10)+(n/100))); //сумму цифр числа n
    }
}