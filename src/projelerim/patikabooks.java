package projelerim;

import projelerim.service.UserService;

public class patikabooks {
    public static void main(String[] args) {


        UserService userService = new UserService();
        userService.create("tugrul", "tgrl@gmail.com ", "password");
        userService.create("ali", "rtk@gmail.com ", "password1");
        userService.create("elif", "trk@gmail.com ", "password2");
        userService.create("yagmur", "krt@gmail.com ", "password3");
        userService.list();

    }
}




