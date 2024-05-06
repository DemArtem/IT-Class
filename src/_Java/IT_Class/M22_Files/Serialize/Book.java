package _Java.IT_Class.M22_Files.Serialize;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    private int id;
    private String name;
    private String phone;

    private List<String> emails;

    Book(){} //пустой конструктор по умолчанию

    Book(int id, String name, String phone) {

        this.id = id;

        this.name = name;

        this.phone = phone;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String toString(){
        return String.format("id: %s, name: %s, phone: %s",id, name, phone);
    }
}
