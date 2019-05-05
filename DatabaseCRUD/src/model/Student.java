/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jim
 */
public class Student {
    
    private String studentName;
    private String studentCourse;
    private String studentYear;
    private String studentIDNumber;
    
    public Student(){}
    
    public Student(String studentName, String studentCourse, String studentYear, String studentIDNumber){
        this.studentName = studentName;
        this.studentCourse = studentCourse;
        this.studentYear = studentYear;
        this.studentIDNumber = studentIDNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudentIDNumber() {
        return studentIDNumber;
    }

    public void setStudentIDNumber(String studentIDNumber) {
        this.studentIDNumber = studentIDNumber;
    }

    @Override
    public String toString() {
        return String.format("Student: %s, Course: %s, Year: %s, ID: %s", studentName, studentCourse, studentYear, studentIDNumber);
    }
    
    
    
}
