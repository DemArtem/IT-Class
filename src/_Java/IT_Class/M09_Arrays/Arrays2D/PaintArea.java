package _Java.IT_Class.M09_Arrays.Arrays2D;

/*
1. Дана прямоугольная область nxm, заполненная нулями
0 0 0 0
0 0 0 0
0 0 0 0

В эту область добавляется один или более "активных" элементов, которые
при каждом последующем ходе "закрашивают" соседние элементы в свой цвет.
Например, добавлены элементы 1 и 2:
1 0 0 0
0 0 0 2
0 0 0 0

На следующем ходе они закрасят соседние элементы так, что
1 1 2 2
1 1 2 2
0 0 2 2

На последнем ходе первым "ходит" элемент 1, поэтому область закрашивается так:
1 1 2 2
1 1 2 2
1 1 2 2

Определить, за сколько ходов закрасится вся область.
Предусмотреть вывод в консоль всех ходов или только начальное и конечное состояние области.
Предусмотреть опцию, которая позволяет изменить правила игры так, чтобы
диагональные элементы не закрашивались.
Например,
1 0 0 0
0 0 0 2
0 0 0 0

1 1 0 0
1 0 2 2
0 0 0 2

1 1 1 2
1 1 2 2
1 0 2 2

1 1 1 2
1 1 2 2
1 1 2 2
 */
import java.util.Arrays;

public class PaintArea {

    private int[][] area;
    private boolean allowDiagonal;

    public PaintArea(int n, int m, boolean allowDiagonal) {
        area = new int[n][m];
        this.allowDiagonal = allowDiagonal;
    }

    public void addActiveElement(int x, int y) {
        area[y][x] = 1;
        if (!allowDiagonal) {
            if (x > 0) area[y][x-1] = 1;
            if (x < area[0].length - 1) area[y][x+1] = 1;
            if (y > 0) area[y-1][x] = 1;
            if (y < area.length - 1) area[y+1][x] = 1;
        } else {
            if (x > 0) area[y][x-1] = 1;
            if (x < area[0].length - 1) area[y][x+1] = 1;
            if (y > 0) area[y-1][x] = 1;
            if (y < area.length - 1) area[y+1][x] = 1;
            if (x > 0 && y > 0) area[y-1][x-1] = 1;
            if (x > 0 && y < area.length - 1) area[y+1][x-1] = 1;
            if (x < area[0].length - 1 && y > 0) area[y-1][x+1] = 1;
            if (x < area[0].length - 1 && y < area.length - 1) area[y+1][x+1] = 1;
        }
    }

    public void paintArea() {
        boolean painted = true;
        int steps = 0;

        while (painted) {
            painted = false;
            int[][] tempArea = new int[area.length][area[0].length];

            for (int i = 0; i < area.length; i++) {
                for (int j = 0; j < area[0].length; j++) {
                    if (area[i][j] == 1) {
                        painted = true;
                        tempArea[i][j] = 1;
                    } else if (tempArea[i][j] == 1) {
                        tempArea[i][j] = 1;
                        if (!allowDiagonal) {
                            if (j > 0) tempArea[i][j-1] = 1;
                            if (j < tempArea[0].length - 1) tempArea[i][j+1] = 1;
                            if (i > 0) tempArea[i-1][j] = 1;
                            if (i < tempArea.length - 1) tempArea[i+1][j] = 1;
                        } else {
                            if (j > 0) tempArea[i][j-1] = 1;
                            if (j < tempArea[0].length - 1) tempArea[i][j+1] = 1;
                            if (i > 0) tempArea[i-1][j] = 1;
                            if (i < tempArea.length - 1) tempArea[i+1][j] = 1;
                            if (j > 0 && i > 0) tempArea[i-1][j-1] = 1;
                            if (j > 0 && i < tempArea.length - 1) tempArea[i+1][j-1] = 1;
                            if (j < tempArea[0].length - 1 && i > 0) tempArea[i-1][j+1] = 1;
                            if (j < tempArea[0].length - 1 && i < tempArea.length - 1) tempArea[i+1][j+1] = 1;
                        }
                    }
                }
            }

            area = tempArea;
            if (painted) steps++;
        }

        System.out.println("Number of steps to paint the entire area: " + steps);
        printArea();
    }

    private void printArea() {
        for (int i = 0; i < area.length; i++) {
            System.out.println(Arrays.toString(area[i]));
        }
    }

    public static void main(String[] args) {
        PaintArea paintArea = new PaintArea(3, 4, false);
        paintArea.addActiveElement(0, 0);
        paintArea.addActiveElement(3, 1);
        paintArea.paintArea();
    }
}

