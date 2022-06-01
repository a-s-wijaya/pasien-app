/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok3.app.pasien;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fauza
 */
public class setTableModel {
    public setTableModel(JTable table) {
        DefaultTableModel tDktr = (DefaultTableModel) table.getModel();
        customRenderer tableColor = new customRenderer();
        // Set all cells height
        table.setRowHeight(40);
        table.getTableHeader().setOpaque(true);
        table.getTableHeader().setBackground(Color.decode("#15191C"));

        // Set width for ID, edit and delete
        table.getColumnModel().getColumn(0).setMaxWidth(40);
        table.getColumnModel().getColumn(table.getColumnModel().getColumnCount() - 2).setMaxWidth(60);
        table.getColumnModel().getColumn(table.getColumnModel().getColumnCount() - 1).setMaxWidth(60);

        table.setDefaultEditor(Object.class, null); // Disable cell editing
        
        tableColor.setColors(Color.decode("#15191C"));
        tableColor.setTextColors(Color.WHITE);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(tableColor);
        }
    }
}
