package IT_Class.M20_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Реализовать вложенные структуры данных (на верхнем уровне коллекция коллекций, на среднем - коллекция и на нижнем - элементы типа String)
с возможностью добавления, удаления и вывода элементов.
Варианты:
1. ArrayList<Stack>
 */
public class HW_ArrayList {
    public static void main(String[] args) {
        //коллекция коллекций(упаковка большой коробки)
        List<Stack<String>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < 5; j++) {
                stack.push(String.format("string %d", i * 5 + j));
            }
            list.add(stack);
        }

        //изменение 2-ой строки в 1-й коробке
        Stack<String> st = list.get(1);
        st.set(2, "string selected");

        //распаковка
        for (int i = 0; i < list.size(); i++) {
            Stack<String> stack = list.get(i);
            while (!stack.empty()) {
                String s = stack.pop();
                System.out.print(s + ", ");
            }
            System.out.println();
        }
    }
}
