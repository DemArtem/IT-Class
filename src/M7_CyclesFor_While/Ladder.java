package M7_CyclesFor_While;

public class Ladder {
    public static void main(String[] args) {

        for (int i=1; i<=9; i++)
            System.out.println("floor: "+i);

        for (int i=0, j=0; i<16; i++) {
            System.out.println("floor: " + i);
            i+=j;j++;
        }

        for (int i=0; i<9; i++) {
            if (i==4) continue;
            System.out.println("floor: " + (i+1));
        }

        for (int i=0; i<9; i++) {
            System.out.println("floor: " + (i+1));
            if (i==4) break;
        }
    }
}