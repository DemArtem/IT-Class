package _Java.IT_Class.M05_If_Switch_Ternarn;

public class Tests2 {
    public static void main(String[] args) {

//        Example 7
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            }
            else {
                largest = n3;
            }
        } else {
            if (n2 >= n3) {
                largest = n2;
            }
            else {
                largest = n3;
            }
        }
        System.out.println("Largest Number: " + largest);

//        Example 8
        String str = "itstep.by";
        int i = 5;
        if (i == 4)
            i++;
        System.out.println(str);
        System.out.println("i = " + i);

    }
}
