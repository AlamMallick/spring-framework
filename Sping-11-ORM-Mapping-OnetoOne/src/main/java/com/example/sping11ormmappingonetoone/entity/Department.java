package com.example.sping11ormmappingonetoone.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity {




    private String department;
    private String division;


    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
