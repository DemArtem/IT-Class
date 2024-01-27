package HomeWorks.HomeWork23_12_08;
import java.util.Scanner;
/*
Дана точка на плоскости заданная координатами x и y,
определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
Четверти обозначены римскими цифрами.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = scanner.nextInt();
        System.out.print("Введите y: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0)
            System.out.println("Точка находится в 1й четверти");
        else if (x < 0 && y > 0)
            System.out.println("Точка находится во 2й четверти");
        else if (x < 0 && y < 0)
            System.out.println("Точка находится в 3й четверти");
        else if (x > 0 && y < 0)
            System.out.println("Точка находится в 4й четверти");
        else
            System.out.println("Вы что-то не то ввели");
    }
}