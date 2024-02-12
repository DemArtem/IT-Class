package IT_Class.M16_OOP.Car;

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
