package M03_Logical;
/*Дано трехзначное число. Найти:
        а) число единиц в нем;
        б) число десятков в нем;
        в) сумму его цифр;
        г) произведение его цифр
 */
public class Logical3 {
    public static void main(String[] args) {
        int a = 123;
        int o = a%10;
        int t = a/10%10;
        int h = a/100;
        System.out.println(o);
        System.out.println(t);
        System.out.println(h);
    }
}
