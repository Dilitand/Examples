package ru.litvinov.jpa.jpa.models;

import javax.persistence.*;

@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "model")
    String model;
    @Column(name = "maxspeed")
    int maxspeed;
    @Column(name="mileage")
    int mileage;

    public Auto() {
    }

    public Auto(String model, int maxspeed, int mileage) {
        this.model = model;
        this.maxspeed = maxspeed;
        this.mileage = mileage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", maxspeed=" + maxspeed +
                ", mileage=" + mileage +
                '}';
    }
}
