package M11_Massivs;

import java.util.Arrays;
import java.util.Random;

//сгенерировать последовательность чисел от 1 до 9 и перемешать ее
public class Sample2 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        for (int i=0; i<arr.length; i++)
            arr[i] = i+1;
        System.out.println(Arrays.toString(arr));

        Random random = new Random();
        for (int i=0; i<arr.length; i++) {
            int k = random.nextInt(arr.length);
            int l = random.nextInt(arr.length);
            swap(arr, k, l);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}