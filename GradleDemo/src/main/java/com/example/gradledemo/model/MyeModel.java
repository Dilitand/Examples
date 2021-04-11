package com.example.gradledemo.model;

import org.springframework.stereotype.Component;

@Component
public class MyeModel {
    private String name;

    @Override
    public String toString() {
        return "MyeModel{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
