package M15_Strings;

public class Repeat {
    public static void main(String[] args) {
        String s = "Посчитать количество повторяющихся символов в строке";
        // Посчитать количество уникальных символов
        for (int i=0; i<s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(i)==s.charAt(j))
                    flag = false;
            if (flag) System.out.print(s.charAt(i));
        }
    }
}
