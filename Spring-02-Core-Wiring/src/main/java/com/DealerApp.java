package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.Socket;

public class DealerApp {
    public static void main(String[] args) {

        ApplicationContext dealer=new AnnotationConfigApplicationContext(ConfigCar.class);

        System.out.println(dealer.getBean(Person.class).getName());


        Car c =dealer.getBean(Car.class);

        Person p=dealer.getBean(Person.class);

        System.out.println("Person name-" +p.getName());
        System.out.println("Cars name-" +c.getMake());


        //it will give you null-- to solve this we need to create a relationship between beans 2ways  (Wiring, Autowiring)

        //Wiring-- call method from another method (From @Bean annotation)
        // Autowiring- calling through the parameter


        System.out.println("Persons Car-"+p.getCar().getMake());




    }

}
