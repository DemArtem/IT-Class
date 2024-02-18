package IT_Class.M16_OOP.User;

class Guest extends User {

    public Guest(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
