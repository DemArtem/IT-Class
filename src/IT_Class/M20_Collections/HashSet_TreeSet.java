package IT_Class.M20_Collections;

import java.util.*;

//Пользователь вводит натуральные числа, пока не введет ноль.
//Программа выводит массив неповторяющихся чисел, введенных пользователем
public class HashSet_TreeSet {
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

        //выводим список чисел в конце
        hashSet.forEach(System.out::println);

//        Iterator value = hashSet.iterator();
//        int i = 0;
//        while (value.hasNext() && i<3) {     //можно вывести часть элементов
//            System.out.println(value.next());
//            i++;
//        }

//        for (Integer i:hashSet)
//            System.out.println(i);
//        hashSet.forEach(System.out::println);
    }
}