package IT_Class.M10_Math_Graphic_Arr;

import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.BLUE);
        g2d.clearRect(0, 0, getParent().getWidth(), getParent().getHeight());
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.green);
        g2d.drawRect(0, 0, 100, 100);
        g2d.setColor(Color.RED);
        g2d.fillRect(5, 5, 95, 95);
    }
    public static void main(String[] args) {
        // create frame for Main
        JFrame frame = new JFrame("Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo app = new GraphicsDemo();
        frame.add(app);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}