package M17_StringsGames;
/*
Прыгающие числа: соседние цифры отличаются на 1.
Вывести первые 10 чисел Дизариума (после 100).
*/
public class BouncedNumbers {
    public static void main(String[] args) {
        int number = 100;
        int count = 0;
        do {
            String sNumber = Integer.toString(number);
            int[] digits = new int[sNumber.length()];
            for (int i = 0; i < sNumber.length(); i++) {
                Character c = sNumber.charAt(i);
                digits[i] = Integer.parseInt(c.toString());
            }
            boolean result = true;
            for (int i = 0; i < sNumber.length(); i++) {
                if (i==0 && Math.abs(digits[i+1]-digits[0])!=1) result = false;
                else if (i==sNumber.length()-1 && Math.abs(digits[i-1]-digits[sNumber.length()-1])!=1) result = false;
                else if (i!=0 && i!=sNumber.length()-1
                        && Math.abs(digits[i-1]-digits[i])!=1
                        && Math.abs(digits[i+1]-digits[i])!=1)
                    result = false;
            }
            if (result) {
                System.out.println(number);
                count++;
            }
            number++;
        } while (count<10);
    }
}