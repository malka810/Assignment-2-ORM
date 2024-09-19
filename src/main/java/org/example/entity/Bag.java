package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Bag {

    @Id
    private int bId;
    private String type;
    private String colour;

    @ManyToOne
    @JoinColumn(name = "st_id")
    private Student student;

    public Bag() {
    }

    public Bag(int wId, String type, String colour, Student student) {
        this.bId = wId;
        this.type = type;
        this.colour = colour;
        this.student = student;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "wId=" + bId +
                '}';
    }
}

