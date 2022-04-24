package com.example.sping11ormmappingonetoone.entity;

import javax.persistence.*;

@Entity
@Table(name="tables")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String region;
    private String country;





}
