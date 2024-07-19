package com.example.Student_Management_System.Repository;

import com.example.Student_Management_System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepoitory extends JpaRepository<Student,Long> {
}
