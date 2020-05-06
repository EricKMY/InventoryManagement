/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ui;

import domain.controller.Controller;
import domain.inventory.LabInventory;
import domain.labMember.LabMember;
import domain.labMember.LabMemberList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author bozhi
 */
public class InventoryPanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private Controller controller;
    private LabMember labMember;
    private LabMemberList labMemberList;
    
    DefaultListModel dm = new DefaultListModel();
    DefaultListModel dm_inventory_list = new DefaultListModel();
    
    /**
     * Creates new form InventoryPanel
     * @param mainFrame
     * @param controller
     */
    public InventoryPanel(MainFrame mainFrame, Controller controller, LabMemberList labMemberList) {
        this.mainFrame = mainFrame;
        this.controller = controller;
        this.labMemberList = labMemberList;
        this.setBounds(0, 0, 800, 600);
        initComponents();
        this.setVisible(false);
    }
    
    public void setLabMember(LabMember labMember) {
        this.labMember = labMember;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        goBackToHomeBtn = new javax.swing.JButton();
        inputField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList<>();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        notificationBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryList = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titleLabel.setText("Lab Inventory System");

        goBackToHomeBtn.setText("Go back Home");
        goBackToHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackToHomeBtnActionPerformed(evt);
            }
        });

        inputField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        categoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryList);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setLabel("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        notificationBtn.setText("Notification");
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(inventoryList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(titleLabel)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(goBackToHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(notificationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goBackToHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notificationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackToHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackToHomeBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getInventoryPanel());
        mainFrame.getContentPane().add(mainFrame.getHomePanel());
        mainFrame.getHomePanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_goBackToHomeBtnActionPerformed

    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String s = inputField.getText();
        if (s.replace(" ", "").isEmpty()) return;
        controller.createCategory(s, new LabMember("", "", ""));
        /* here set default value to debug, remove while CRUD for LabInventory button done */
        controller.createInventory(s, "defualtLabInventory", 1, new LabMember("", "", ""));
        add(s);
        inputField.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = categoryList.getSelectedIndex();
        if (selectedIndex < 0) return;
        String oCategory = categoryList.getSelectedValue();
        dm.setElementAt(inputField.getText(), selectedIndex);
        controller.updateCategoryName(oCategory, inputField.getText(), new LabMember("", "", ""));
        inputField.setText("");
    }//GEN-LAST:event_updateBtnActionPerformed

    private void categoryListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryListMouseClicked
        // TODO add your handling code here:
        String selected = categoryList.getSelectedValue();
        inputField.setText(selected);
        popInventoryList(controller.getLabInventoryList().getLabInventoryMap().get(selected));
    }//GEN-LAST:event_categoryListMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = categoryList.getSelectedIndex();
        if (selectedIndex < 0) return;
        String category = categoryList.getSelectedValue();
        dm.removeElementAt(selectedIndex);
        controller.deleteCategory(category, new LabMember("", "", ""));
        inputField.setText("");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void notificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getInventoryPanel());
        mainFrame.getContentPane().add(mainFrame.getNotificationPanel());
        mainFrame.getNotificationPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_notificationBtnActionPerformed
   
    private void add(String name){
        categoryList.setModel(dm);
        dm.addElement(name);
    }
    
    private void popInventoryList(List<LabInventory> listInventory){
        inventoryList.setModel(dm_inventory_list);
        dm_inventory_list.clear();
        for( LabInventory lit : listInventory ){
            dm_inventory_list.addElement(lit.getName());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JList<String> categoryList;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton goBackToHomeBtn;
    private javax.swing.JTextField inputField;
    private javax.swing.JList<String> inventoryList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton notificationBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

}
