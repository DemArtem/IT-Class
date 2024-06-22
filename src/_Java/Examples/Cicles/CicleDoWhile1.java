package _Java.Examples.Cicles;

import java.util.Scanner;
//ввести с клавиатуры строку и число number(0-5)
//вывести на экран строку number раз
public class CicleDoWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();
        do{
            System.out.println(string);
            number--;
        }while (number>0 && number<4);
    }
}
