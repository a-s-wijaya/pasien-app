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
    private int firstSize = 40;
    private int editSize = 60;
    private int deleteSize = 60;
    private String rowColor = "#15191C";
    private String textColor = "#FFFFFF";
    
    public setTableModel() {
        
    }
    
    public setTableModel build(JTable table) {
        DefaultTableModel tDktr = (DefaultTableModel) table.getModel();
        customRenderer tableColor = new customRenderer();
        // Set all cells height on header
        table.setRowHeight(40);
        table.getTableHeader().setOpaque(true);
//        table.getTableHeader().setBackground(Color.decode("#15191C"));

        // Set width for ID, edit and delete
        table.getColumnModel().getColumn(0).setMaxWidth(firstSize);
        table.getColumnModel().getColumn(table.getColumnModel().getColumnCount() - 2).setMaxWidth(editSize);
        table.getColumnModel().getColumn(table.getColumnModel().getColumnCount() - 1).setMaxWidth(deleteSize);

        table.setDefaultEditor(Object.class, null); // Disable cell editing
        
        tableColor.setColors(Color.decode(rowColor));
        tableColor.setTextColors(Color.decode(textColor));
        
        // Set color based on number of columns
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(tableColor);
        }
        return this;
    }
    
    public setTableModel setLastTwo(int size) {
        this.editSize = size;
        return this;
    }
    
    public setTableModel setLast(int size) {
        this.deleteSize = size;
        return this;
    }
    
    public setTableModel setFirst(int size) {
        this.firstSize = size;
        return this;
    }
    
    public setTableModel setRowColor(String color) {
        if (color.charAt(0) != '#') {
            color = "#" + color;
        }
        this.rowColor = color;
        return this;
    }
    
    public setTableModel setRowTextColor(String color) {
        if (color.charAt(0) != '#') {
            color = "#" + color;
        }
        this.textColor = color;
        return this;
    }
}
