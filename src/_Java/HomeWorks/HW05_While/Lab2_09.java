package _Java.HomeWorks.HW05_While;
public class Lab2_09 {
    public static void main(String[] args) {
        double x = 0.5;
        double sum = x/2;
        double a = x/2;
        double eps = 1e-5;
        int i=1;
        while(Math.abs(a)>eps){
            a*=-x*(2*i-1)/(2*i);
            sum+=a;
            i++;
            System.out.println(a);
        }
        System.out.println(sum);
        System.out.println(1-(1/(Math.sqrt(1+x))));
    }
}