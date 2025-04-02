package projelerim.service;

import projelerim.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {
    private static Set<User> users = new HashSet<>();

    public void create(String name, String email, String password) {
        User user = new User(name, email, password);
        users.add(user);


    }
    public void  list() {
        for (User user : users) {
            System.out.println(user.getName() + "--->" + user.getEmail());
        }
    }
}
