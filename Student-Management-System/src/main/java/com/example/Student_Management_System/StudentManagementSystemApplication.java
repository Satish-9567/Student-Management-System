package com.example.Student_Management_System;

//import org.springframework.boot.CommandLineRunner;
import com.example.Student_Management_System.Entity.Student;
import com.example.Student_Management_System.Repository.StudentRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("ok great job");
	}

	@Autowired
	private StudentRepoitory studentRepoitory;
	@Override
	public void run(String... args) throws Exception {
//
	}
}
