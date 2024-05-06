package _Java.IT_Class.M05_If_Switch_Ternarn;

public class TernarnOperator {
    public static void main(String[] args) {
        //Тернарный оператор
        double t = 1.0;
        String answer = t > 0 ? answer = "above zero": "below zero";
        System.out.println(answer);

        //Дано двузначное число. Определить: одинаковы ли его цифры.
        int number = 22;
        System.out.println(number/10==number%10?true:false);

        //Найти максимальное из двух чисел
        int a = 2; int b = 3;
        System.out.println(a>b?a:b);

        //Как ходит ладья
        int x1 = 1, y1 = 2, x2 = 1, y2 = 4;
        System.out.println(((x1==x2 && y1!=y2)||(x1!=x2 && y1==y2))?"может пойти":"не может пойти");
    }
}
