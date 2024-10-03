package com.jpa.Jpa_One.controller;

import com.jpa.Jpa_One.entity.Course;
import com.jpa.Jpa_One.entity.CourseMaterial;
import com.jpa.Jpa_One.repository.CourseMaterialRepository;
import com.jpa.Jpa_One.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private CourseMaterialRepository materialRepo;

    // Course Api's
    @PostMapping("/course")
    public Course saveCourse(@RequestBody Course course){
        return courseRepo.save(course);
    }

    @PostMapping("/courses")
    public List<Course> saveCourses(@RequestBody List<Course> courses){
        return courseRepo.saveAll(courses);
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseRepo.findAll();
    }

    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable("id") Long courseId){
        return courseRepo.findById(courseId).get();
    }

    // Course Material Api's
    @PostMapping("/material")
    public CourseMaterial saveCourseMaterial(@RequestBody CourseMaterial material){
        return materialRepo.save(material);
    }

    @PostMapping("/materials")
    public List<CourseMaterial> saveCourseMaterials(@RequestBody List<CourseMaterial> materials){
        return materialRepo.saveAll(materials);
    }

    @GetMapping("/materials")
    public List<CourseMaterial> getCourseMaterials(){
        return materialRepo.findAll();
    }

    @GetMapping("/material/{id}")
    public CourseMaterial getCourseMaterialById(@PathVariable("id") Long materialId){
        return materialRepo.findById(materialId).get();
    }

}
