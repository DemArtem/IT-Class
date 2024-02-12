package IT_Class.M16_Recursion;

import java.util.Arrays;

/*
12.28 | 12.29
//некврадратный массив
 */
public class Task12_28_2 {
    static int rows = 5,
            cols = 5,
            number = 1,
            upOffSet = 0,
            rightOffSet = 0,
            botOffSet = 0,
            leftOffSet = 0;

    static int[][] arr = new int[rows][cols];

    public static void main(String[] args) {
        while (number < rows * cols + 1) {
            fillUpRow();
            fillRightCol();
            fillBotRow();
            fillLeftCol();
        }
        print();
    }

    static void fillUpRow() {
        for (int index = leftOffSet; index < cols; index++) {
            if (arr[leftOffSet][index] > 0) {
                break;
            }
            arr[leftOffSet][index] = number++;
        }
        upOffSet++;
    }

    static void fillRightCol() {
        for (int index = upOffSet; index < rows; index++) {
            if (arr[index][cols - upOffSet] > 0) {
                break;
            }
            arr[index][cols - upOffSet] = number++;
        }
        rightOffSet++;
    }

    static void fillBotRow() {
        for (int index = cols - 1 - rightOffSet; index >= 0; index--) {
            if (arr[rows - rightOffSet][index] > 0) {
                break;
            }
            arr[rows - rightOffSet][index] = number++;
        }
        botOffSet++;
    }

    static void fillLeftCol() {
        for (int index = rows - 1 - botOffSet; index >= 0; index--) {
            if (arr[index][leftOffSet] > 0) {
                break;
            }
            arr[index][leftOffSet] = number++;
        }
        leftOffSet++;
    }

    static void print() {
        for (int[] cell : arr) {
            System.out.println(Arrays.toString(cell));
        }
    }
}
