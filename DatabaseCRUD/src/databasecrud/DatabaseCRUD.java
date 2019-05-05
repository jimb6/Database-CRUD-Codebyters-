/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecrud;

import controller.DatabaseConnection;
import controller.StudentController;
import java.sql.Connection;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author Jim
 */
public class DatabaseCRUD {

    /**
     * @param args the command line arguments
     */
    static Connection connection;

    public static void main(String[] args) {
            
       
        Student student = new Student("Jann", "IT", "3rd Year", "2016-0418");
        if(addStudent(student)){
            System.out.println("Added to database!");
        }else{
            System.out.println("Not Added to database!");
        }

//        Student student = new Student("Jeff", "CE", "4rd Year", "2016-0418");
//        if(updateStudent(1, student)){
//            System.out.println("Updated to database!");
//        }else{
//            System.out.println("Not Updated to database!");
//        }
//        if (deleteStudent(1)) {
//            System.out.println("Sutdetn Deleted!");
//        } else {
//            System.out.println("Student Not Deleted!");
//        }
//        ArrayList<Student> studentList = getStudents();
//        if (studentList != null) {
//            studentList.forEach(s ->{
//                System.out.println(s);
//            });
//        }

    }

    static boolean addStudent(Student student) {
        return StudentController.AddStudent(student);
    }

    static boolean updateStudent(int id, Student student) {
        return StudentController.updateStudent(id, student);
    }

    static boolean deleteStudent(int id) {
        return StudentController.deleteSutdent(id);
    }

    static ArrayList<Student> getStudents() {
        return StudentController.getAllStudents();

    }

}
