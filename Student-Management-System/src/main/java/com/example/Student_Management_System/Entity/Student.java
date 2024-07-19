package com.example.Student_Management_System.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name="first_Name",nullable = false)
    private String firstName;
    @Column(name="last_Name")
    private String lastName;
    @Column(name ="contact")
    private String contact;
    @Column(name="address")
    private String address;
    @Column(name="email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "dob")
    private String DOB;



    public Student(){

    }


    public Student(String firstName, String lastName, String contact, String address, String email, String gender, String DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
