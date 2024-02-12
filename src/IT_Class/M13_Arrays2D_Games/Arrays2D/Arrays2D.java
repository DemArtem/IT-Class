package IT_Class.M13_Arrays2D_Games.Arrays2D;

import java.util.Arrays;

public class Arrays2D {
    static int[][] arr;
    static int rous = 6; //строка
    static int cols = 5; //столбец
    public static void main(String[] args) {
        arr = new int[rous][cols];
        fillOrder();
        //fillOrderUD();
        //fillSnake();
        //travelSES();
        travelSNE();
        print();
        //System.out.println(Arrays.toString(arr[i]));

    }
    static void print(){ //выводим массив
        for (int i = 0; i < rous; i++)
            System.out.println(Arrays.toString(arr[i]));
    }
    static void fillOrder(){ //заполняем массив слева направо (по порядку)
        for (int i = 0; i < rous; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = j+1+i*cols;
            }
        }
    }
    static void fillOrderUD(){ //заполняем массив сверху вниз
        for (int i = 0; i < rous; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = i+1+j*rous;
            }
        }
    }
    static void fillSnake(){ //заполняем массив змейкой
        for (int i = 0; i < rous; i++) {
            for (int j = 0; j < cols; j++)
                if(i%2==0) arr[i][j] = j+1+i*cols;
            else arr[i][j] = cols-j+i*cols;
        }
    }
    static void travelSES(){ //заполняем массив по заданному пути(SE-S-SE-S..)
        int i=0, j=0;
        while (i<=arr.length || j<=arr[i].length){
            i++; j++;
            if (i<arr.length && j<arr[i].length)
                System.out.println(arr[i][j]);
            else break;
            i++;
            if (i<arr.length && j<arr[i].length)
                System.out.println(arr[i][j]);
            else break;
        }
    }
    static void travelSNE(){ //заполняем массив по заданному пути(S-NE-S-NE..)
        int i=0, j=0;
        while (i<=arr.length || j<=arr[i].length){
            j++;
            if (i<arr.length && j<arr[i].length)
                System.out.println(arr[i][j]);
            else break;
            i++; j++;
            if (i<arr.length && j<arr[i].length)
                System.out.println(arr[i][j]);
            else break;
        }
    }
}
