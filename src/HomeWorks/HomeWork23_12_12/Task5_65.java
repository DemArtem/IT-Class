package HomeWorks.HomeWork23_12_12;
import java.util.Scanner;
/*
В области 12 районов. Известны количество жителей каждого района (в тысячах человек)
и плотность населения в нем (тыс. чел./км2). Определить общую площадь территории области.
 */
public class Task5_65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество жителей районов (тыс.чел): ");
        double sumOfNum = 0.;
        for (int i =1; i <= 12; i++) {
            double num = scanner.nextDouble();
            sumOfNum += num;
        }
        System.out.println("Общее количество жителей всех районов (тыс. чел): " + sumOfNum);

        System.out.println("Введите плотность населения районов (тыс.чел/км2): ");
        double sumOfdensity = 0.;
        for (int i =1; i <= 12; i++) {
            double dendity = scanner.nextDouble();
            sumOfdensity += dendity;
        }
        System.out.println("Общее количество жителей всех районов (тыс. чел): " + sumOfdensity);
        double area = sumOfNum/sumOfdensity;
        System.out.println("Общая площадь территории области (км2): " + area);
    }
}