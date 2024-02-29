package IT_Class.M23_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltinException {
    public static void main(String[] args) {
        arithmeticException();
        processInput();
    }

    static void arithmeticException(){
        int a=1,b;
        try {
            b=a/0;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на 0");
        }
    }
    static  void processInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = 0;
        try {
            a = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Неверный формат");
        }
        System.out.println(a);
    }
}
