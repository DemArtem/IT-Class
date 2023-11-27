package M3_Logical;

public class Work {
    public static void main(String[] args) {
        //вычислите значение логического выражения при след знач
        boolean a = true;
        boolean b = false;
        boolean c = false;
        //не а и в
        boolean result = (!a)&&b;
        //а или не в
        result = a||(!b);
    }
}
