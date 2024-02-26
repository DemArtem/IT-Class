package IT_Class.M22_Files.JSon;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
public class WriteJSON {

    public static void main(String[] args) {
        FileWriter file = null;
        // JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
        JSONObject main = new JSONObject();
        JSONArray persons = new JSONArray();
        main.put("persons",persons);

        JSONObject obj = new JSONObject();
        obj.put("name", "Алексей");
        obj.put("phone", "+375331111111");

        JSONArray emails = new JSONArray();
        emails.put("email: alex@gmail.com ");
        emails.put("email: alex@rambler.ru ");
        emails.put("email: alex@mail.ru ");
        obj.put("emails", emails);

        JSONObject obj2 = new JSONObject();
        obj2.put("name", "Алекс");
        obj2.put("phone", "+375331111112");

        JSONArray emails2 = new JSONArray();
        emails2.put("email: alex2@gmail.com ");
        emails2.put("email: alex2@rambler.ru ");
        obj2.put("emails", emails2);
        persons.put(obj);
        persons.put(obj2);
        try {
            file = new FileWriter("src/_data/data.json");
            file.write(main.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
