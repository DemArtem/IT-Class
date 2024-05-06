package _Java.IT_Class.M11_Sort;

import java.util.Arrays;

/*Shaker sort
Начало как в пузырьковой сортировке - максимальный элемент перемещается вправо.
Затем происходит разворот и минимальный элемент смещается в начало.
 */
public class Shaker {
    static int[] arr = {3, 1, 2, 6, 7, 5, 2, 4};
    static int size =arr.length;

    public static void main(String[] args) {
        shakerSort();
        System.out.println(Arrays.toString(arr));
    }
    public static void shakerSort() {
        int left = 0, right = size-1;
        do {
            for (int i=left; i < right; i++)
                if (arr[i] > arr[i + 1]) {

                    swap(i, i + 1);
                }
            right--;
            for (int i=right; i >= left; i--)
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                }
            left++;
        } while (left<right);
    }

    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}