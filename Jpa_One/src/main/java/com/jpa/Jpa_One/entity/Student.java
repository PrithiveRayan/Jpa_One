package com.jpa.Jpa_One.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailId_Unique",
                columnNames = "email_address"
        )
            )
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_seq",
            sequenceName = "student_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(
            name = "email_address",
            nullable = false
    )
    private String emailId;

    @Embedded
    private Guardian guardian;
}
