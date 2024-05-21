package com.example.testck;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name ="animal")
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    
    String loai;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLoai() {
        return loai;
    }
    public void setLoai(String loai) {
        this.loai = loai;
    }


}
