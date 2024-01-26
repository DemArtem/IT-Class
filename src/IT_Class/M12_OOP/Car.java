package IT_Class.M12_OOP;

public class Car {
    private Color color = Color.GRAY;

    public Car() {
        //
    }
    public Car(Color color) { //созд конструктор. выделяем Car, Code, Generate, Constructor
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override //выделяем Car, Code, Generate, toString()
    public String toString() {
        return "Car{" + "color=" + color + '}';
    }
}
