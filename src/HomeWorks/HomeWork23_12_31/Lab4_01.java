package HomeWorks.HomeWork23_12_31;
//дана последовательность. является ли она возрастающ послед простых чисел?
public class Lab4_01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 11, 13, 17};

        System.out.println("Число простое: " + isPrime(13));
        System.out.println("Все числа простые: " + allArePrime(arr));
        System.out.println("Последовательность возрастающая: " + isIncreasing(arr));
    }
    //проверка на простое число
    static boolean isPrime(int n){
        boolean flag = true; //Предполагаем, что число n - простое
        for (int i=2; i<n; i++)
            if (n%i==0) flag = false;
        return flag;
    }

    //проверка что все числа простые
    static boolean allArePrime(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int n:arr)   //foreach
                if(!isPrime(n)) return false;
        }
        return true;
    }

    //проверка на возрастающ послед
    static boolean isIncreasing(int[] arr){
        boolean flag = true; //Предположим, что последовательность возрастающая
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] >= arr[i + 1]) {
                flag = false;
                break;
            }
        return flag;
    }
}