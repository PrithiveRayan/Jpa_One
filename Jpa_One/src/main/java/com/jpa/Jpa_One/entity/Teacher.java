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
public class Teacher {

    @Id
    @SequenceGenerator(
            name = "teacher_seq",
            sequenceName = "teacher_seq",
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_seq"
    )
    private Long teacherId;
    private String firstName;
    private String lastName;
}
