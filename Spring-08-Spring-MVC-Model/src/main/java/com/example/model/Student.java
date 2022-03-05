package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {
    private String firstName;
    private String  LastName;

    private int id;
}
