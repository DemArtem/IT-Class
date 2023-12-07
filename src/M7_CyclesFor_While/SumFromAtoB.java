package M7_CyclesFor_While;
//5.27г) сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры;
//b a).
import java.util.Scanner;

public class SumFromAtoB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a ");
        int a = scanner.nextInt();
        System.out.print("Введите b ");
        int b = scanner.nextInt();

        int sum = 0;
        for(int i=a; i<=b; i++)
            sum+=i;
        System.out.println(sum);
    }
}