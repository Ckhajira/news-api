package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Depnews implements Comparable<Depnews>{
    private int id;
    private String content;
    private String writtenBy;
    private int rating;
    private int departmentId;
    private long createdat;
    private String formattedCreatedAt;
}