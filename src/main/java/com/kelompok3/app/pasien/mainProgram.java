/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kelompok3.app.pasien;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fauza
 */
public class mainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String sql = "SELECT * FROM admin";
            Connection Vconn = (Connection)DBconnection.configDB();
            Statement s = Vconn.createStatement();
            ResultSet r = s.executeQuery(sql);
            if(r.next()) {
                new login().setVisible(true);
            } else{
                JOptionPane.showMessageDialog(null, "Data admin tidak ditemukan! Halaman akan membuka ke menu pasien", "Peringatan", JOptionPane.WARNING_MESSAGE);
                new pasien().setVisible(true);
            }
            
        } catch(Exception e) {
            
        }
    }
    
}
