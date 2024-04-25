package IT_Class.M27_Lambda;

import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        //Отсортировать список строк с помощью лямбда-выражения?
        List<String> list  = new ArrayList<>(List.of("2","1"));

        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));

        list = sort(list);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<String> sort(List<String> list){
        list.sort(String::compareTo);
        return list;
    }
}
