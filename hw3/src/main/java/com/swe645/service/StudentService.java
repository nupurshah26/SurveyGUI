package com.swe645.service;

import com.swe645.entity.Student;
import com.swe645.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student removed !! " + id;
    }

    public Student updateStudent(Student student) {
        Student existingStudent = repository.findById(student.getId()).orElse(null);
        existingStudent.setFirstname(student.getFirstname());
        existingStudent.setLastname(student.getLastname());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setCity(student.getCity());
        existingStudent.setState(student.getState());
        existingStudent.setZip(student.getZip());
        existingStudent.setTelephone(student.getTelephone());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDos(student.getDos());
        existingStudent.setLikedabtcampus(student.getLikedabtcampus());
        existingStudent.setIntrestinuni(student.getIntrestinuni());
        existingStudent.setRecos(student.getRecos());
        return repository.save(existingStudent);
    }
}
