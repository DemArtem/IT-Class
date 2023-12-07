package M7_CyclesFor;

import java.util.Random;
import java.util.Scanner;

public class CycleRundom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random(); //Java Random class vs Math.random()
            for (int i=0; i<9; i++)
                System.out.print((random.nextInt(9)+1)+" "); //[0; 9)

            for (int i=0; i<9; i++) {
                System.out.print("1th: " + (i + 1));
                System.out.println(" 2th: " + (9 - i));
            }

            for (int i=0,j=0; i<9 && j<9; i++, j+=3) {
                System.out.println(i+ " " +j);
            }

            for (int i = 0; i<4; i++)
            for (int j = 2; j>9; j--)
                System.out.print((i)+(j) + " ");
        //Два шага вперед, один назад: 0,2,1,3,2,4,3,5
        }
    }

