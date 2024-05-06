package _Java.IT_Class.M28_Lambda;

interface Condition {
    boolean isAppropriate(int n);
}

public class Lambda2 {
    private static int sum(int[] numbers, Condition condition) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (condition.isAppropriate(numbers[i])) {
                sum += numbers[i];
            }
        }
        return sum;
    }
    public static void main (String[]args){
        System.out.println(sum(new int[]{1, -2, 3, 5}, n -> n %2 == 0));
    }
}
