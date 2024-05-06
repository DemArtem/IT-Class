package _Java.IT_Class.M22_Files.XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
public class ReadXML {
    public static void main(String[] args) {
        Book book = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            book = (Book) jaxbUnmarshaller.unmarshal( new File("src/Java.Java.IT_Class._data/book.xml") );
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(book);
    }
}