package ru.litvinov.jpa.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.litvinov.jpa.jpa.models.Auto;
import ru.litvinov.jpa.jpa.service.AutoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger("JCG");

    @Autowired
    private AutoService service;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //id, model, maxspeed, mileage
        LOG.info("Current objects in DB: {}", service.countAutos());

        Auto auto = service.createAuto(new Auto("Shubham", 23,200));
        LOG.info("auto created in DB : {}", auto);

        LOG.info("Current objects in DB: {}", service.countAutos());

        auto.setModel("NewFcknModel");
        Auto editedPerson = service.editAuto(auto);
        LOG.info("auto edited in DB  : {}", auto);

        service.deleteAuto(auto);
        LOG.info("After deletion, count: {}", service.countAutos());

    }
}
