package _Java.IT_Class.M15_Recursion;
/*
123, 132, 231, 321, 312, 213
 */
public class Permutations {
    static String s = "123"; //3!
    static int n = s.length();
    static StringBuilder sb = new StringBuilder(s);
    public static void main(String[] args) {
        permute(0);
    }

    static void permute(int i){
        if (i==n-1) System.out.println(sb);
        else
            for (int j = i; j < n; j++) {
                swap(i, j);
                permute(i+1);
                swap(i, j);
            }
    }

    public static void swap(int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }
}
