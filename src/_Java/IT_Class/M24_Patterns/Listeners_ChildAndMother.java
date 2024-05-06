package _Java.IT_Class.M24_Patterns;

import java.util.ArrayList;
import java.util.List;

//Listeners
public class Listeners_ChildAndMother {
    public static void main(String[] args) {
        Child child = new Child();
        Mother mother = new Mother();

        child.addObserver(mother); // Добавление матери в список слушателей ребенка

        // При возникновении события, вызывается метод notifyObservers()
        child.eventOccurred("Some event");
    }
}

class Child {
    private List<ChildListener> listeners = new ArrayList<>();

    public void addObserver(ChildListener listener) {
        listeners.add(listener);
    }

    public void removeObserver(ChildListener listener) {
        listeners.remove(listener);
    }

    public void eventOccurred(String event) {
        for (ChildListener listener : listeners) {
            listener.update(event);
        }
    }
}

interface ChildListener {
    void update(String event);
}

class Mother implements ChildListener {
    @Override
    public void update(String event) {
        // Реакция матери на событие
    }
}

