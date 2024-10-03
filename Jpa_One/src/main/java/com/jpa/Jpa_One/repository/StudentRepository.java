package com.jpa.Jpa_One.repository;

import com.jpa.Jpa_One.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //JPQL
    @Query("select s from Student s where s.firstName LIKE %:keyword%")
    public List<Student> findStudentContains(@Param("keyword") String keyword);

    //Native
    @Query(
            value = "select * from tbl_student s where s.guardian_name LIKE %:keyword%",
            nativeQuery = true
    )
    public List<Student> findStudentContainsGuardian(@Param("keyword") String keyword);
}
