package HomeWorks.HomeWork23_12_06;
//Дано трехзначное число.
//        а) Верно ли, что все его цифры одинаковые?
//        б) Определить, есть ли среди его цифр одинаковые
public class Task4_31 {
    public static void main(String[] args) {
        int x = 441;
        //а
        if ((x%10==x/100) && (x%10==(x/10)%10))
            System.out.println("все числа равны между собой");
        else
            System.out.println("числа не равны между собой");
        //б
        if ((x%10==x/100) || (x%10==(x/10)%10) || (x/100==(x/10)%10))
            System.out.println("есть одинаковые цифры");
        else
            System.out.println("нет одинаковых цифр");

    }
}