package ru.litvinov.jpa.jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan(basePackages = {"ru.litvinov.jpa"})
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Autowired
    Environment environment;

}
