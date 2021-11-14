package models;

import java.util.Objects;

public class User{
    private int id;
    private String name;
    private String title;
    private String role;

    public User(String name, String title, String role){
        this.name = name;
        this.title = title;
        this.role = role;
    }
}