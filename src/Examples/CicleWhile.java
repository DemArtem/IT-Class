package Examples;

public class CicleWhile {
    public static void main(String[] args) {
        //вывести 7 14 21 28..98
        int a = 7;
        while (a<=98){
            System.out.print(a + " ");
            a=a+7;
        }
        System.out.println();

        //вывести 1 2 4 8 16..512
        int b = 1;
        while (b<=512){
            System.out.print(b + " ");
            b=b*2;
        }
    }
}