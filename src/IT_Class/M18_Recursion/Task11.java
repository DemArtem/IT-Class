package IT_Class.M18_Recursion;
/*
Вывести паттерн
1*1=
11*11=
111*111=
1111*1111=
 */
public class Task11 {
    public static void main(String[] args) {
        number (5);
    }

    public static void number(int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= index; i++) {
            sb.append(1);
            for (int j = 1; j <= index - i; j++)
                System.out.print("  ");
            System.out.printf("%d*%d=%d\n", Integer.parseInt(sb.toString()), Integer.parseInt(sb.toString()), (Integer.parseInt(sb.toString()) * Integer.parseInt(sb.toString())));
        }
    }
}
