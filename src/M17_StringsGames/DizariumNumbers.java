package M17_StringsGames;
/*
Числа Дизариума: сумма цифр, возведенных в степень их разряда, равна самому числу.
Вывести первые 10 чисел Дизариума (после 10).
Пример: 8^1+9^2 = 89;
*/
public class DizariumNumbers {
    public static void main(String[] args) {
        num();
    }
    static void num (){
        int i=10;
        int count=0;

        while (true){
            int sum=0;
            String str2=String.valueOf(i);
            i++;

            for (int j=0; j<str2.length();j++){
                char ch=str2.charAt(j);
                sum+=Math.pow(Integer.parseInt(Character.toString(ch)),(j+1));
            }

            if (sum==Integer.parseInt(str2)) {
                System.out.println(sum+"  "+str2);
                count++;
            }
            if (count==10)
                break;
        }
    }
}