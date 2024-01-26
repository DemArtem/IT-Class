package IT_Class.M03_Logical;

public class Logical {
    public static void main(String[] args) {
    //or
        boolean a = false;
        boolean b = false;
        System.out.println(a||b);
        a = true;
        b = false;
        System.out.println(a||b);
        a = true;
        b = true;
        System.out.println(a||b);
    //and
        a = false;
        b = false;
        System.out.println(a&&b);
        a = true;
        b = false;
        System.out.println(a&&b);
        a = true;
        b = true;
        System.out.println(a&&b);
    //not
        a = false;
        System.out.println(!a);
        a = true;
        System.out.println(!a);
    }
}
