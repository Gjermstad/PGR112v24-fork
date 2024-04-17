package solutions.database._04.src;

import solutions.database._03.src.Password;

public class Account
{
    //# Fields
    private final String username;
    private String password;


    //# Constructors
    public Account(String username, String password) {
        this.username = username;

        this.setPassword(password);
    }


    //# Getter-methods
    public String getUsername() {
        return this.username;
    }

    String getPassword() {
        return this.password;
    }


    //# Setter-methods
    void setPassword(String value) {
        this.password = Password.hash(value);
    }


    //# Methods
    boolean verifyPassword(String value) {
        return Password.hash(value).equals(this.getPassword());
    }
}
