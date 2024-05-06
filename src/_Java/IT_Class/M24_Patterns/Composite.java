package _Java.IT_Class.M24_Patterns;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


//Композит
public class Composite {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.getContentPane().setBackground(Color.BLACK);

        Container container = new Container();
        frame.add(container);

        Shape rect1 = new Rect(100, 100, Color.BLUE);
        Shape rect2 = new Rect(100,100, Color.BLUE);
        Group group1 = new Group(0,0, Color.BLUE);
        group1.add(rect1);
        group1.add(rect2);

        container.add(rect1);
        frame.setVisible(true);
    }
}

interface ShapeProcessor {
    void paint(Graphics graphics);
}

abstract class Shape implements ShapeProcessor {
    public int x;
    public int y;
    public Color color;
    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    @Override
    public void paint(Graphics graphics){
        graphics.setColor(color);
    }
}

class Rect extends Shape {
    public Rect(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x, y, 20, 20);
    }

    public void make() {
        int count = (int)Math.round(Math.random()*5+1);
        for (int i = 0; i<count; i++) {
            int xOffset = (int)Math.round(Math.random()*100-50);
            int yOffset = (int)Math.round(Math.random()*100-50);
            Rect rect = new Rect(x+xOffset,y+yOffset, Color.BLUE);
        }
    }
}

class Group extends Shape {
    private final List<Shape> shapes = new ArrayList<>();

    public Group(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public void paint(Graphics graphics) {
        shapes.forEach((shape) -> {
            shape.paint(graphics);
        });
    }

    public void add(Shape shape){
        shapes.add(shape);
    }
}

class Container extends JPanel {
    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        setBackground(Color.BLACK);
        super.paintComponent(graphics);
        shapes.forEach((shape) -> {
            shape.paint(graphics);
        });
    }
}