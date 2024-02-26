package IT_Class.M21_Swing;

import javax.swing.*;
import java.awt.*;

public class Squares extends JPanel {

    private final int width = 40;
    private final int height = 40;


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.LIGHT_GRAY);
        g2d.clearRect(0, 0, getParent().getWidth(), getParent().getHeight());

//        drawRect(g2d, 1, 1, width, height);

//        Изобразить 5х5 квадратов
//        for (int i=0;i<5;i++)
//            for (int j = 0; j < 5; j++)
//        drawRect(g2d, 5 + j * 10, 5 + i * 10, 10, 10);

//        В третьей строке оставить только 3 квадрата
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 2 && j > 2)
//                    continue;
//                drawRect(g2d, 5 + j * 10, 5 + i * 10, 10, 10);
//            }
//        }


//          Пропустить один средний квадрат
//          for (int i = 0; i < 5; i++) {
//              for (int j = 0; j < 5; j++) {
//                  if (j == 2 && i==2)
//                      continue;
//                  drawRect(g2d, 5 + j * 10, 5 + i * 10, 10, 10);
//            }
//        }

//             //
//           Пропустить 3-ю строку
//           for (int i = 0; i < 5; i++) {
//               for (int j = 0; j < 5; j++) {
//                   if (i == 2)
//                      continue;
//                drawRect(g2d, 5 + j * 10, 5 + i * 10, 10, 10);
//            }
//        }
//    }

//            Пропустить 3-й столбец
//             for (int i = 0; i < 5; i++) {
//                  for (int j = 0; j < 5; j++) {
//                      if (j == 2)
//                         continue;
//                drawRect(g2d, 5 + j * 10, 5 + i * 10, 10, 10);
//            }
//        }
//    }

//           В первой строке - 1 квадрат, во 2 - 2 и т.д.
//           for (int i = 0; i < 5; i++) {
//                  for (int j = 0; j < i+1; j++) {
//                drawRect(g2d, 5 + j * 10, 5 + i * 10, 10, 10);
//            }
//        }


        //Квадраты размещены в шахматном порядке
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        continue;
                } else {
                    if (j % 2 != 0)
                        continue;
                }
                drawRect(g2d, 5 + j * 10, 5 + i * 10, 10, 10);
            }
        }
    }

        //Изобразить только главные диагонали

        public static void drawRect (Graphics2D g2d,int left, int top, int width, int height){
            g2d.setStroke(new BasicStroke(2));
            g2d.setColor(Color.green);
            g2d.fillRect(left, top, width, height);
            g2d.setColor(Color.gray);
            g2d.drawRect(left, top, width, height);
        }

        public static void main (String[]args){
            // create frame for Main
            JFrame frame = new JFrame("Squares");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Squares app = new Squares();
            frame.add(app);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }
    }