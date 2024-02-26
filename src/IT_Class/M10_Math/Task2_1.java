package IT_Class.M10_Math;
//лабораторная 2/ 2_1
public class Task2_1 {

    public static void main(String[] args) {
        double x = 0.5;
        double sum = x;
        double a = x;
        double eps = 1e-5;
        int i=2;
        while(Math.abs(a)>eps){
            a*=-x*(3*i-4)/(3*i);
            sum+=a;
            i++;
            System.out.println(a);
        }
        System.out.println(sum);
        System.out.println(3*Math.cbrt(1+x)-3);
    }
}