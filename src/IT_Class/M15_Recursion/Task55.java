package IT_Class.M15_Recursion;
/*
Вывести паттерн
        5*5=
        5*55=
        ...
        Действия выровнять по знаку "равно"
*/
public class Task55 {
    public static void main(String[] args) {
        number(5);
    }
    static void number (int index){
        StringBuilder sb=new StringBuilder();
        for (int i=1; i<=index;i++){
            sb.append(5);
            for (int j=1;j<=index-i;j++)
                System.out.print(" ");
            System.out.printf("%d*%d=%d\n",5,Integer.parseInt(sb.toString()),(Integer.parseInt(sb.toString())*5));
        }
    }
}
