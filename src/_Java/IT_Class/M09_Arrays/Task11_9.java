package _Java.IT_Class.M09_Arrays;

/*
Заполнить массив:
а) десятью первыми членами арифметической прогрессии с известным первым членом прогрессии а и ее разностью р;
б) двадцатью первыми членами геометрической прогрессии с известным
первым членом прогрессии а и ее знаменателем z;
 */
public class Task11_9 {

    public static void main(String[] args) {
        print(fillArithm(1,2,10)); //a
        print(fillGeom(1,2,20)); //b
    }

    //Код метода должен быть неизменным, код класса
    static int[] fillArithm(int a, int p, int size) {
        int[] arr = new int[size];
        int x = a;
        for (int i = 0; i < size; i++) {
            arr[i] = x;
            x += p;
        }
        return arr;
    }

    static int[] fillGeom(int a, int p, int size) {
        int[] arr = new int[size];
        int x = a;
        for (int i = 0; i < size; i++) {
            arr[i] = x;
            x *= p;
        }
        return arr;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}