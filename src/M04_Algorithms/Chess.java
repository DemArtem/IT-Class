package M04_Algorithms;

public class Chess {
    public static void main(String[] args) {
        //rook
        int x1 = 3, y1 = 2;
        int x2 = 5, y2 = 2;
        if (x1==x2 || y1==y2)
            System.out.println(true);
        else System.out.println(false);

        //bishop
        if (Math.abs(x1-x2)==Math.abs(y1-y2))
            System.out.println(true);
        else System.out.println(false);

        //queen
        if ((x1==x2 || y1==y2) || (Math.abs(x1-x2)==Math.abs(y1-y2)))
            System.out.println(true);
        else System.out.println(false);
    }
}
