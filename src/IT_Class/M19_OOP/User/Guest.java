package IT_Class.M19_OOP.User;

import IT_Class.M19_OOP.User.User;

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
