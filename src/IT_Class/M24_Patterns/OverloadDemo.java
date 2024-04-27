package IT_Class.M24_Patterns;

public class OverloadDemo {
    public static void main(String[] args) {

    }
    public static <T>  void sumG(T a, T b){
        if (a instanceof Integer && b instanceof Integer)
            System.out.println(Integer.parseInt(a.toString())+Integer.parseInt(b.toString()));
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static long sum(long a, long b){
        return a+b;
    }

    public static double sum(double a, double b){
        return a+b;
    }
    public static int sum(double a, int b){
        return (int)a+b;
    }

}