package IT_Class.M14_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://regex101.com/
public class RegularExpressions {
    public static void main(String[] args) {
        //1
        Pattern pattern = Pattern.compile("\\w\\w"); //шаблон
        Matcher matcher = pattern.matcher("as"); //совпадение
        boolean b = matcher.matches();
        System.out.println(b);

        //2
        boolean b2 = Pattern //chaining - создание цепочки из действий
                .compile("\\w\\s")
                .matcher("a ")
                .matches();
        System.out.println(b2);

        //3
        boolean b3 = Pattern.matches("\\w\\s", "a ");
        System.out.println(b3);

        //4
        check("\\w\\s", "a ", "a1");

        //Строка содержит только один символ
        check(".", "a", "a1");

        //Строка содержит одну или более букву "a", а за ней одну букву "b"
        check("a+b", "aab", "abb");

        //Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"
        check("a*b", "aab", "abb");

        //Слово состоит из двух букв, первая из которых "a"
        check("a?[a-zA-Z]", "ab", "ba");

        //Строка начинается на букву "a"
        check("a.*", "ab", "Ab");

        //Строка заканчивается на букву "a"
        check(".*a", "aba", "b_");

        //Строка заканчивается на "as"
        check(".*as", "aas", "b_s");

        //Строка содержит "as"
        check(".*as.*", "aas2", "b_sa");

        //Строка не содержит "a"
        check("[^a]*", "ssg", "ba_");

        //Слово(буквенная строка) содержит букву "a"
        check("[a-zA-Z]*a[a-zA-Z]*", "aba", "b_");

        //Проверить написание номера телефона в формате 8(025)-515-03-94
        check("8\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}", "8(025)-515-03-94", "+375(25)-515-03-94");

        //В строке содержатся цифры
        check(".*\\d+.*", "ssg684684", "ba_");

        //Строка содержит только цифры
        check("\\d+", "123", "b3a_");

        //Строка является вещественным числом с фиксированной точкой
        check("[+-]?\\d+.?\\d+", "-12.3", "35l");

        //Содержит ни одного или более сочетаний "ab", а затем "c"
        check(".*(ab)*c", "abc", "bak");

        //Содержит одно или более сочетаний "ab", а затем "c"
        check(".*(ab)+c", "abc", "bac");

        //Строка не должна начинаться с букв a,b
        check("[^ab].*", "cab", "bac");

        //Строка является "end."
        check("end.", "end.", "bac");
    }

    static void check(String regex, String sTrue, String sFalse){ //4
        boolean bTrue = Pattern.matches(regex,sTrue);
        boolean bFalse = Pattern.matches(regex,sFalse);
        System.out.printf("%b %b\n", bTrue, bFalse);
    }
}
