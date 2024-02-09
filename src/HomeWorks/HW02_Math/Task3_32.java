package HomeWorks.HW02_Math;
/*
Записать условие, которое является истинным, когда точка с координатами (х, у)
попадает в заштрихованные участки плоскости, включая их границы (рис. 3.1).
 */
public class Task3_32 {
    public static void main(String[] args) {
        double x=2, y=1.5;
        //a
        boolean b1 = (x<=2)&&(y>=1);
        System.out.println(b1);
        //b
        boolean b2 = (((x>=Integer.MIN_VALUE)&&(x<=Integer.MAX_VALUE))&&((y>=-2)&&(y<=1.5)));
        System.out.println(b2);
    }
}