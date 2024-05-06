package _Java.IT_Class.M22_Files.XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class WriteXML {
    public static void main(String[] args) {

        Books books = new Books();
        Book book = new Book();
        book.setId(1L);
        book.setName("Name");
        book.setDate(new Date());

        books.addBook(book);

        Book book2 = new Book();
        book2.setId(2L);
        book2.setName("Name 2");
        book2.setDate(new Date());

        books.addBook(book2);

        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(book, new File("src/Java.Java.IT_Class._data/book.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}