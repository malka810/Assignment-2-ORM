package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

/* Inverse End */

@Entity
public class Student {
    @Id
    private int sId;
    private String name;
    private String address;

    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)

    private List<Bag> bagList;

    public Student() {
    }

    public Student(int sId, String name, String address, List<Bag> bagList) {
        this.sId = sId;
        this.name = name;
        this.address = address;
        this.bagList = bagList;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Bag> getWatchList() {
        return bagList;
    }

    public void setWatchList(List<Bag> bagList) {
        this.bagList = bagList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", watchList=" + bagList +
                '}';
    }
}

