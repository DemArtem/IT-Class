package _Java.IT_Class.M03_Logical;
/*Записать условие, которое является истинным, когда:
        а) каждое из чисел X и Y нечетное;
        б) только одно из чисел X и Y меньше 20;
        в) хотя бы одно из чисел X и Y равно нулю;
        г) каждое из чисел X, Y, Z отрицательное;
        д) только одно из чисел X, Y и Z кратно пяти;
        е) хотя бы одно из чисел X, Y, Z больше 100.
       https://school272.ucoz.ru/TeachersWorks/Kononov/sbornik_zadach_po_programmiroaniyu.pdf
*/
public class L4 {
    public static void main(String[] args) {
        int a=3, b=5;

        boolean b1 = (a%2==1)&&(b%2==1);
        System.out.println(b1);

        boolean b2 = (a<20)^(b<20);
        System.out.println(b2);

        boolean b3 = (a==0)||(b==0);
        System.out.println(b3);
    }
}
