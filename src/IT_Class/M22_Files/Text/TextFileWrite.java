package IT_Class.M22_Files.Text;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {
    public static void main(String[] args) {
        //задать имя файла
        String fileName = "src/_data/data.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName, true);
        } catch (IOException e) {
            System.err.println("Не удалось создать файл");
        }
        String s = "Привет, мир!\n";
        try {
            fw.append(s);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}