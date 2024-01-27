package HomeWorks.HomeWork23_12_12;
import java.util.Scanner;
/*
Известны оценки двух учеников по четырем предметам. Определить сумму
оценок каждого ученика.
 */
public class Task5_57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=2 ; i++) {
            int sumOfSubjects = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.println("Введите оценку по " + j + " предмету " + i + " ученика");
                int mark = scanner.nextInt();
                sumOfSubjects +=mark;
            }
            System.out.printf("Сумма оценок %s ученика равна %s\n", i, sumOfSubjects);

        }
    }
}