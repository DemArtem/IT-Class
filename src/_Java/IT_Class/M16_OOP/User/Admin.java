package _Java.IT_Class.M16_OOP.User;

class Admin extends User {

    public Admin(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
