package com.jpa.Jpa_One.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Course {

    @Id
    @SequenceGenerator(
            name = "course_seq",
            sequenceName = "course_seq",
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_seq"
    )
    private Long courseId;
    private String title;
    private Integer credit;
}
