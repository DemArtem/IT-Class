package _Java.HomeWorks.HW15_Patterns;
/*
Спроектируйте шаблон (pattern) на вольную тему.
Приведите в комментарии преимущества и недостатки шаблона, возможные его замены
на другие шаблоны и проектные решения.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
/*
Преимущества шаблона Фабрика:
Позволяет скрыть сложность инициализации объектов от клиента.
Упрощает добавление новых типов объектов без изменения существующего кода.

Недостатки шаблона Фабрика:
Усложняет код за счет увеличения количества классов.

Возможные замены и альтернативы:
Шаблон Builder - для создания сложных объектов с крупным числом параметров и конфигураций.
 */