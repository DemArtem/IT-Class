package IT_Class.M18_Recursion;

public class CombinationsWithRepetitions {
    static String s = "123";
    //11, 12, 13, 21, 22, 23, 31, 32, 33
    static int n = s.length();
    static  int r = 2;
    public static void main(String[] args) {
        combinations(new StringBuilder(), n, r);
    }

    static void combinations(StringBuilder sb, int n, int r){
        if (sb.length()==r){
            System.out.println(sb);
            return;
        }
        for (int i = 0; i < n ; i++) { //!
            sb.append(s.charAt(i));
            combinations(sb, n, r); //!
            sb.delete(sb.length()-1, sb.length());
        }
    }
}