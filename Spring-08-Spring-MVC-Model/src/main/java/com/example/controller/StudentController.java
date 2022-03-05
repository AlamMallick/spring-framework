package com.example.controller;

import com.example.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        List<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        model.addAttribute("numbers",numbers);

        Student student=new Student("mike","tyson",25);
        model.addAttribute("student",student);


        return "/student/welcome";
    }
}
