package _Java.IT_Class.M13_String.StringGames;
/*
Сбалансированные числа: сумма цифр слева от середины равна сумме цифр справа от середины.
Вывести первые 10 4-значных сбалансированных чисел.
 */
public class BalancedNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1000; // Начинаем с 4-значного числа
        while (count < 10) { // Выводим первые 10 сбалансированных чисел
            if (isBalanced(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isBalanced(int number) {
        String numberString = String.valueOf(number);
        int length = numberString.length();

        // Разделяем число на левую и правую части
        String left = numberString.substring(0, length / 2);
        String right = numberString.substring((length + 1) / 2);

        // Вычисляем сумму цифр каждой части
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < length / 2; i++) {
            leftSum += Character.getNumericValue(left.charAt(i));
            rightSum += Character.getNumericValue(right.charAt(i));
        }

        // Проверяем сбалансированность числа
        return leftSum == rightSum;
    }
}
