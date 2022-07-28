package com.swe645.controller;

import com.swe645.entity.Student;
import com.swe645.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    @CrossOrigin(origins="http://localhost:4200")
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @CrossOrigin(origins="http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}
