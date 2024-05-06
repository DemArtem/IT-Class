package _Java.HomeWorks.HW06_Arr;
//дан массив целых чисел. определить повторяющиеся элементы и вычислить среднее арифметическое неповторяющихся
public class Lab4_04 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 5, 4, 9};

        int sum = 0;
        int count = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("Наличие повторений: " + isDuplicate);

        double average = sum / (double) count;
        System.out.println("Среднее арифметическое: " + average);
    }
}