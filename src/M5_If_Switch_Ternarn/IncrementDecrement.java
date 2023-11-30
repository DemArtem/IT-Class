package M5_If_Switch_Ternarn;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x, y;
        System.out.println("1th");
        x=1; y=++x;
        System.out.println(x+" "+y);
        x=1; y=++x;
        System.out.println(x+" "+y);
        x=1; y=--x;
        System.out.println(x+" "+y);
        x=1; y=0; y=++x+x++;
        System.out.println(x+" "+y);
        x=1; y=0; y=--x+x--;
        System.out.println(x+" "+y);

        System.out.println("2th");
        x=1; y=0; y=++x- --x;
        System.out.println(x+" "+y);
        x=1; y=0; y=x++ - x--;
        System.out.println(x+" "+y);
        x=1; y=0; y=x-- - --x; //1-(-1)
        System.out.println(x+" "+y);
        x=1; y=0; y=x++ - ++x; //1-3
        System.out.println(x+" "+y);

        System.out.println("3th");
        x=1; y=0; y+=++x; //0+2
        System.out.println(x+" "+y);
        x=4; y=0; y+=++x+x; //5+5
        System.out.println(x+" "+y);
        x=4; y=0; y+=x+++x; //4+5
        System.out.println(x+" "+y);
        x=4; y=0; y+=--x+x++; //4+2
        System.out.println(x+" "+y);
        x=4; y=0; y+=++x+ ++x; //5+6
        System.out.println(x+" "+y);
    }
}
