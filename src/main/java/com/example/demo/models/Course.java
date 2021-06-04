package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="course")
public class Course implements Serializable {
    private static  final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    private String Title;
    private Long numHours;
    public Course(){}
    public Course(int id, String title, Long numHours) {
        this.id = id;
        Title = title;
        this.numHours = numHours;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public Long getNumHours() {
        return numHours;
    }
    public void setNumHours(Long numHours) {
        this.numHours = numHours;
    }
}