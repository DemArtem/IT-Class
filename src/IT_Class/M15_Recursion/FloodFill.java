package IT_Class.M15_Recursion;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FloodFill {
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame("Flood fill");
        jFrame.setSize(500, 300);
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPane());
        jFrame.repaint();
        jFrame.setVisible(true);
    }
}

// Create a component that you can actually draw on.
class DrawPane extends JPanel {
    private static BufferedImage image = null;
    int rgbColor = 0; //Цвет области для заливки
    int x, y; //Координаты начальной точки

    DrawPane() throws IOException {
        File input = new File("src/images/flower1.png");
        image = ImageIO.read(input);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //Вывести координаты в консоль
                x = e.getX();
                y = e.getY();
                System.out.println(x + "," + y);
                rgbColor = image.getRGB(x, y);

                image.setRGB(x,y, new Color(255, 0, 0, 255).getRGB());
                floodFill(x,y);
                repaint();
            }
        });
    }

    private void floodFill(int x, int y) {
        int rgb = image.getRGB(x,y);
        if (rgb !=rgbColor) return;
        image.setRGB(x,y, new Color(255, 0, 0, 255).getRGB());
        floodFill(x-1,y);
        floodFill(x+1,y);
        floodFill(x,y-1);
        floodFill(x,y+1);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
}