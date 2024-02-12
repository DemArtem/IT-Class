package IT_Class.M13_Arrays2D_Games.Games;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        Arrays.sort(arr);  //сортируем от мин к макс
        System.out.println(Arrays.binarySearch(arr,5)); //ищем индекс эл-та на ОСТОРТИРОВАННОМ массива
        System.out.println(runBinarySearchIteratively(arr,5,0, arr.length-1));
    }

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}