package IT_Class.M22_Files;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class ZodiacSigns {

    private static int count = 13;
    private static String[] signs = {"Aries", "Taurus", "Gemini", "Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Capricorn","Aquarius","Pisces"};
    private static String[][] dates = {{"21.03", "20.04"}, {"21.04", "21.05"},{"22.05", "21.06"},
            {"22.06", "22.07"}, {"23.07", "22.08"},{"23.08", "23.09"},
            {"24.09", "23.10"}, {"24.10", "22.11"},{"23.11", "21.12"},
            {"1.01", "20.01"},{"22.12", "31.12"}, {"21.01", "19.02"},{"20.02", "20.03"}};

    public static void main(String[] args) throws ParseException {
        ZodiacSign[] zodiacZigns = new ZodiacSign[count];
        for (int i = 0; i < count; i++)
            zodiacZigns[i] = new ZodiacSign(signs[i], dates[i][0], dates[i][1]);

        Locale localeRU = new Locale("ru","RU");
        Locale localeEN = new Locale("en","US");


        //System.out.println("Message in "+Locale.US+":"+bundle.getString("Aries"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date of your birth in format dd.MM.yyyy: ");
        String date = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth = dateFormat.parse(date);

        Calendar calendar = new GregorianCalendar();

        //System.out.println(calendar.getTime());

        calendar.setTime(dateOfBirth);
        //январь - нулевой месяц!
        System.out.printf("Month: %s, day: %s%n",calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
        if (!(calendar.get(Calendar.MONTH)==11&&(calendar.get(Calendar.DAY_OF_MONTH)==31)))
            calendar.add(Calendar.SECOND, 1); //Add one second
        else calendar.add(Calendar.SECOND, -1);

        /*
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+" "+month+" "+day);
         */

        int sign = -1;
        for (int i = 0; i < count; i++) {
            Calendar calendarBegin = new GregorianCalendar();
            calendarBegin.setTime(zodiacZigns[i].getDateBegin());
            calendarBegin.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
            Calendar calendarEnd = new GregorianCalendar();
            calendarEnd.setTime(zodiacZigns[i].getDateEnd());
            //if (calendarEnd.get(Calendar.MONTH)==1) calendarEnd.add(Calendar.YEAR, 1);
            calendarEnd.set(Calendar.YEAR, calendar.get(Calendar.YEAR));

            //System.out.println(calendar.getTime().toString()+" "+calendarBegin.getTime().toString());

            //System.out.println(calendar.getTime().after(calendarBegin.getTime()));
            if (calendar.getTime().after(calendarBegin.getTime())&&(calendar.getTime().before(calendarEnd.getTime()))){
                sign = i;
            }
        }

        ResourceBundle bundleRU = ResourceBundle.getBundle("IT_Class/M22_Files/Signs", localeRU);
        ResourceBundle bundleEN = ResourceBundle.getBundle("IT_Class/M22_Files/Signs", localeEN);

        String signOfZodiacRU = bundleRU.getString(signs[sign]);
        String signOfZodiacEN = bundleEN.getString(signs[sign]);
        System.out.println("Вы "+signOfZodiacRU);
        System.out.println("You are "+signOfZodiacEN);
        //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}

class ZodiacSign{
    String name;
    String sDateBegin;
    String sDateEnd;
    private Date dateBegin;
    private Date dateEnd;
    ZodiacSign(String name, String sDateBegin, String sDateEnd) throws ParseException {

        this.name = name;
        this.sDateBegin = sDateBegin;
        this.sDateEnd = sDateEnd;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM");
        dateBegin = dateFormat.parse(sDateBegin);
        dateEnd = dateFormat.parse(sDateEnd);
    }

    public Date getDateBegin() {
        return (Date)dateBegin.clone();
    }

    public Date getDateEnd() {
        return (Date)dateEnd.clone();
    }
} 