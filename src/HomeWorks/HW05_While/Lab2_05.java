package HomeWorks.HW05_While;
public class Lab2_05 {
    public static void main(String[] args) {
        double x = 0.5;
        double sum = x/3;
        double a = x/3;
        double eps = 1e-5;
        int i=1;
        while (Math.abs(a)>eps){
            a*=-x*(3*i-2)/(3*i);
            sum=+a;
            i++;
            System.out.println(a);
        }
        System.out.println(sum);
        System.out.println(1-1/Math.cbrt(1+x));
    }
}