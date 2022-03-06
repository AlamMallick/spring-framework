package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/car")
public class CarController {
    @RequestMapping("info")
    public String carInfo(@RequestParam String make, Model model, @RequestParam int year) {
        System.out.println(make);
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";

    }

    @RequestMapping("info2")
    public String carInfo2(@RequestParam(value = "make", required = false,defaultValue = "honda") String make, Model model) {
        //System.out.println(make);
        model.addAttribute("make", make);
        //model.addAttribute("year", year);
        return "car/car-info";

    }
    @RequestMapping("info/{make}/{year}")
    public String getCarInfo(@PathVariable String make,Model model,@PathVariable Integer year){
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";

    }

}