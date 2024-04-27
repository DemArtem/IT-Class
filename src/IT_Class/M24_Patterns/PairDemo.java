package IT_Class.M24_Patterns;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1,"2");
    }
}
class Pair<T,U>{
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}