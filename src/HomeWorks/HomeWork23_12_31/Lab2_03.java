package HomeWorks.HomeWork23_12_31;
public class Lab2_03 {
    public static void main(String[] args) {
        double x = 0.5;
        double sum = x/4;
        double a = x/4;
        double eps = 1e-5;
        int i=1;
        while (Math.abs(a)>eps){
            a*=-x*(4*i-3)/(4*i);
            sum=+a;
            i++;
            System.out.println(a);
        }
        System.out.println(sum);
        System.out.println(1-1/Math.sqrt(Math.sqrt(1+x)));
    }
}