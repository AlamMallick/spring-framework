package com.example.sping11ormmappingonetoone.entity;

import com.example.sping11ormmappingonetoone.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employess")
public class Employees extends BaseEntity{




    private String firstname;
    private String lastname;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    private String email;

    public Employees(String firstname, String lastname, LocalDate hireDate, String email, Gender gender, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.hireDate = hireDate;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int salary;





}
