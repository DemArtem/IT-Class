package _Java.IT_Class.M22_Files.JSon;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadJSON {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/Java.Java.IT_Class._data/data.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONObject object = new JSONObject(tokener);

            //System.out.println(object.toString(4)); //Выводит все содержимое с отступами

            JSONArray persons = object.getJSONArray("persons");
            for (int i=0; i<persons.length(); i++) {
                JSONObject person = persons.getJSONObject(i);

                String name = person.getString("name");
                String phone = person.getString("phone");
                System.out.printf("name:%s, phone: %s%n", name, phone);

                System.out.println("emails: ");
                JSONArray emails = person.getJSONArray("emails");
                for (int j = 0; j < emails.length(); j++) {
                    System.out.println(emails.get(j));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}