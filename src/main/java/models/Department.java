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
}