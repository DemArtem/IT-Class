package _Java.HomeWorks.HW10_String;
//Из пути файла в Windows извлечь каталог, краткое имя и расширение.
//C:\Windows\System32\calc.exe
public class Task3 {
    public static void main(String[] args) {
        String str = "C:\\Windows\\System32\\calc.exe";

        String catalog = str.substring(0, str.lastIndexOf("\\"));
        System.out.println("Каталог: " + catalog);

        String shortName = str.substring(str.lastIndexOf("\\")+1, str.lastIndexOf("."));
        System.out.println("Краткое имя: " + shortName);

        String extensions = str.substring(str.lastIndexOf(".")+1);
        System.out.println("Расширение: " + extensions);
    }
}