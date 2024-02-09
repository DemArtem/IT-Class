package HomeWorks.HW04_For;
/*
Найти 15 первых натуральных чисел, делящихся нацело на 19 и находящихся
в интервале, левая граница которого равна 100.
 */
public class Task6_34 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; count < 15; i++) {
            if (i % 19 == 0) {
                System.out.println(i);
                count++;
            }
        }
    }
}