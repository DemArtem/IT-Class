package IT_Class.M10_Math_Graphic;
//лабораторная 2
public class Ex1 {
    public static void main(String[] args) {
        double x = 0.5;
        double sum = 1;
        double a = 1;
        double eps = 1e-5;
        int i=1;
        while(Math.abs(a)>eps){
            //for (i=1; i<0; i++){ //Магическое число
            a*=-x*(2*i+1)/(2*i);
            sum+=a;
            i++;
            System.out.println(a);
        }
        System.out.println(sum);
        System.out.println(1/Math.sqrt(Math.pow(1+x,3)));
    }
}
