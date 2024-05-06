package _Java.IT_Class.M11_Sort;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    static int[][] arr;
    static int rows;
    static int cols;

    public static void main(String[] args) {

        Random random = new Random();
        rows = random.nextInt(20) + 10;
        arr = new int[rows][];
        for (int i = 0; i < arr.length; i++) {
            cols = random.nextInt(20) + 1;
            arr[i] = new int[cols];
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();
        sortLengths();
        printResult();

    }

    static void sortLengths(){
        for (int i = 0; i < rows; i++) {
            int[] min = findMin(i);
            for (int j = i; j < rows; j++) {
                if (arr[j]==min){
                    swap(i,j);
                    break;
                }
            }
        }
    }

    static void printResult(){
        for (int[] cell: arr){
            System.out.println(Arrays.toString(cell));
        }
    }

    static void swap(int i, int j){
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] findMin(int startIndex){
        int[] min = arr[startIndex];
        for (int index = startIndex; index < rows; index++) {
            if (arr[index].length< min.length){
                min = arr[index];
            }
        }
        return min;
    }
}