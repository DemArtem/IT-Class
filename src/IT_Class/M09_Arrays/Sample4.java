package IT_Class.M09_Arrays;

import java.util.Arrays;

//Удалить повторяющиеся элементы из массива.
public class Sample4 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,3,0,0};
        int length = 1;
        for (int i=1; i<arr.length; i++                                                                                                                                                                                                                                                                                                                             ){
            boolean isUnique = true;
            for (int j=0; j<i; j++)
                if (arr[i]==arr[j]) isUnique = false;
            if (isUnique) length++;
        }
        //Определить длину результирующего массива
        System.out.println(length);
        int[] res = new int[length];

        int index = 1;
        res[0] = arr[0];
        for (int i=1; i<arr.length; i++){
            boolean isUnique = true;
            for (int j=0; j<i; j++)
                if (arr[i]==arr[j]) isUnique = false;
            if (isUnique)
                res[index++] = arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}