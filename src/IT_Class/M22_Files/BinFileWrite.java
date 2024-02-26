package IT_Class.M22_Files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinFileWrite {
    public static void main(String[] args) {
        //задать имя файла
        String fileName = "src/_data/data.bin";
        try (DataOutputStream dos = new DataOutputStream( new FileOutputStream(fileName, false))) {
            dos.writeUTF("Hello, world!");
            dos.writeDouble(3.14);
            dos.writeInt(1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}
