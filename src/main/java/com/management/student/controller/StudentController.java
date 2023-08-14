package com.management.student.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.student.interfaces.StudentRepository;
import com.management.student.model.Student;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping("/students")
    public String listStudents(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "students/list";
    }
    
    @GetMapping("/students/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/add";
    }
    
    @PostMapping("/students/add")
    public String addStudent(@Valid @ModelAttribute Student student, BindingResult result) {
	 if (result.hasErrors()) {
	        // Handle validation errors
	        return "students/add";
	    }
        // Validate and save student to repository
        studentRepository.save(student);
        return "redirect:/students";
    }
    
    // Delete student logic
}
