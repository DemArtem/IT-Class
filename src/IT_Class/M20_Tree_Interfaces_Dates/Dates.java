package IT_Class.M20_Tree_Interfaces_Dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTime1 = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(dateTime1);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy  hh:mm");
        String formattedDate = dateTimeFormatter.format(dateTime);
        System.out.println(formattedDate);
    }
}
