package M13_;

import java.util.Arrays;

//Поместить в массив все простые трехзначные числа, являющиеся палиндромами.
public class Arr {
    public static void main(String[] args) {
        //определить длину массива
        //определяем что число простое
        //проверяем что число палиндром
        //System.out.println(prime(7));

        //создать массив требуемой длины
        int count = countLength();
        int[] arrayInt= new int[count];

        //заполнить массив
        arrayInt = makeArray(count);
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(makeArray(countLength())));

    }

    static boolean prime (int num){ //определяем что число простое
        if (num<2)
        return false;
        double s= Math.sqrt(num);
        for (int i=2; i<=s;i++)
        if (num%i==0)
        return false;
        return true;
    }

//проверяем что число палиндром
    static int countLength(){
        int count = 0;
        for (int num = 100; num < 1000; num++) {
            if (num/100==num%10 && prime(num)) {
                count++;
            }
        }
        return count;
    }

    static int[] makeArray(int count){
        int[] Palindromes = new int[count];
        int index = 0;
        for (int num = 100; num < 1000; num++) {
            if (num/100==num%10 && prime(num)) {
                Palindromes[index++] = num;
            }
        }
        return Palindromes;
    }
}
