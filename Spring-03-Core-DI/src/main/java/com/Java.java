package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {
    //Filed injection
   // @Autowired
    //OfficeHours officeHours;

    OfficeHours officeHours;

@Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public void getTeachingHour(){
        System.out.println("Weekly teaching hors :"+20+officeHours.getHour());
    }

}
