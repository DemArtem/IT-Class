package M06_TablKarno;
 /*
    Для трех чисел известна их четность. Определить, будет ли сумма четной.
 */
public class EvenOdd {
     public static void main(String[] args) {
         int a =3, b = 5, c=1;
         boolean b1 = a%2==0;
         boolean b2 = a%2==0;
         boolean b3 = a%2==0;

         if (!b1&!b2&b3 | !b1&b2&!b3 | b1&!b2&!b3 | b1&b2&b3)
             System.out.println("even");
         else System.out.println("odd");

     }

}
