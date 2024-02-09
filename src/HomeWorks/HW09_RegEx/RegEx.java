package HomeWorks.HW09_RegEx;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        //Выполнить валидацию номера телефона в формате +111 (202) 555-0125
        check("\\+\\d{3}\\s\\(\\d{3}\\)\\s\\d{3}-\\d{4}", "+111 (202) 555-0125","8 (202) 555-0125)");

        //Выполнить валидацию даты в формате 30.12.2023
        check("\\d{2}\\.\\d{2}\\.\\d{4}", "30.12.2023","30.12.23");

        //Выполнить валидацию личного идентификационного номера РБ: 3111111E001PB0
        check("\\d{7}[A-Z]\\d{3}[A-Z]{2}\\d", "3111111E001PB0","3111111e001pb0");
    }
    static void check (String regex, String sTrue, String sFalse){
        boolean bTrue = Pattern.matches(regex, sTrue);
        boolean bFalse = Pattern.matches(regex, sFalse);
        System.out.printf("%b %b\n", bTrue, bFalse);
    }
}