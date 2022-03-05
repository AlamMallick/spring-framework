package com.example.controller;

import com.example.enums.Gender;
import com.example.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @RequestMapping("/list") //localhost:8080/mentor/list
    public String showTable(Model model){

        List<Mentor> mentorList=new ArrayList<>();
        mentorList.add(new Mentor("alex","Lee", Gender.Male,25));
        mentorList.add(new Mentor("Lex","Luthor", Gender.Male,35));
        mentorList.add(new Mentor("Mona","Lisa", Gender.Female,18));

        model.addAttribute("mentors",mentorList);



        return "mentor/mentor-list";
    }
}
