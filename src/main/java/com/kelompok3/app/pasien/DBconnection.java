/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok3.app.pasien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fauza
 */
public class DBconnection {
     public static Connection connection;  
    public static Connection configDB()throws SQLException{
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pasienapp", "root", "");
//            System.out.println("Connection success");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return connection;
    }
}
