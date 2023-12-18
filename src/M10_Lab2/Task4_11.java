package M10_Lab2;
//лаб 2. дана послед чисел. выяснить явл ли послед симметричн простых чисел
public class Task4_11 {
    public static void main(String[] args) {
        int[] arr={2,7,3,11,3,7,2};

        System.out.println(isPrime(13));
        System.out.println(allArePrime(arr));
        System.out.println(isSymmetric(arr));
        System.out.println(allArePrime(arr) && isSymmetric(arr));
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
    //проверка на симметрию
    static boolean isSymmetric(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i]!=arr[arr.length-1-i])
                return false;
        }
        return true;
    }
}
