package IT_Class.M07_While;

import java.util.Scanner;

//Вводить натуральные числа с клавиатуры.
// Признаком окончания ввода будет ненатуральное число
public class NaturalNumbersWile {
    public static void main(String[] args) {
       //solve1();
       solve2();
    }

    private static void solve1(){
        Scanner scanner = new Scanner(System.in);
        int n = 1;//чтобы войти в цикл
        while (n>0){ //пока (условие), выполнять
            System.out.println("Введите число ");
            n = scanner.nextInt();
        }
    }

    private static void solve2(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Введите число ");
            n = scanner.nextInt();
        }
        while(n>0); //выполнять пока
    }
}
