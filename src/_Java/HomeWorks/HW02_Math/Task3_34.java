package _Java.HomeWorks.HW02_Math;
/*
Поле шахматной доски определяется парой натуральных чисел, каждое из которых не превосходит 8:
первое число — номер вертикали (при счете слева направо), второе — номер горизонтали (при счете снизу вверх).
Даны натуральные числа a, b, c, d, каждое из которых не превосходит 8.
 */
public class Task3_34 {
    public static void main(String[] args) {
        //а) На поле (a, b) расположена ладья. Записать условие, при котором она угрожает полю (c, d).
        int x1 = 2, y1 = 1;
        int x2 = 2, y2 = 3;
        if (x1 == x2 || y1 == y2)
            System.out.println(true);
        else System.out.println(false);

        //б) На поле (a, b) расположен слон. Записать условие, при котором он угрожает полю (c, d).
        x1 = 2;
        y1 = 1;
        x2 = 4;
        y2 = 3;
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2))
            System.out.println(true);
        else System.out.println(false);
    }
}