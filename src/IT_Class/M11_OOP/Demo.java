package IT_Class.M11_OOP;
public class Demo{
    public static void main(String[] args) {
        Pen pen = new Pen(Color.RED);
        System.out.println(pen);

        Car car = new Car(); //создаю новый авто
        //car.color = Color.RED; //создаю цвет (делать так - моветон)
        car.setColor(Color.BLUE);
        System.out.println(car);
        car.setColor(Color.RED);
        System.out.println(car);//вывод информации

        Variety variety = Variety.FUJI;
        System.out.println(variety.name());

        Apple apple = new Apple(0.2,Variety.FUJI);
        System.out.println(apple);
        System.out.println(apple.getWeight());
    }
}
//выделяем Класс + F6 - перенос Класса в отдельный файл

enum AppleColor{
    RED, GREEN, YELLOW
}

