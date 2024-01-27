package Examples;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 4, 5, 62};

        //вывод на экран всего массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //сумма чисел
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
        System.out.println("");

        //найти макс число
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.print(max);
        System.out.println("");

        //for each
        for (int el:arr) {
            System.out.print(el + " ");
        }
    }
}
