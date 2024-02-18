package IT_Class.M16_OOP.Car;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car(); //создаю новый авто
        //car.color = Color.RED; //создаю цвет (делать так - моветон)
        car.setColor(Color.BLUE);
        System.out.println(car);
        car.setColor(Color.RED);
        System.out.println(car);//вывод информации
    }
}
//выделяем Класс + F6 - перенос Класса в отдельный файл

