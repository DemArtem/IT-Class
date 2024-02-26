package IT_Class.M22_Files;

import java.io.*;

public class BinFileRead {
    public static void main(String[] args) {
        //задать имя файла
        String fileName = "src/_data/data.bin";
        try(DataInputStream dis=new DataInputStream(new FileInputStream(fileName))) {
            String text = dis.readUTF();
            double value = dis.readDouble();
            int i=dis.readInt();
            System.out.printf("%s %f %d%n",text,value,i);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
