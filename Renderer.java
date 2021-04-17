package project;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Renderer extends DefaultTableCellRenderer{
	 
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
     boolean hasFocus, int row, int column)
 {

    if(value instanceof JLabel){
       
         JLabel label = (JLabel)value;
        
         
        return (JLabel)value;
    }
   
   

    else{
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
 }
}