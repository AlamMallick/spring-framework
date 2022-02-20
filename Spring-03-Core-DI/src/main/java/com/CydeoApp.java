package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {


        ApplicationContext container =new AnnotationConfigApplicationContext(ConfigCar.class);

        container.getBean(Java.class).getTeachingHour();



    }

}
