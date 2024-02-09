package IT_Class.M19_OOP.User;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("Us","Er");
        User guest = new Guest("Gu","Est");
        User admin = new Admin("Ad","Min");

        List<User> users = new LinkedList<>();
        users.add(user);
        users.add(guest);
        users.add(admin);

        //users.stream().forEach(System.out::println);
        users.stream().forEach(elem->System.out.println(elem));
    }
}

