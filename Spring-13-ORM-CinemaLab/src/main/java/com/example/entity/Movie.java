package com.example.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data

public class Movie extends BaseEntity{


    private String name;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "TEXT")
    private String summary;
    private


}
