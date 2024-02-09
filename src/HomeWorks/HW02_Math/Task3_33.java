package HomeWorks.HW02_Math;
/*
Записать условие, которое является истинным, когда точка с координатами (х, у)
попадает в заштрихованные участки плоскости, включая их границы (рис. 3.2).
 */
public class Task3_33 {
    public static void main(String[] args) {
        double x = -1, y = -4;
        //a
        boolean b1 = (x<=-1)&&(y<=-2);
        System.out.println(b1);
        //b
        boolean b2 = (((x>=Integer.MIN_VALUE)&&(x<=Integer.MAX_VALUE))&&((y>=1)||(y<=-3)));
        System.out.println(b2);
    }
}