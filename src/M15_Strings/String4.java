package M15_Strings;

public class String4 {
    public static void main(String[] args) {
        String world = "world";
        StringBuilder sb = new StringBuilder(world);
        String s = sb.reverse().toString();
        System.out.println(s);

        int a = 12345;
        s = Integer.toString(a);
        sb = new StringBuilder(s);
        s = sb.reverse().toString();
        int b = Integer.parseInt(s);
        System.out.println(b);
    }
}
