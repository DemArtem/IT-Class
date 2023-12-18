package M05_If_Switch_Ternarn;
/*
Рассчитать значение у при заданном значении х:
2
2
sin при 0,
1 2sin в противном случае.
*/
public class T4_1_SinX {
    public static void main(String[] args) {
        double x = 1, y;
        if (x>0)
            y = Math.sin(x)*Math.sin(x);
        else
            y = 1-2*Math.sin(x*x);
        System.out.println(y);
    }
}
