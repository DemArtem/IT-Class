package Modul3;
/*
Даны 3 целых числа. Программа выводит результат логических выражений в виде true или false:
1. Первые два числа равны между собой и не равны третьему;
2. Второе или третье число больше первого;
3. Первое не меньше второго, а второе не больше третьего;
4. Все числа разные;
5. Первое - четное, второе - нечетное, третье - отрицательное;
 */
public class Logical2 {
    public static void main(String[] args) {
        int a=1, b=1, c=3;
        boolean b1 = (a==b)&&(a!=c);
        System.out.println(b1);

        boolean b2 = (b>a)||(c>a);
        System.out.println(b2);

        boolean b3 = (a>=b)&&(b<=c);
        System.out.println(b3);

        boolean b4 = (a!=b)&&(b!=c);
        System.out.println(b4);
    }
}
