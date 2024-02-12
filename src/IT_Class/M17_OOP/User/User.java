package IT_Class.M17_OOP.User;

public class User {
    protected String name;
    protected String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override //унаследован от класса Object
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
