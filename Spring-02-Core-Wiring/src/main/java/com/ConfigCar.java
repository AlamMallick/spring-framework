package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ConfigCar {

    @Bean
    Car car(){
     Car c=new Car();
     c.setMake("Honda");
     return  c;
    }


// DIRECT WIRING
//    @Bean
//    Person person(){
//       Person p=new Person();
//        p.setName("Mike");
//        p.setCar(car());
//        return p;



    //AUTOWIRING
    @Bean
    Person person(Car car) {
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        return p;

    }


    }
