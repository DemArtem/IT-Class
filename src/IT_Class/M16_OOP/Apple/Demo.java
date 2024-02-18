package IT_Class.M16_OOP.Apple;


public class Demo {
    public static void main(String[] args) {

        Variety variety = Variety.FUJI;
        System.out.println(variety.name());

        Apple apple = new Apple(0.2,Variety.FUJI);
        System.out.println(apple);
        System.out.println(apple.getWeight());
    }
}
//выделяем Класс + F6 - перенос Класса в отдельный файл

