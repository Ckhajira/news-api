package models;

import java.util.Objects;

public class Department{
    private int id;
    private String name;
    private String description;
    private String size;

    public Department(String name, String description, String size){
        this.name = name;
        this.description = description;
        this.size =size;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(String size) {
        this.size = size;
    }

}