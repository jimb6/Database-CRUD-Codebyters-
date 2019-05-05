/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import model.DatabaseAccount;

/**
 *
 * @author Jim
 */
public class DatabaseConnection {
    
    
    private static final String host = "jdbc:mysql://localhost:3306/demo_db";
    public static final String user = "root";
    private static final String password = "0418";
    public static final String database = "demo_db";
            
    public static Connection connect() {
        try {
            return DriverManager.getConnection(host, user, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static Connection oldConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(host, user, password);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
