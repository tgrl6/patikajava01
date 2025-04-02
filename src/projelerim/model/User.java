package projelerim.model;

import projelerim.model.enums.Gender;

import java.time.LocalDate;

public class User {
    private String name;

    private  String email;

    private String password;

    private Gender gender ;

    private LocalDate birthday;

    private LocalDate createdDate;

    private Boolean isActive;


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdDate= LocalDate.now();
        this.isActive = true;


    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Boolean getActive() {
        return isActive;
    }









    
}
