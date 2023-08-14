package com.management.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.student.interfaces.CourseRepository;
import com.management.student.interfaces.ResultRepository;
import com.management.student.interfaces.StudentRepository;
import com.management.student.model.Result;

@Controller
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping("/results")
    public String listResults(Model model) {
        List<Result> results = resultRepository.findAll();
        model.addAttribute("results", results);
        return "results/list";
    }
    
    @GetMapping("/results/add")
    public String addResultForm(Model model) {
        model.addAttribute("result", new Result());
        model.addAttribute("courses", courseRepository.findAll());
        model.addAttribute("students", studentRepository.findAll());
        return "results/add";
    }
    
    @PostMapping("/results/add")
    public String addResult(@ModelAttribute Result result) {
        // Validate and save result to repository
        resultRepository.save(result);
        return "redirect:/results";
    }
    
    // Delete result logic
}