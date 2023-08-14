package com.management.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.student.interfaces.CourseRepository;
import com.management.student.model.Course;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    
    @GetMapping("/courses")
    public String listCourses(Model model) {
        List<Course> courses = courseRepository.findAll();
        model.addAttribute("courses", courses);
        return "courses/list";
    }
    
    @GetMapping("/courses/add")
    public String addCourseForm(Model model) {
        model.addAttribute("course", new Course());
        return "courses/add";
    }
    
    @PostMapping("/courses/add")
    public String addCourse(@ModelAttribute Course course) {
        // Validate and save course to repository
        courseRepository.save(course);
        return "redirect:/courses";
    }
    
    // Delete course logic
}


