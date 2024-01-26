package IT_Class.M14_Sort;

import java.util.Random;

public class ArraysSort{
    //ANSI escape codes
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static int size = 10;
    public static int[] arr = new int[size];

    public static void main(String[] args) {

        size = 10;
        arr = new int[size];
        fillRandom();
        print();
        //dummySort();
        //bubbleSort(); //два рядом стоящ числа
        //shakerSort();
        //oddEvenSort();
        //gnomeSort();
        //insertionSort();
        selectionSort(); //выбор мин эл-та
        //combSort(); //расческой
        //bogoSort(); //обезьянья - рандом
        print();
    }

    /*
    Глупая сортировка. Когда встречается пара неотсортированных элементов, меняем их местами
    и возвращаемся к началу
     */
    public static void dummySort() {
        int i=0;
        while (i<size-1)
            if (arr[i] > arr[i + 1]) {
                printColor(i, i + 1);
                swap(i, i + 1);
                i=0;
            }
            else i++;
    }

    //Пузырьковая сортировка -
    public static void bubbleSort() {
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1);
                }
    }

    /*Shaker sort
    Начало как в пузырьковой сортировке - максимальный элемент перемещается вправо.
    Затем происходит разворот и минимальный элемент смещается в начало.
     */
    public static void shakerSort() {
        int left = 0, right = size-1;
        do {
            for (int i=left; i < right; i++)
                if (arr[i] > arr[i + 1]) {
                    printColor(i, i + 1);
                    swap(i, i + 1);
                }
            right--;
            for (int i=right; i >= left; i--)
                if (arr[i] > arr[i + 1]) {
                    printColor(i, i + 1);
                    swap(i, i + 1);
                }
            left++;
        } while (left<right);
    }

    /*
    Вначале сортируются нечетные элементы, затем четные.
    Процесс повторяется, пока не прекратятся перестановки.
    Алгоритм разработан для параллельной сортировки.
     */
    public static void oddEvenSort(){
        for (int i = 0; i < size - 1; i++)
            for (int j=i%2==0?0:1; j<size-1; j+=2) {
                if (arr[j] > arr[j + 1]) {
                    printColor(j, j + 1);
                    swap(j, j + 1);
                }
            }
    }

    //Гномья сортировка
    public static void gnomeSort() {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--){
                printColor(j, j - 1);
                swap(j, j - 1);
            }
        }
    }

    //Cортировка вставками
    public static void insertionSort() {
        for (int i = 1; i < size; i++) {
            int spec = arr[i];
            int j;
            for (j = i; j > 0 && spec < arr[j - 1]; j--){
                printColor(j, j - 1);
                arr[j] = arr[j - 1];
            }
            arr[j] = spec;
        }
    }

    //Сортировка выбором
    public static void selectionSort() {
        for (int i = 0; i < size; i++) {
            int min = arr[i], index = 0;
            for (int j = i; j < size; j++)
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            if (index != 0) {
                printColor(i,index);
                swap(i, index);

            }
        }
    }

    //Сортировка расческой
    public static void combSort() {
        double factor = 1.2473309; // фактор уменьшения
        int step = arr.length - 1; // шаг сортировки
        while (step >= 1) {
            for (int i = 0; i + step < arr.length; i++)
                if (arr[i] > arr[i + step])
                    swap(i, i + step);
            step /= factor;
        }
    }

    //Обезьянья сортировка
    public static void bogoSort() {
        while (!isSorted()){
            shuffle();
            print();
        }
    }

    public static boolean isSorted() {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }

    public static void shuffle() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            swap(i, random.nextInt(arr.length));
    }


    //Напечатать два элемента массива красным
    public static void printColor(int first, int second) {
        for (int i = 0; i < size; i++) {
            if (i == first || i == second) {
                System.out.print(ANSI_RED);
                System.out.print(arr[i] + " ");
                System.out.print(ANSI_WHITE);
            } else System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(81) + 10;
        }
    }

    public static void print() {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}