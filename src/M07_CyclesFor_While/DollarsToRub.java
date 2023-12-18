package M07_CyclesFor_While;

import java.util.Scanner;

//5.10. Напечатать таблицу перевода 1, 2, ... 20 долларов США в рубли по текущему
//курсу (значение курса вводится с клавиатуры).
public class DollarsToRub {
    public static void main(String[] args) {
        //3.3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара к рублю ");
        double course = scanner.nextDouble();

        for (int i=1; i<=20; i++)
            System.out.printf("%d USD=%fBYN\n",i,i*course);

    }
}
