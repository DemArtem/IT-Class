package M15_Strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String s;
        s = "string 1";
        System.out.println(s.hashCode());
        s = "string 2";
        System.out.println(s.hashCode());

        char c = '1';
        System.out.println((int)c);

        //String s2 = new String("string 1");
        //System.out.println("%d %d%n", s.hashCode(), s2.hashCode());

        c = s.charAt(0); //выделить первый символ строки
        System.out.println(c);

        s = "1234";
        System.out.println(s.charAt(s.length()-1)); //выделить последний символ

        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s = ""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s);

        String s1 = "first", s2 = "second";
        System.out.println(s1.equals(s2)); //сравнение строк
        System.out.println(s1.compareTo(s2));

        //проверить содержит ли строка только цифры
        String s3 = "12345e6";
        boolean result = true;
        for (int i = 0; i <s3.length(); i++) {
            if((!Character.isDigit(s3.charAt(i))))
                result = false;
        }
        System.out.println(result);

        //Проверить, содержит ли строка данную последовательность символов
        s = "good";
        s2 = "oo";
        System.out.println(s.contains(s2));

        //Проверить, одинаковы ли строки
        s = "good";
        //s2 = "good";
        s2 = new String("good");
        boolean answer = s == s2 ? true : false; //сравнение ссылок на объект
        //answer = s.equals(s2) ? true : false; //сравнение содержимого объекта
        System.out.println("Строки одинаковы: " + answer);

        //Заменить символ в строке (точку на вопросительный знак
        s = "Why is garbage collection necessary in Java.";
        int i = s.indexOf('.'); //узнать номер символа
        System.out.println(i);
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i,'?');
        s = sb.toString();
        System.out.println(s);

        //Заменить подстроку в строке
        s = "JVM is a %s virtual machine.";
        s = s.replace("%s", "Java");
        System.out.println(s);

        //Извлечь из строки подстроку JRE
        s = "JDK vs JRE vs JVM";
        i = s.indexOf("JRE");
        s2 = s.substring(i,i+"JRE".length());
        System.out.println(s2);

        //Удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        s = s.replaceAll("[{}]", "");
        System.out.println(s);

        //Заменить первую букву на прописную
        s = "what is JIT compiler in Java?";
        StringBuilder sb1 = new StringBuilder(s);
        s2 = s.substring(0,1); //w
        s2 = s2.toUpperCase(); //W
        Character c0 = s2.charAt(0); //W
        sb1.setCharAt(0,c0);
        System.out.println(sb1);

        //Разбить строку на подстроки
        s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
        String[] sArr = s.split("\n");
        System.out.println(Arrays.toString(sArr));

        //Удалить концевые пробелы
        s = " Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                + "inheritance, encapsulation, polymorphism, abstraction. ";
        String sresult = s.trim();
        System.out.println(sresult);
    }
}
