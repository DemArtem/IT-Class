package IT_Class.M05_If_Switch_Ternarn;

import java.util.Scanner;

/*Известны площади круга и квадрата. Определить:
а) уместится ли круг в квадрате?
б) уместится ли квадрат в круге?
*/
public class T4_16a_CircleInSquare {
    public static void main(String[] args) {
        //a
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите площадь круга: ");
        double circleArea = scanner.nextDouble();

        System.out.print("Введите площадь квадрата: ");
        double squareArea = scanner.nextDouble();

        // Вычисляем радиус круга по его площади
        double circleRadius = Math.sqrt(circleArea / Math.PI);

        // Вычисляем длину стороны квадрата по его площади
        double squareSide = Math.sqrt(squareArea);

        // Проверяем, уместится ли круг в квадрате
        if (circleRadius <= squareSide / 2) {
            System.out.println("Круг умещается в квадрате");
        } else {
            System.out.println("Круг не умещается в квадрате");
        }

    }

}