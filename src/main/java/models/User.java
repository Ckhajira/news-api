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

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}