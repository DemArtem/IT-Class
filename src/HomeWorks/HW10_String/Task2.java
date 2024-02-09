package HomeWorks.HW10_String;
//Дано предложение. Все его символы, стоящие на четных местах, заменить буквой ы.

public class Task2 {
    public static void main(String[] args) {
        String stringOriginal = "Дано предложение. Все его символы, стоящие на четных местах, заменить буквой ы.";
        String stringNew = "";

        for (int i = 0; i < stringOriginal.length(); i++) {
            if (i % 2 != 0) stringNew += 'ы';
            else stringNew += stringOriginal.charAt(i);
        }
        System.out.println(stringNew);
    }
}