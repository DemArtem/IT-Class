package IT_Class.M20_Collections;

import java.util.*;

//Пользователь вводит натуральные числа, пока не введет ноль.
//Программа выводит массив неповторяющихся чисел, введенных пользователем
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number!=0){
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            hashSet.add(number);
        }
        System.out.println(Arrays.toString(hashSet.toArray()));
    }
}