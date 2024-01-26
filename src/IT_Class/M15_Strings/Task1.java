package IT_Class.M15_Strings;

public class Task1 {
    public static void main(String[] args) {
        //поиск совпадения буквы из "таргета" в данном слове и добавление его в результат
        String givenWord = "программа";
        String target1 = "мрамор";

        char[] wordArr = givenWord.toCharArray();
        char[] target1Arr = target1.toCharArray();
        StringBuilder sb = new StringBuilder();

        //брейк, чтобы не было повторных сопадений
        for (char ch : target1Arr) {
            for (char letter : wordArr) {
                if (ch == letter) {
                    sb.append(ch);
                    break;
                }
            }
        }
        String result = sb.toString();
        System.out.println(target1.equals(result));
    }
}