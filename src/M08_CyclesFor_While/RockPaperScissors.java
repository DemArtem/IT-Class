package M08_CyclesFor_While;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter rook(r), paper(p) or scissors(s)");
            char answer = scanner.nextLine().charAt(0);
            int gamer = 0;
            int comp = (int) (Math.random() * 3);
            switch (answer) {
                case 'r':
                    gamer = 0;
                    break;
                case 'p':
                    gamer = 1;
                    break;
                case 's':
                    gamer = 2;
                    break;
            }
            String srand = "";
            switch (comp) {
                case 0:
                    srand = "rook";
                    break;
                case 1:
                    srand = "paper";
                    break;
                case 2:
                    srand = "scissors";
                    break;
            }
            System.out.println("Computer move: " + srand);
            if (gamer == comp) System.out.println("Draw");
            if (gamer==0 && comp==1) System.out.println("You lost");
            if (gamer==0 && comp==2) System.out.println("You won");

            if (gamer==1 && comp==0) System.out.println("You won");
            if (gamer==1 && comp==2) System.out.println("You lost");

            if (gamer==2 && comp==0) System.out.println("You lost");
            if (gamer==2 && comp==1) System.out.println("You won");

        }
    }
}
