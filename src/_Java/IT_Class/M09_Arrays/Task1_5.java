package _Java.IT_Class.M09_Arrays;
/*
Дана последовательность целых чисел.
1. Проверить, является ли она возрастающей
2. Проверить, является ли она неубывающей.
3. Найти максимальный из локальных минимумов.
4. Проверить, является ли она арифметической прогрессией.
5. Проверить, содержит ли массив два заданных числа.
 */
public class Task1_5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 0, 5};

        //1
        boolean flag = true; //Предположим, что последовательность возрастающая
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] >= arr[i + 1]) {
                flag = false;
                break;
            }
        System.out.println("1. " + flag);

        //2
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        System.out.println("2. " + flag);

        //3
        int max = arr[0];
        for (int elem : arr)
            if (max > elem) max = elem;

        //3.1.Является ли 1-я точка локальным минимумом
        if (arr[0] < arr[1] && arr[0] > max)
            max = arr[0];

        //3.2.Является ли последняя точка локальным минимумом
        int n = arr.length;
        if (arr[n - 1] < arr[n - 2] && arr[n - 1] > max)
            max = arr[n - 1];
        System.out.println("3. " + max);

        //3.3.Проверка остальных локальных минимумов
        for (int i = 1; i < n - 1; i++)
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1] && arr[i] > max)
                max = arr[i];
        System.out.println("3. " + max);

        //5
        int a = 3, b = 2;
        boolean found1 = true;
        boolean found2 = true;
        for (int elem : arr) {
            if (elem == a) {
                found1 = true;
            }
            if (elem == b) {
                found2 = true;
            }
            if (found1 && found2) System.out.println("ok");
            else System.out.println("не ок");
        }
    }
}
