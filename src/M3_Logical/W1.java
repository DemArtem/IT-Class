package M3_Logical;

public class W1 {
    public static void main(String[] args) {
        //(2a+sin|3a|)/3.56
        double a = 1;
        System.out.println(Math.sqrt((2*a + Math.sin(Math.abs(3*a))) / 3.56));

    }
}
