package Examples;

public class Recursia {
    public static void main(String[] args) {
        counter(3);
    }
    private static void counter(int n){
        if (n==0) return;
        System.out.println(n);
        counter(n-1);
    }
}