package IT_Class.M11_OOP;

public class Pen {
    // int color; //0 - черный, 1 - красный
    private Color color; //Класс (перечисление), объект
    //private (в пределах класса),
    //protected (в пределах этого и дочерних классов),
    //(default) (в пределах файла)
    //public (в пределах пакета)

    //Конструктор
    Pen(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" + "color=" + color + '}';
    }
}
