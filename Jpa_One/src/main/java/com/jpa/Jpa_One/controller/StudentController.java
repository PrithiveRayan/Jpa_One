package com.jpa.Jpa_One.controller;

import com.jpa.Jpa_One.entity.Student;
import com.jpa.Jpa_One.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return repo.save(student);
    }

    @PostMapping("/students")
    public List<Student> saveStudents(@RequestBody List<Student> student){
        return repo.saveAll(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return repo.findAll();
    }

    @GetMapping("/studentId/{id}")
    public Student getStudents(@PathVariable("id") Long studentId){
        return repo.findById(studentId).get();
    }

    @GetMapping("/student/firstName/{keyword}")
    public List<Student> getStudentsByFirstName(@PathVariable("keyword") String keyword){
        return repo.findStudentContains(keyword);
    }

    @GetMapping("/guardian/name/{keyword}")
    public List<Student> getStudentsByGuardianName(@PathVariable("keyword") String keyword){
        return repo.findStudentContainsGuardian(keyword);
    }
}
