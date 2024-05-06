package _Java.HomeWorks.HW02_Math;
//Дано натуральное число. Определить:
//        а) является ли оно четным;
//        б) оканчивается ли оно цифрой 7
public class Task4_22 {
    public static void main(String[] args) {
        int x = 76;
        //а
        if (x%2==0)
            System.out.println("x - четное число");
        else
            System.out.println("x - нечетное число");
        //б
        if (x%10==7)
            System.out.println("x - оканчивается цифрой 7");
        else
            System.out.println("x - неоканчивается цифрой 7");
    }
}