package IT_Class.M08_CyclesFor_While;

public class Palindroms {
    public static void main(String[] args) {
        for (int i=0x1; i<=0x7 ; i++) {
            int j=2*i;
            int n=i*256+j*16+i;
            System.out.println(n + " " + Integer.toHexString(n));
        }
    }
}
