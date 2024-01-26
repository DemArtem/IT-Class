package IT_Class.M05_If_Switch_Ternarn;

public class Tests3 {
    public static void main(String[] args) {
        //Example 9 (m)
        int number = 13;
        if (number % 2 == 0)
            System.out.println("even number");
        else
            System.out.println("odd number");

        //Example 10
        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }

        for (int year2 : new int[]{3, 4, 100, 400})
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " LEAP YEAR");
            } else {
                System.out.println(year + " COMMON YEAR");
            }


        //Example 11
        number = 13;
        String output = (number % 2 == 0) ? "even number" : "odd number";
              System.out.println(output);



        //Example 12
        int marks=65;
        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else {
        System.out.println("Invalid!");
        }
    }
}
