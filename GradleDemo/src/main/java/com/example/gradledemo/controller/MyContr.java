package com.example.gradledemo.controller;

import com.example.gradledemo.model.MyeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyContr {

    @Autowired
    private MyeModel myeModel;

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(){
        myeModel.setName("Hellow world");
        return myeModel.toString();
    }
}
