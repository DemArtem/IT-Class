package _Java.HomeWorks.HW13_Collections;
/*
Реализовать вложенные структуры данных (на верхнем уровне коллекция коллекций, на среднем - коллекция и на нижнем - элементы типа String)
с возможностью добавления, удаления и вывода элементов.
Варианты:
2. LinkedList<PriorityQueue>
 */
import java.util.LinkedList;
import java.util.PriorityQueue;

public class HW_PriorityQueue {
    private LinkedList<PriorityQueue<String>> nestedList;

    public HW_PriorityQueue() {
        nestedList = new LinkedList<>();
    }

    public void addElement(String element, int priority) {
        if (nestedList.isEmpty() || nestedList.getLast().size() >= priority) {
            nestedList.addLast(new PriorityQueue<>());
        }
        nestedList.getLast().add(element);
    }

    public void removeElement(String element) {
        for (PriorityQueue<String> queue : nestedList) {
            if (queue.contains(element)) {
                queue.remove(element);
                if (queue.isEmpty()) {
                    nestedList.remove(queue);
                }
                break;
            }
        }
    }

    public void printElements() {
        for (PriorityQueue<String> queue : nestedList) {
            for (String element : queue) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        HW_PriorityQueue nestedData = new HW_PriorityQueue();
        nestedData.addElement("Apple", 1);
        nestedData.addElement("Banana", 2);
        nestedData.addElement("Orange", 1);

        System.out.println("Elements:");
        nestedData.printElements();

        nestedData.removeElement("Banana");

        System.out.println("\nElements after removing 'Banana':");
        nestedData.printElements();
    }
}