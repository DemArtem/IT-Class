package IT_Class.M27_Lambda;

interface Operationable {
    int calculate(int x, int y);
}

public class Lambda {
    public static void main(String[] args) {
        int result = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        }.calculate(1,2);
        System.out.println(result); //30
    }
}