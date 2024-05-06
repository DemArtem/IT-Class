package _Java.IT_Class.M21_Swing;

import javax.swing.*;
import java.awt.*;

public class GraphicCube {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter"); //название
        jFrame.setSize(500, 300);//создать белое окно
        jFrame.setLocationRelativeTo(null);// по середине экрана
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPane());
    }
}

// Create a component that you can actually draw on.
class DrawPane extends JPanel {
    public void paintComponent(Graphics g) {
        for (int i=0; i<9; i++) {
            g.setColor(Color.GREEN);//цвет квадратов
            g.fillRect(50 + 50 * i, 50, 20, 20); // координаты квадратов

            JLabel jLabel = new JLabel();//текст
            jLabel.setText(Integer.toString(i + 1));
            jLabel.setBounds(55+50*i, 80, 10, 10);//координаты числа
            this.add(jLabel);
        }

    }
} 