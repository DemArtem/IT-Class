package M10_Lab2;
/*
Array26. Дан целочисленный массив размера N. Проверить, чередуются ли в
нем четные и нечетные числа. Если чередуются, то вывести 0, если нет,
то вывести порядковый номер первого элемента, нарушающего закономерность.
 */
public class Array26 {
    public static void main(String[] args) {
        int[] arr = {3,4,1,6,5,8,10};
        boolean even;
        boolean prev = arr[0]%2==0?true:false;
        int index =0; //пройдет без сбоев
        for (int i = 1; i < arr.length; i++) {
            even = arr[i]%2==0? true:false;
            if (prev == even) {
                index = i;
                break;
            }
            prev = even;
        }
        System.out.println(index);
    }
}
