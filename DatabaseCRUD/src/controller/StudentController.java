/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.DatabaseAccount;
import model.Student;

/**
 *
 * @author Jim
 */
public class StudentController {
    
    
    public static boolean AddStudent(Student student){
        
        String query = String.format("INSERT INTO students values(null,?,?,?,?)");
       
        try(Connection connection = DatabaseConnection.connect();
            PreparedStatement pstmt = connection.prepareStatement(query)){
        
            pstmt.setString(1, student.getStudentName());
            pstmt.setString(2, student.getStudentCourse());
            pstmt.setString(3, student.getStudentYear());
            pstmt.setString(4, student.getStudentIDNumber());
            
            pstmt.execute();
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public static boolean updateStudent(int id, Student student){
        
        String query = String.format("Update students set name=?, course=?, year=?, idnumber=?");
       
        try(Connection connection = DatabaseConnection.connect();
            PreparedStatement pstmt = connection.prepareStatement(query)){
        
            pstmt.setString(1, student.getStudentName());
            pstmt.setString(2, student.getStudentCourse());
            pstmt.setString(3, student.getStudentYear());
            pstmt.setString(4, student.getStudentIDNumber());
            
            pstmt.execute();
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public static boolean deleteSutdent(int id) {
        String query = "DELETE FROM students where studID=" + id;
        try(Connection conn = DatabaseConnection.connect();
                Statement stmt = conn.createStatement()){
            
            stmt.execute(query);
            
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
            return false;
        }
        return true;
    }

    public static ArrayList<Student> getAllStudents() {
        String query = "SELECT * FROM students";
        ArrayList<Student> studentList = new ArrayList<>();
        
        try(Connection conn = DatabaseConnection.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)){

            while(rs.next()){
                
                String name = rs.getString("name");
                String course = rs.getString("course");
                String year = rs.getString("year");
                String id = rs.getString("idnumber");
                
                Student student = new Student(name, course, year, id);
                studentList.add(student);
            }
            
        }catch(SQLException sqle){
            System.out.println("No student fetched!");
            return null;
        }
        return studentList;
    }
    
    
    
}
