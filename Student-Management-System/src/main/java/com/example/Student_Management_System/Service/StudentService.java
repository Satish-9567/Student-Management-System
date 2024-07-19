package com.example.Student_Management_System.Service;

import com.example.Student_Management_System.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long Id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
