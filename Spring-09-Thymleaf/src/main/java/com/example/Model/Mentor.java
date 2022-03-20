package com.example.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Mentor {
    private String firstName;
    private String  lastName,email,gender,batch,company;
    private boolean graduated;
}
