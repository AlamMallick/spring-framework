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
public class Employee extends BaseEntity{




    private String firstname;
    private String lastname;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    private Department department;

    public Employee(String firstname, String lastname, String email, LocalDate hireDate, Gender gender, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }
}
