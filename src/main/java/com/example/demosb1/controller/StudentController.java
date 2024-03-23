package com.example.demosb1.controller;

import com.example.demosb1.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @GetMapping
    public ResponseEntity get() {
        return new ResponseEntity(new Student(1, "Như Anh", 20), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable Integer id) {
        return new ResponseEntity(new Student(id, "Như Anh", 20), HttpStatus.OK);
    }
}
