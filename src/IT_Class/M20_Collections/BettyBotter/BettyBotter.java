package IT_Class.M20_Collections.BettyBotter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class BettyBotter {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(); //сортировка с использ натурального порядка
        StringBuilder sb = new StringBuilder();
        String s = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/IT_Class/M20_Collections/BettyBotter/betty"))) {
            do{
                s= br.readLine();
                sb.append(s);
                sb.append(System.lineSeparator());
            } while (s!=null);
        }
        catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.err.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String content = sb.toString();
        content = content.replaceAll("[^A-Za-z]", " ");

        String[] words = content.split(" ");
        for (String s2 : words)
            if ((s2.length() != 0) && ((s2.charAt(0) == 'b') || (s2.charAt(0) == 'B')))
                set.add(s2);
        System.out.println(set.toString());
    }
}
