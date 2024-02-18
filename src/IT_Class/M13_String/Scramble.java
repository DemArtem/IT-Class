package IT_Class.M13_String;
//Проверить, можно ли из символов одной строки
//собрать путем их перестановки другую строку
//Пример: rkqodlw -> world
public class Scramble {
    public static void main(String[] args) {
        String first = "rkwqodl";
        String second = "world";
        StringBuilder sb = new StringBuilder(first);
        boolean result = true;
        for (int i=0; i<second.length(); i++){
            int index = sb.toString().indexOf(second.charAt(i));
            if (index<0) result = false;
            else sb.delete(index,index+1);
        }
        System.out.println(result);
    }
}