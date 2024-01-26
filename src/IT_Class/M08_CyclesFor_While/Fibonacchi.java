package IT_Class.M08_CyclesFor_While;

public class Fibonacchi {
    public static void main(String[] args) {
        int first=0; int second = 1;
        int third;
        for (int i=0; i<10; i++){
            third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }

    }
}
