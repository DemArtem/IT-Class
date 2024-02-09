package HomeWorks.HW04_For;
/*
Найти сумму
2^2...2^10
Операцию возведения в степень не использовать
 */
public class Task5_75 {
    public static void main(String[] args) {
        int base = 2; //основание
        int degree = 2; //степень
        int sum = 0;
        for (int i = base; i <10 ; i++) {
            int num = 1; //число в степени
            for (int j = degree; j <10 ; j++) {
                num *= base;
            }
            sum += num;
        }
        System.out.print("Сумма " + sum);
    }
}