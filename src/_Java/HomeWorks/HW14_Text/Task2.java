package _Java.HomeWorks.HW14_Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
Имеется текстовый файл. Найти:
а) количество строк, начинающихся с букв А или а;
 */
public class Task2 {

    public static void main(String[] args) {
        String fileName = "src/Java.Java.IT_Class._data/task2.txt";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("А") || line.startsWith("а")) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Количество строк, начинающихся с буквы A или a: " + count);
    }
}
