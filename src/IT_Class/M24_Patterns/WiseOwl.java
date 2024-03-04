package IT_Class.M24_Patterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//структурные, поведенческие, порождающие
public class WiseOwl {
    static Singleton owl;
    static VoiceFromOak voice;

    public static void main(String[] args) throws ParseException {

        owl = Singleton.getInstance();
        voice = new VoiceFromOak();
        makeEvent("A boy helping an old man to carry a heavy basket", "01.01.2010");
        makeEvent("A girl shouting at her mother", "02.01.2010");
        makeEvent("A girl shouting at her mother", "03.01.2010");
    }

    public static void makeEvent(String sEvent, String sDate) throws ParseException {
        Event event = new Event(sEvent, Event.stringToDate(sDate));
        System.out.println(event.getDate() + " " + event.getName());
        voice.ask();
        if (voice.isAnswer()) {
            owl.incWisdom();
        }
        System.out.println("The wisdom of the owl: " + owl.getWisdom());
    }
}

//Одиночка
class Singleton {
    private static final Singleton instance = new Singleton();

    private int wisdom = 0;

    private Singleton() {
        System.out.println("Once there was an old owl living in an oak");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void incWisdom() {
        wisdom++;
    }

    public int getWisdom() {
        return wisdom;
    }
}

class Event {
    private final String name;
    private final Date date;

    Event(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        //String sDate = dateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String sDate = dateFormat.format(calendar.getTime());
        return sDate;
    }

    public static Date stringToDate(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(date));
        return calendar.getTime();
    }
}

class VoiceFromOak {
    private boolean answer;

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public void ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Will you help (y/n)?");
        String str = scanner.next();
        if (str.indexOf("y") == -1) setAnswer(true);
        else setAnswer(false);
    }
}