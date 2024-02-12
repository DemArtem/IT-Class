package IT_Class.M19_Dates;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Dates {
    public static void main(String[] args) {
        //дата сейчас
        LocalDate date = LocalDate.now();
        System.out.println("1. " + date);

        //время сейчас
        LocalTime time = LocalTime.now();
        System.out.println("2. " + time);

        //дата и время сейчас
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("3. " + dateTime);

        //дата и время сейчас в Америке
        LocalDateTime dateTime1 = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("4. " + dateTime1);

        //дата и время по шаблону в Америке
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy  hh:mm");
        String formattedDate = dateTimeFormatter.format(dateTime);
        System.out.println("5. " + formattedDate);

        //дата и время по шаблону
        dateTime = LocalDateTime.parse("2024-02-08T19:34");
        System.out.println("6. " + dateTime.format(dateTimeFormatter));

        //сложение дат
        Calendar calendar = new GregorianCalendar();
        Date dateNow = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        System.out.println("7. " + simpleDateFormat.format(dateNow)); //дата сейчас

        calendar.add(Calendar.DATE,21); //добавляем количество дней 21
        System.out.println("7. " + simpleDateFormat.format(calendar.getTime()));

        //часовой пояс
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("8. " + timeZone);
    }
}
