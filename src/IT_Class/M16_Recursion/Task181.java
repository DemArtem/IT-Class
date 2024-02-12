package IT_Class.M16_Recursion;
/*
1*8+1=9
12*8+2=98
...
*/
public class Task181 {
    public static void main(String[] args) {

        number(5);
    }
    static void number (int index){
        StringBuilder sb=new StringBuilder();
        for (int i=1; i<=index;i++){
            sb.append(i);
            for (int j=1;j<=index-i;j++)
                System.out.print(" ");
            System.out.printf("%d*8+%d=%d\n",Integer.parseInt(sb.toString()),i,(Integer.parseInt(sb.toString())*8+i));
        }
    }
}
