package HomeWorks.HW10_String;
public class Task1 {
    /*
    Из исходного слова путем «вырезок» и «склеек» его подстрок получить другие слова:
    1. интерфейс: интерес, фитнес
     */
    public static void main(String[] args) {
        interest();
        fitness();
    }
    public static void interest(){
        String str = "интерфейс";
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(5);
        sb.deleteCharAt(6);
        System.out.println(sb);
    }
    public static void fitness(){
        String str = "интерфейс";
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.charAt(5));
        System.out.print(sb.charAt(0));
        System.out.print(sb.charAt(2));
        System.out.print(sb.charAt(1));
        System.out.print(sb.charAt(6));
        System.out.print(sb.charAt(8));
    }
}