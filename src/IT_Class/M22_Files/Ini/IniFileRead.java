package IT_Class.M22_Files.Ini;

import org.ini4j.Wini;
import java.io.File;
import java.io.IOException;

public class IniFileRead {
    public static void main(String[] args) {
        String fileName = "src/_data/data.ini";
        File file = new File(fileName);
        try {
            file.createNewFile();
            Wini ini = new Wini(file);
            String name = ini.get("options", "name");
            int value = Integer.parseInt(ini.get("section", "value"));
            System.out.println(name);
            System.out.println(value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
