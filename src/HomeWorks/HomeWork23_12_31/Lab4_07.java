package HomeWorks.HomeWork23_12_31;
//найти положительную подпоследовательность наибольшей длины
//и поместить результат в массив

import java.util.Arrays;

public class Lab4_07 {
    public static void main(String[] args) {
        //Объявление и инициализация
        int[] arr = {-1, 1, 0, 3, 2, -4, -5, 6, 7, 8};
        int count = 0; //Количество положительных элементов в подпоследовательность
        int countMax = 0; //Длина подпоследовательности
        int index = 0; //Индекс, с которого началась подпоследовательность
        //Найдя положительное число, исследовать массив дальше
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                count++;
            if (arr[i] <= 0 ) {
                if (count > countMax) {
                    countMax = count;
                    index = i-1;
                }
                count = 0;
            }
            if (i==(arr.length-1))
                if (count > countMax) {
                    countMax = count;
                    index = i;
                }
        }
        System.out.println("Количество элементов: " + countMax);
        System.out.println("Индекс элемента: " + index);
        int seq[] = new int[countMax];
        for (int i=0; i<seq.length; i++)
            seq[i] = arr[index-countMax+i+1];

        System.out.println(Arrays.toString(seq));
    }
}