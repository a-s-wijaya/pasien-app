/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok3.app.pasien;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author fauza
 */

/**
 Class is used to change color of table rows 
*/

public class customRenderer extends DefaultTableCellRenderer {
    private List<Color> desiredColors = new ArrayList<Color>();
    private List<Color> desiredTextColors = new ArrayList<Color>();
    
    public void setColors(Color incomingColor) {
        desiredColors.add(incomingColor);
    }
    
    public void setTextColors(Color incomingColor) {
        desiredTextColors.add(incomingColor);
    }
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        for (int i = 0; i < desiredColors.size(); i++) {
            if(row == i) {
                cellComponent.setBackground(desiredColors.get(i));
                cellComponent.setForeground(desiredTextColors.get(i));
                table.getTableHeader().setBackground(desiredColors.get(i));
                table.getTableHeader().setForeground(desiredTextColors.get(i));
            }
//            System.out.println("Row: " + desiredColors.get(i) + row + column + "size: " + desiredColors.size() + " index: " + i);
        }
        return cellComponent;
    }
}
