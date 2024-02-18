package IT_Class.M15_Recursion;

import javax.swing.*;
import java.awt.*;

public class Fractal {
    public static void main(String[] args) {
        //create a MyCanvas object
        DrawCanvas canvas = new DrawCanvas();
        //set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("FractalCircles.java");
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add the canvas to the frame as a content panel
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }//end main
}
class DrawCanvas extends Canvas {
    public void paint(Graphics graphics) {
        int x1, x2, y1, y2; //future x and y coordinates
        int radius = 125; //radius of first circle
        int xC = 250, yC = 250; //center point (x,y) of circle

        //draw invisible line
        graphics.drawLine(0, 250, 500, 250);
        graphics.drawLine(250, 0, 250, 500);
        graphics.setColor(Color.RED);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));
        drawCircles(graphics, xC, yC, radius);
    }
    public void drawCircles(Graphics graphics, int xC, int yC, int radius){
        if (radius<2) return; //выход из рекурсии
        graphics.drawOval(xC-radius, yC-radius,2*radius, 2*radius);
        drawCircles(graphics, xC-radius, yC, radius/2); //погружение влево
        drawCircles(graphics, xC+radius, yC, radius/2); //погружение вправо

    }
}

