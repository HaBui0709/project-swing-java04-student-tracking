/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author KimAnh
 */
public class Student {
    private int studentId;
    private String fullName;
    private boolean gender;
    private LocalDate dateOfBirth;
    private String phone;
    private String email;
    private String flink;
    private String workplace;
    private String address;
    private String description;
    private String status;

    public Student() {
    }

    public Student(int studentId, String fullName, boolean gender, LocalDate dateOfBirth, String phone, String email, String flink, String workplace, String address, String description, String status) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.flink = flink;
        this.workplace = workplace;
        this.address = address;
        this.description = description;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFlink() {
        return flink;
    }

    public void setFlink(String flink) {
        this.flink = flink;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Student)){
            return false;
        }
        Student student  = (Student) o;
        return Objects.equals(this.studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", fullName=" + fullName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", email=" + email + ", flink=" + flink + ", workplace=" + workplace + ", address=" + address + ", description=" + description + ", status=" + status + '}';
    }
    
    
}
