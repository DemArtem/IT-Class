package Examples;

public class Ternarn {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int z = (x >= y) ? (x - y) : (x + y);//если x>=y, то вычитание, если нет - сложение
        System.out.println(z);
    }
}