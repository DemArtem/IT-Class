package _Java.IT_Class.M05_If_Switch_Ternarn;

public class Tests {
    public static void main(String[] args) {
        //Example 1 (m)
        if (20 < 18)
            System.out.println("1. 20 is greater than 18");

        //Example 2 (m)
        int x = 20;
        int y = 18;
        if (x < y)
            System.out.println("2. x is greater than y");

        // Example 3 (m)
        if (true)
            System.out.println("3." + true);

        //Example 4
        int time = 20;
        if (time < 18) {
            System.out.println("4. Good day.");
        } else {
            System.out.println("4. Good evening.");
        }

        //Example 5
        time = 7;
        if (time > 5 && time < 12)
            System.out.println("5. Good morning.");
        else if (time < 18)
            System.out.println("5. Good afternoon.");
        else
            System.out.println("5. Good evening.");

        //Example 6
        int number = 10;
        if (number < 0) {
            System.out.println("6. The number is negative.");
        } else {
            System.out.println("6. Statement outside if block");
        }
    }
}
