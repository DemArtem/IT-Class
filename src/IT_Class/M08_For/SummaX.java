package IT_Class.M08_For;
//5.37
//Вычислить сумму
//2 3 4 11 2 3 10 1 ...
//3 4 5 12
//x x x x
//при
//x 2 .
public class SummaX {
    public static void main(String[] args) {
        double x =2;
        double sum =1;
        int sign =-1;
        double pow = x;
        for (int i=1; i<=10; i++) {
            double a = pow*sign*(i+1)/(i+2);
            sign*=-1;
            sum+=a;
            pow*=x;
        }
        System.out.println(sum);
    }
}
