package M05_If_Switch_Ternarn;

public class Test4 {
    public static void main(String[] args) {
        //Example 13
        int age=20;
        int weight=80;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }

        //Example 14
         age=25;
         weight=48;
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }

        //Example 15
        if (2 * 2 == 5)
            System.out.println("Дважды два равно пяти!");

        //Example 16
        int number = 2;
        if(number % 2 != 0)
            System.out.println(++number);

        //Example 17
        int month = 3; // март
        String season; // время года
        if(month == 1 || month == 2 || month == 12)
            season = "Зимушка-зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Вы с какой планеты?";
        System.out.println(season);

        //Example 18
        number=20;
        switch(number){
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            default:System.out.println("Not in 10, 20 or 30");
        }

        //Example 19
        month=7;
        String monthString="";
        switch(month){
            case 1: monthString="1 - January";
                break;
            case 2: monthString="2 - February";
                break;
            case 3: monthString="3 - March";
                break;
            case 4: monthString="4 - April";
                break;
            case 5: monthString="5 - May";
                break;
            case 6: monthString="6 - June";
                break;
            case 7: monthString="7 - July";
                break;
            case 8: monthString="8 - August";
                break;
            case 9: monthString="9 - September";
                break;
            case 10: monthString="10 - October";
                break;
            case 11: monthString="11 - November";
                break;
            case 12: monthString="12 - December";
                break;
            default:System.out.println("Invalid Month!");
        }
        System.out.println(monthString);

        //Example 20
        String levelString="Expert";
        int level=0;
        switch(levelString){
            case "Beginner": level=1;
                break;
            case "Intermediate": level=2;
                break;
            case "Expert": level=3;
                break;
            default: level=0;
                break;
        }
        System.out.println("Your Level is: "+level);

        //Example 21
        char branch = 'C';
        int collegeYear = 4;
        switch( collegeYear ){
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }
}
