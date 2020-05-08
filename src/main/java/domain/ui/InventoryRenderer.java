/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ui;

import domain.controller.IController;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author user
 */
public class InventoryRenderer extends DefaultListCellRenderer {

    private IController controller;
    private String categoryName;
    
    public InventoryRenderer(IController controller, String categoryName) {
        this.categoryName = categoryName;
        this.controller = controller;
        setOpaque(true);
    }

    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
        boolean isSelected, boolean cellHasFocus) {
        
        Component c = super.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus ); 
        if( controller.readInventory(categoryName, value).isUnderLimit() ) c.setBackground(Color.RED);
         
        return c; 
    }
    
}
