package HomeWorks.HW14_Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Имеется текстовый файл.
а) Найти длину самой длинной строки.
 */
public class Task3 {
    public static void main(String[] args) {
        File file = new File("src/_data/task3.txt");

        int maxLength = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() > maxLength) {
                    maxLength = line.length();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("Самая длинная строка в файле имеет длину: " + maxLength + " символов.");
    }
}