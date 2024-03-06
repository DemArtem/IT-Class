package HomeWorks.HW14_Text;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
Имеется текстовый файл. Напечатать:
а) все его строки, начинающиеся с буквы Т;
 */
public class Task1 {
    public static void main(String[] args) {
        String fileName = "src/_data/task1.txt";
        StringBuilder sb;
        try (BufferedReader br =  new BufferedReader(new FileReader(fileName))){
            sb = new StringBuilder();
            while (br.ready()) {
                String line = br.readLine();
                sb.append(line);
                if (line.startsWith("Т"))
                    System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
