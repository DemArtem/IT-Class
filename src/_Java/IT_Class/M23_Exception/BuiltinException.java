package _Java.IT_Class.M23_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BuiltinException {
    public static void main(String[] args) {
        numberFormatException();
        nullPointerException();
        arrayIndexOutOfBounds();
        arithmeticException();
        processInput();
    }
    static void numberFormatException(){
        try {
            int a = Integer.parseInt("1.2");
        }
        catch (NumberFormatException e)
        {
            System.err.println("number format");
        }
    }
    class TestClass {
        private int i=0;
        public void print(){
            System.out.println("print");
        }
    }
    static void nullPointerException(){
        TestClass testClass = null;
        try {
            testClass.print();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        System.out.println("ok");
    }
    static void arrayIndexOutOfBounds(){
        int[] arr = {1, 2, 3};
        try {
            int a = arr[3];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Превышена длинна массива");
        }
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
