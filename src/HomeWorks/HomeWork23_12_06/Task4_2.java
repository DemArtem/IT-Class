package HomeWorks.HomeWork23_12_06;

public class Task4_2 {
    /*
    Рассчитать значение у при заданном значении х:
    y=sin2x при x>0
    у=1+2sin2x в противном случае
    */
    public static void main(String[] args) {
        double x = 3, y;
        if (x>0)
            y = Math.sin(x*x);
        else
            y = 1+2*Math.sin(x)*Math.sin(x);
        System.out.println(y);
    }
}