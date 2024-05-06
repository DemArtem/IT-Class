package _Java.HomeWorks.HW02_Math;
//Даны два различных вещественных числа. Определить:
//        а) какое из них больше;
//        б) какое из них меньше
public class Task4_6 {
    public static void main(String[] args) {
        double x = 0.5, y = 5.7;
        if (x>y)
            System.out.println("x больше y");
        else if (x<y)
            System.out.println("x меньше y");
        else
            System.out.println("x равно y");
    }
}