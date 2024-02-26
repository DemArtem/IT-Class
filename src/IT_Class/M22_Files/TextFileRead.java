package IT_Class.M22_Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {
    public static void main(String[] args) {
        //посимвольное чтение
        //задать имя файла
        String fileName = "src/_data/data.txt";
        StringBuilder sb;
        try (FileReader fr = new FileReader(fileName)){
            System.out.println("Encoding: " + fr.getEncoding());
            sb = new StringBuilder();
            int i;
            while ((i= fr.read())!=-1)
                sb.append((char) i);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}

//построчное чтение
/*public class ReadTextFileStrings {
    public static void main(String[] args) {
        //Задать имя файла
        String fileName = "src/data/data.txt";
        StringBuilder sb;
        try (BufferedReader br =  new BufferedReader(new FileReader(fileName))){
            sb = new StringBuilder();
            while (br.ready()) {
                String line = br.readLine();
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
}
 */
