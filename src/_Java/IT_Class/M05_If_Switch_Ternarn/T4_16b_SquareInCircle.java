package _Java.IT_Class.M05_If_Switch_Ternarn;

import java.util.Scanner;

public class T4_16b_SquareInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(
                System.in
        );

        System.out.print("Введите площадь квадрата: ");
        double squareArea = scanner.nextDouble();

        System.out.print("Введите площадь круга: ");
        double circleArea = scanner.nextDouble();

        // Найдем радиус круга по формуле площади круга: S = π * r^2
        double radius = Math.sqrt(circleArea / Math.PI);

        // Найдем длину стороны квадрата по формуле площади квадрата: S = a^2
        double side = Math.sqrt(squareArea);

        if (2 * radius >= side) {
            System.out.println("Квадрат умещается в круге");
        } else {
            System.out.println("Квадрат не умещается в круге");
        }
    }
}