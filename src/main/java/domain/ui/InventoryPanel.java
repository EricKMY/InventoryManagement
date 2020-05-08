/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ui;

import domain.controller.IController;
import domain.inventory.LabInventory;
import domain.labMember.ILabMemberList;
import domain.labMember.LabMember;
import domain.labMember.LabMemberList;
import domain.notificationInfo.INotificationInfo;
import domain.notificationInfo.NotificationInfo;
import java.awt.Color;
import javax.swing.DefaultListModel;


/**
 *
 * @author bozhi
 */
public class InventoryPanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private IController controller;
    private LabMember labMember;
    private ILabMemberList labMemberList;
    
    DefaultListModel dm = new DefaultListModel();
    DefaultListModel dm_inventory_list = new DefaultListModel();
    
    /**
     * Creates new form InventoryPanel
     * @param mainFrame
     * @param controller
     * @param labMemberList
     */
    public InventoryPanel(MainFrame mainFrame, IController controller, ILabMemberList labMemberList) {
        this.mainFrame = mainFrame;
        this.controller = controller;
        this.labMemberList = labMemberList;
        this.setBounds(0, 0, 800, 600);
        initComponents();
        this.setVisible(false);
        presentLabel.setOpaque(true);
        presentLabel.setBackground(Color.LIGHT_GRAY);
        
        categoryTitle.setOpaque(true);
        inventoryTitle.setOpaque(true);
        setCategoryList();
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
        inputCategoryField = new javax.swing.JTextField();
        addCategoryBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryList = new javax.swing.JList<>();
        updateCategoryBtn = new javax.swing.JButton();
        deleteCategoryBtn = new javax.swing.JButton();
        notificationBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryList = new javax.swing.JList<>();
        deleteInventoryBtn = new javax.swing.JButton();
        addInventoryBtn = new javax.swing.JButton();
        presentLabel = new javax.swing.JLabel();
        updateInventoryBtn = new javax.swing.JButton();
        categoryTitle = new javax.swing.JLabel();
        inventoryTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 3, 40)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(142, 19, 118));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Lab Inventory System");

        goBackToHomeBtn.setText("Go back Home");
        goBackToHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackToHomeBtnActionPerformed(evt);
            }
        });

        inputCategoryField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        inputCategoryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCategoryFieldActionPerformed(evt);
            }
        });

        addCategoryBtn.setText("Add");
        addCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryBtnActionPerformed(evt);
            }
        });

        categoryList.setFont(new java.awt.Font("Palatino Linotype", 0, 20)); // NOI18N
        categoryList.setToolTipText("");
        categoryList.setSelectionBackground(new java.awt.Color(0, 153, 153));
        categoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categoryList);

        updateCategoryBtn.setText("Update");
        updateCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCategoryBtnActionPerformed(evt);
            }
        });

        deleteCategoryBtn.setLabel("Delete");
        deleteCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCategoryBtnActionPerformed(evt);
            }
        });

        notificationBtn.setText("Notification");
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });

        inventoryList.setFont(new java.awt.Font("Palatino Linotype", 0, 20)); // NOI18N
        inventoryList.setSelectionBackground(new java.awt.Color(0, 153, 153));
        inventoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(inventoryList);

        deleteInventoryBtn.setText("Delete");
        deleteInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInventoryBtnActionPerformed(evt);
            }
        });

        addInventoryBtn.setLabel("Add");
        addInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryBtnActionPerformed(evt);
            }
        });

        updateInventoryBtn.setText("Update");
        updateInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInventoryBtnActionPerformed(evt);
            }
        });

        categoryTitle.setBackground(new java.awt.Color(255, 255, 0));
        categoryTitle.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        categoryTitle.setForeground(new java.awt.Color(9, 9, 228));
        categoryTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryTitle.setText("CATEGORY");

        inventoryTitle.setBackground(new java.awt.Color(255, 255, 0));
        inventoryTitle.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        inventoryTitle.setForeground(new java.awt.Color(9, 9, 228));
        inventoryTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventoryTitle.setText("INVENTORY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(presentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(categoryTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputCategoryField)
                                    .addComponent(addCategoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateCategoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inventoryTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(notificationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteInventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addInventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(goBackToHomeBtn)))))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(goBackToHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inventoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateInventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(notificationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(18, 18, 18)
                .addComponent(presentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
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

    private void inputCategoryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCategoryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCategoryFieldActionPerformed

    private void addCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryBtnActionPerformed
        // TODO add your handling code here:
        String s = inputCategoryField.getText();
        if (s.replace(" ", "").isEmpty()) return;
        controller.createCategory(s, labMember);
        add(s);
        inputCategoryField.setText("");
        clearInventoryList();
    }//GEN-LAST:event_addCategoryBtnActionPerformed

    private void updateCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCategoryBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = categoryList.getSelectedIndex();
        if (selectedIndex < 0) return;
        String oCategory = categoryList.getSelectedValue();
        dm.setElementAt(inputCategoryField.getText(), selectedIndex);
        controller.updateCategoryName(oCategory, inputCategoryField.getText(), labMember);
        inputCategoryField.setText("");
    }//GEN-LAST:event_updateCategoryBtnActionPerformed

    private void categoryListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryListMouseClicked
        // TODO add your handling code here:
        if ( -1 == categoryList.getSelectedIndex() ) return;
        inputCategoryField.setText(categoryList.getSelectedValue());
        setInventoryList(categoryList.getSelectedValue());
        presentLabel.setText("");
    }//GEN-LAST:event_categoryListMouseClicked

    private void deleteCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCategoryBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = categoryList.getSelectedIndex();
        if (selectedIndex < 0) return;
        String category = categoryList.getSelectedValue();
        dm.removeElementAt(selectedIndex);
        controller.deleteCategory(category, labMember);
        inputCategoryField.setText("");
        clearInventoryList();
    }//GEN-LAST:event_deleteCategoryBtnActionPerformed

    private void notificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtnActionPerformed
        // TODO add your handling code here:
        if( -1 == inventoryList.getSelectedIndex() ) return;

        mainFrame.getContentPane().remove(mainFrame.getInventoryPanel());
        mainFrame.getContentPane().add(mainFrame.getNotificationPanel());
        mainFrame.getNotificationPanel().setVisible(true);
        
        mainFrame.revalidate();
        mainFrame.repaint();
        
        INotificationInfo notificationInfo = 
                controller.readInventory(categoryList.getSelectedValue(), inventoryList.getSelectedValue()).getNotificationInfo();
