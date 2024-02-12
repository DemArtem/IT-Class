package IT_Class.M16_Recursion;

public class CombinationsWithoutRepetitions {
    static String s = "123";
    //1, 13, 123, 12, 2, 3, 23
    static int n = s.length();
    public static void main(String[] args) {
        combinations(new StringBuilder(), 0);
    }

    static void combinations(StringBuilder sb, int start){
        if (sb.length()>0) System.out.println(sb);
        for (int i = start; i < n ; i++) {
            sb.append(s.charAt(i));
            combinations(sb, i+1);
            sb.delete(sb.length()-1, sb.length());
        }
    }
}
