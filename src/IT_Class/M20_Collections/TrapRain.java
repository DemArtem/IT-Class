package IT_Class.M20_Collections;

import java.util.ArrayList;
import java.util.Arrays;

//Сколько воды от дождя останется в неровностях, заданных массивом
public class TrapRain {
    static Integer[] values = {0,1,0,0,2,1,0,1,3,2,1,2,1};
    static ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(values));

    public static void main(String[] args) {
        //Найти первый слева элемент, с которого начинается убывание
        int sum = 0, level = 1;
        boolean flag = true;
        int left = -1, right= arr.size();
        while (flag) {
            int a = 0, b = 0;
            do {
                a = b;
                b = arr.get(++left);
            } while (b>=a);
            left--;
            a = 0; b = 0;
            do {
                a = b;
                b = arr.get(--right);
            } while (b>=a);
            right++;

            //arrList = new ArrayList<Integer> (arrList.subList(left,right));
            System.out.printf("left=%d, right=%d%n", left, right);
            flag = false;
            for (int i = left+1; i <right; i++)
                if (arr.get(i) < level) {
                    sum += level - arr.get(i);
                    arr.set(i,level);
                    flag = true;
                }
            level++;
            left = -1; right= arr.size();
            System.out.printf("sum=%d%n",sum);
        }
    }
}
