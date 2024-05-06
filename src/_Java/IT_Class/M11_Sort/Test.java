package _Java.IT_Class.M11_Sort;
/*
1. Вывести все двухзначные числа,
которые делятся на 3, но не делятся на 5
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if(i%3==0 && i%5!=0) System.out.println(i);
        }
    }
}
