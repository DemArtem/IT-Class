package IT_Class.M05_If_Switch_Ternarn;
//состояния воды в зависимости от температуры
import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру воды: ");
        double temperature = scanner.nextDouble();

        if (temperature >= 100) {
            System.out.println("Вода находится в состоянии пара");
        } else if (temperature <= 0) {
            System.out.println("Вода находится в состоянии льда");
        } else {
            System.out.println("Вода находится в состоянии жидкости");
        }
    }
}