//        NotificationInfo notificationInfo  = new NotificationInfo(inventoryList.getSelectedValue());
        mainFrame.getNotificationPanel().setNotificationInfo(notificationInfo);
        mainFrame.getNotificationPanel().personnChargeField.setText(notificationInfo.getLabMemberInfo());
        mainFrame.getNotificationPanel().limitAmountField.setText(notificationInfo.getLimitAmount());
        mainFrame.getNotificationPanel().replenishmentAmountField.setText(notificationInfo.getReplenishmentAmount());
        mainFrame.getNotificationPanel().priceField.setText(notificationInfo.getInventoryPrice());
        mainFrame.getNotificationPanel().taxIdField.setText(notificationInfo.getTaxID());

    }//GEN-LAST:event_notificationBtnActionPerformed

    private void deleteInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInventoryBtnActionPerformed
        // TODO add your handling code here:
        if( -1 == inventoryList.getSelectedIndex() ) return;
        controller.deleteInventory(categoryList.getSelectedValue(), inventoryList.getSelectedValue(), labMember);
        setInventoryList(categoryList.getSelectedValue());
        presentLabel.setText("");
    }//GEN-LAST:event_deleteInventoryBtnActionPerformed

    private void addInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryBtnActionPerformed
        // TODO add your handling code here:
        if( -1 == categoryList.getSelectedIndex() ) return;
        PopMenu popMenu = new PopMenu();
        controller.createInventory(categoryList.getSelectedValue(), popMenu.getIName(), popMenu.getIAmount(), labMember);
        controller.readInventory(categoryList.getSelectedValue(), popMenu.getIName()).setLimitNum(1000);
        setInventoryList(categoryList.getSelectedValue());
    }//GEN-LAST:event_addInventoryBtnActionPerformed

    private void inventoryListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryListMouseClicked
        // TODO add your handling code here:
        if( -1 == inventoryList.getSelectedIndex() || -1 == categoryList.getSelectedIndex() ) return;
        String iName = inventoryList.getSelectedValue();
        String cName = categoryList.getSelectedValue();
        String detail = getInventoryDetail(controller.readInventory(cName, iName));
        
        presentLabel.setText(detail);
    }//GEN-LAST:event_inventoryListMouseClicked

    private String getInventoryDetail(LabInventory labInventory){
        return  "<html><body>" + "Category: " + labInventory.getCategory() + "<br/>" + "Inventory: "
                + labInventory.getName() + "<br/>" + "Amount: " + labInventory.getAmount() + "<br/>"
                + "Person In Charge: " + labInventory.getPersonInCharge().getName() + "</body></html>";
    }
    
    private void setCategoryList(){
        categoryList.setModel(dm);
        dm.clear();
        for (String s : controller.getLabInventoryList().getLabInventoryMap().keySet())
            dm.addElement(s);
    }
    
    private void setInventoryList(String categoryName){
        if( -1 == categoryList.getSelectedIndex() ) return;
        inventoryList.setModel(dm_inventory_list);
        dm_inventory_list.clear();
        for (LabInventory lit : controller.getLabInventoryList().getLabInventoryMap().get(categoryName)){
            dm_inventory_list.addElement(lit.getName());
        }
        // TODO : cellRenderer
//        inventoryList.setCellRenderer(new InventoryRenderer(controller, categoryList.getSelectedValue()));
    }
    
    private void updateInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInventoryBtnActionPerformed
        // TODO add your handling code here:
        if ( -1 == inventoryList.getSelectedIndex() || -1 == categoryList.getSelectedIndex() ) return;
        String iName = inventoryList.getSelectedValue();
        String cName = categoryList.getSelectedValue();
        PopMenu popMenu = new PopMenu();
        controller.updateInventoryName(cName, iName, popMenu.getIName(), labMember);
        controller.updateInventoryAmount(cName, popMenu.getIName(), popMenu.getIAmount(), labMember);
        String detail = getInventoryDetail(controller.readInventory(cName, popMenu.getIName()));
        presentLabel.setText(detail);
        setInventoryList(cName);
    }//GEN-LAST:event_updateInventoryBtnActionPerformed
   
    private void add(String name){
        categoryList.setModel(dm);
        dm.addElement(name);
    }
    
    private void clearInventoryList(){
        inventoryList.setModel(dm_inventory_list);
        dm_inventory_list.clear();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategoryBtn;
    private javax.swing.JButton addInventoryBtn;
    private javax.swing.JList<String> categoryList;
    private javax.swing.JLabel categoryTitle;
    private javax.swing.JButton deleteCategoryBtn;
    private javax.swing.JButton deleteInventoryBtn;
    private javax.swing.JButton goBackToHomeBtn;
    private javax.swing.JTextField inputCategoryField;
    private javax.swing.JList<String> inventoryList;
    private javax.swing.JLabel inventoryTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton notificationBtn;
    private javax.swing.JLabel presentLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateCategoryBtn;
    private javax.swing.JButton updateInventoryBtn;
    // End of variables declaration//GEN-END:variables

}
