/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain.ui;

import domain.controller.Controller;

/**
 *
 * @author bozhi
 */
public class HomePanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private Controller controller;
    
    /** Creates new form HomePanel */
    public HomePanel(MainFrame mainFrame, Controller controller) {
        this.mainFrame = mainFrame;
        this.controller = controller;
        this.setBounds(0, 0, 500, 500);
        initComponents();
        this.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goToInventoryBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        settingBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        defaultLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        goToInventoryBtn.setText("Go to Inventory");
        goToInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToInventoryBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titleLabel.setText("Lab Inventory System");

        settingBtn.setText("Setting");
        settingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        defaultLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        defaultLabel.setText("Default Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(defaultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(goToInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(settingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goToInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addComponent(defaultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goToInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToInventoryBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getHomePanel());
        mainFrame.getContentPane().add(mainFrame.getInventoryPanel());
        mainFrame.getInventoryPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_goToInventoryBtnActionPerformed

    private void settingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getHomePanel());
        mainFrame.getContentPane().add(mainFrame.getSettingPanel());
        mainFrame.getSettingPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
        mainFrame.getSettingPanel().nameField.setText(controller.getLabMember().getName());
        mainFrame.getSettingPanel().emailField.setText(controller.getLabMember().getEmail());
        mainFrame.getSettingPanel().phoneField.setText(controller.getLabMember().getPhone());
        
    }//GEN-LAST:event_settingBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getHomePanel());
        mainFrame.getContentPane().add(mainFrame.getLoginPanel());
        mainFrame.getLoginPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel defaultLabel;
    private javax.swing.JButton goToInventoryBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton settingBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
