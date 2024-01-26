package IT_Class.M13_OOP_Arr;

public class CirclesDemo {

    static double calcLength(double r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        //вычислить длину окружности и площадь круга
        //императивный
        double r1 = 1;
        double r2 = 2;
        double r3 = 3;

        double l1 = 2 * Math.PI * r1;
        double s1 = Math.PI * r1 * r1;
        double l2 = 2 * Math.PI * r2;
        double s2 = Math.PI * r2 * r2;
        double l3 = 2 * Math.PI * r3;
        double s3 = Math.PI * r3 * r3;

        System.out.println("Императивный:");
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n", r1, l1, s1);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n", r2, l2, s2);
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n", r3, l3, s3);

        //процедурный
        System.out.println("Процедурный:");
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n", r1, calcLength(r1), calcArea(r1));
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n", r2, calcLength(r2), calcArea(r2));
        System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n", r3, calcLength(r3), calcArea(r3));

        //ООП
        System.out.println("ООП:");
        Circle circle = new Circle(r1); //конструктор
        //на основании класса Circle создать объект circle c помощью конструктора new Cercle c радиусом 1
        new Circle(r1).print(); //анонимный объект
        new Circle(r2).print(); //анонимный объект
        new Circle(r3).print(); //анонимный объект
        System.out.println(Circle.desc); //статическое поле
        System.out.println(Circle.calcLength(r1)); //статический метод
        System.out.println(Math.sin(0));

        System.out.println(circle); //toString - преобразует все данные в строку
        String result = circle.toString();//или toString через переменную
        System.out.println(result);
    }

    static double calcArea(double r) {
        return Math.PI * r * r;
    }
}

    class Circle{
        private double radius;
        private double length;
        private double area;

        public static final String desc = "Это окружность";
        //final - значит desc менять нельзя


        public Circle(double radius) { //создаем конструктор
            this.radius = radius;
            calcLength(); //вычисление длины
            calcArea(); //вычисление радиуса
        }

        public void calcLength(){
            length = 2*Math.PI*radius;
        }

        public static double calcLength(double radius){
            return 2*Math.PI*radius;
        }

        public static double calcArea(double radius){
            return Math.PI*radius*radius;
        }

        public void calcArea(){
            area = Math.PI*radius*radius;
        }

        public double getLength() {
            return length;
        }

        public double getArea() {
            return area;
        }

        public void print(){
            System.out.printf("Радиус: %.2f, длина окружности: %.2f, площадь круга: %.2f%n",radius,length,area);
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", length=" + length +
                    ", area=" + area +
                    '}';
        }
    }