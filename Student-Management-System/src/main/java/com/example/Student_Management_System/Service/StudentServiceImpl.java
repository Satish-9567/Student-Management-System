package com.example.Student_Management_System.Service;

import com.example.Student_Management_System.Entity.Student;
import com.example.Student_Management_System.Repository.StudentRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepoitory studentRepoitory;

    public StudentServiceImpl(StudentRepoitory studentRepoitory) {
        super();
        this.studentRepoitory = studentRepoitory;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepoitory.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepoitory.save(student);
    }

    @Override
    public Student getStudentById(Long Id) {
        return studentRepoitory.findById(Id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepoitory.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepoitory.deleteById(id);
    }
}
