package IT_Class.M20_Collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Vocabulary_LinkedList {
    public static void main(String[] args) {
        int count = 'z' - 'a' +1;
        List<String> vocab = new LinkedList<>();

        //Заполнить словарь из файла
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/_text/vocab.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null)
                    vocab.add(s);
            }
            while (s != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vocab.size());

        Collections.sort(vocab);

        //вывести первые 10 слов
        ListIterator<String> it = vocab.listIterator(0);
        int i = 0;
        while (it.hasNext() && i<10){
            System.out.print(it.next() + " ");
            i++;
        }
        System.out.println("");

        //вывести последние 10 слов
        it = vocab.listIterator(vocab.size());
        i=0;
        while (it.hasPrevious() && i<10){
            System.out.print(it.previous() + " ");
            i++;
        }
        System.out.println("");

        //вывести, сколько 1-буквенных, 2-буквенных ... слов
        int maxLength = 0;
        for(String word:vocab)
            if(maxLength<word.length())
                maxLength = word.length();
        System.out.println(maxLength);

        int[] hist = new int[maxLength];
        for(String word:vocab)
            hist[word.length()-1]++;

        for(i=0; i<maxLength; i++)
            System.out.printf("Букв: %d, слов: %d%n", i+1, hist[i]);
        System.out.println("");

        //вывести слова-палиндромы
        for(String word:vocab)
            if (word.equals(new StringBuilder(word).reverse().toString()))
                System.out.println("слова-палиндромы: " + word);
        System.out.println("");

        //слова-анаграммы
        Multimap<String, String> anagrams = ArrayListMultimap.create();
        for(String word:vocab) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            anagrams.put(key, word);
        }
        String key="", key2="";
        Map.Entry<String, String> entry2 = null;
        for (Map.Entry<String, String> entry: anagrams.entries()){
            key = entry.getKey();
            if (key.equals(key2))
                System.out.println("слова-анаграммы: " + entry2.getValue() + " " + entry.getValue());
            key2 = key;
            entry2 = entry;
        }
        System.out.println("");

        //найти все слова с 3-мя одинаковыми буквами
        it = vocab.listIterator(0);
        while (it.hasNext()) {
            String s = it.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            count = 1;
            char c = ' ';
            for (i = 0; i < arr.length; i++) {
                char c2 = arr[i];
                if (c == c2) count++;
                else count = 1;
                if (count == 3) { //Проверить с 4-мя буквами
                    System.out.print(s+" ");
                    break;
                }
                c = c2;
            }
        }
        System.out.println();

        //найти слова, где 3 буквы следуют в алфавитном порядке
        it = vocab.listIterator(0);
        while (it.hasNext()) {
            String s = it.next();
            char[] arr = s.toCharArray();
            count = 1;
            char c = ' ';
            for (i = 0; i < arr.length; i++) {
                char c2 = arr[i];
                if (c2-c==1) count++;
                else count = 1;
                if (count == 3) { //Проверить с 4-мя буквами
                    System.out.print(s+" ");
                    break;
                }
                c = c2;
            }
        }
    }
}