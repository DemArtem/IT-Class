package IT_Class.M26_StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsIntro {
    public static void main(String[] args) {

        //Из коллекции в список
        List<Integer> list = IntStream.range(0,10)//здесь получили примитивный тип
                .boxed()// метод оборачивания примитивного типа в класс-обертку
                .collect(Collectors.toList());

        //Из коллекции в массив
        int[] arr = IntStream.range(0,10)
                .toArray();

        //Из коллекции в Map
        Map<Integer, Integer> map = IntStream.range(0,10)
                .boxed()
                .collect(Collectors.toMap(k->k, v->v, (a, b)->b));

        System.out.println(map);
    }
}