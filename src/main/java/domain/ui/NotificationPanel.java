/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ui;

import domain.controller.Controller;
import domain.controller.IController;
import domain.notificationInfo.INotificationInfo;
import javax.swing.JOptionPane;

/**
 *
 * @author lab1321
 */
public class NotificationPanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private IController controller;
    private INotificationInfo notificationInfo;
    
    /**
     * Creates new form NotificationPanel
     */
    public NotificationPanel(MainFrame mainFrame, IController controller) {
        this.mainFrame = mainFrame;
        this.controller = controller;
        this.setBounds(0, 0, 800, 600);
        initComponents();
        this.setVisible(false);
    }
    
    public void setNotificationInfo(INotificationInfo notificationInfo) {
        this.notificationInfo = notificationInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        titleLabel = new javax.swing.JLabel();
        limitAmountLabel = new javax.swing.JLabel();
        personnChargeField = new javax.swing.JTextField();
        personInChargeLabel = new javax.swing.JLabel();
        limitAmountField = new javax.swing.JTextField();
        replenishmentAmountPanel = new javax.swing.JLabel();
        taxIdField = new javax.swing.JTextField();
        taxIdPanel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        okBtn1 = new javax.swing.JButton();
        pricePanel = new javax.swing.JLabel();
        replenishmentAmountField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 40)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Notification");
        titleLabel.setMaximumSize(new java.awt.Dimension(442, 48));
        titleLabel.setMinimumSize(new java.awt.Dimension(442, 48));
        titleLabel.setPreferredSize(new java.awt.Dimension(442, 48));

        limitAmountLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        limitAmountLabel.setText("Limit Amount");

        personnChargeField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        personnChargeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personnChargeFieldActionPerformed(evt);
            }
        });

        personInChargeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        personInChargeLabel.setText("Person In Charge");

        limitAmountField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        limitAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitAmountFieldActionPerformed(evt);
            }
        });

        replenishmentAmountPanel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        replenishmentAmountPanel.setText("Replenishment Amount");

        taxIdField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        taxIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxIdFieldActionPerformed(evt);
            }
        });

        taxIdPanel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        taxIdPanel.setText("Tax ID");

        priceField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        okBtn1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        okBtn1.setText("OK");
        okBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtn1ActionPerformed(evt);
            }
        });

        pricePanel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        pricePanel.setText("Price");

        replenishmentAmountField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        replenishmentAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replenishmentAmountFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(replenishmentAmountPanel)
                            .addComponent(personInChargeLabel)
                            .addComponent(pricePanel)
                            .addComponent(limitAmountLabel)
                            .addComponent(taxIdPanel))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(okBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limitAmountField, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(personnChargeField)
                            .addComponent(replenishmentAmountField, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(priceField, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(taxIdField)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personInChargeLabel)
                    .addComponent(personnChargeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limitAmountLabel)
                    .addComponent(limitAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replenishmentAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replenishmentAmountPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricePanel)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxIdPanel)
                    .addComponent(taxIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personnChargeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personnChargeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personnChargeFieldActionPerformed

    private void taxIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxIdFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void limitAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitAmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limitAmountFieldActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getNotificationPanel());
        mainFrame.getContentPane().add(mainFrame.getInventoryPanel());
        mainFrame.getInventoryPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void okBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtn1ActionPerformed
        // TODO add your handling code here:
        
        if(personnChargeField.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Person In Charge should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(limitAmountField.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Limit Amount should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(replenishmentAmountField.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Replenishment Amount should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(priceField.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Price should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(taxIdField.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tax ID should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        notificationInfo.setLabMemberInfo(personnChargeField.getText());
        notificationInfo.setLimitAmount(limitAmountField.getText());
        notificationInfo.setReplenishmentAmount(replenishmentAmountField.getText());
        notificationInfo.setInventoryPrice(priceField.getText());
        notificationInfo.setTaxID(taxIdField.getText());

        mainFrame.getContentPane().remove(mainFrame.getNotificationPanel());
        mainFrame.getContentPane().add(mainFrame.getInventoryPanel());
        mainFrame.getInventoryPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_okBtn1ActionPerformed

    private void replenishmentAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replenishmentAmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_replenishmentAmountFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPopupMenu jPopupMenu1;
    protected javax.swing.JTextField limitAmountField;
    private javax.swing.JLabel limitAmountLabel;
    private javax.swing.JButton okBtn1;
    private javax.swing.JLabel personInChargeLabel;
    protected javax.swing.JTextField personnChargeField;
    protected javax.swing.JTextField priceField;
    private javax.swing.JLabel pricePanel;
    protected javax.swing.JTextField replenishmentAmountField;
    private javax.swing.JLabel replenishmentAmountPanel;
    protected javax.swing.JTextField taxIdField;
    private javax.swing.JLabel taxIdPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
