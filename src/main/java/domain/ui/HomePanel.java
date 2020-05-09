/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain.ui;

import domain.controller.IController;
import domain.labMember.ILabMember;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author bozhi
 */
public class HomePanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private IController controller;
    private ILabMember labMember;
    
    /** Creates new form HomePanel */
    public HomePanel(MainFrame mainFrame, IController controller) {
        this.mainFrame = mainFrame;
        this.controller = controller;
        this.setBounds(0, 0, 800, 600);
        initComponents();
        this.setVisible(false);
        Icon inventoryIcon = new ImageIcon(this.getClass().getResource("images/inventory.png"));
        Icon settingIcon = new ImageIcon(this.getClass().getResource("images/setting.png"));
        Icon logoutIcon = new ImageIcon(this.getClass().getResource("images/logout.png"));
        goToInventoryBtn.setIcon(inventoryIcon);
        settingBtn.setIcon(settingIcon);
        logoutBtn.setIcon(logoutIcon);
    }
    
    public void setLabMember(ILabMember labMember) {
        this.labMember = labMember;
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

        setBackground(new java.awt.Color(255, 255, 255));

        goToInventoryBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        goToInventoryBtn.setText("Inventory");
        goToInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToInventoryBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 40)); // NOI18N
        titleLabel.setText("Lab Inventory System");

        settingBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        settingBtn.setText("Setting");
        settingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(goToInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(settingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goToInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
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
        mainFrame.getSettingPanel().addLabMemberBtn.setVisible(false);
        if(labMember.getPermission().equals("Admin"))
            mainFrame.getSettingPanel().addLabMemberBtn.setVisible(true);
        mainFrame.getContentPane().remove(mainFrame.getHomePanel());
        mainFrame.getContentPane().add(mainFrame.getSettingPanel());
        mainFrame.getSettingPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
        mainFrame.getSettingPanel().nameField.setText(labMember.getName());
        mainFrame.getSettingPanel().emailField.setText(labMember.getEmail());
        mainFrame.getSettingPanel().phoneField.setText(labMember.getPhone());
        mainFrame.getSettingPanel().permissionField.setText(labMember.getPermission());
        mainFrame.getSettingPanel().permissionField.setEditable(false);
    }//GEN-LAST:event_settingBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getHomePanel());
        mainFrame.getContentPane().add(mainFrame.getLoginPanel());
        mainFrame.getLoginPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
        mainFrame.getLoginPanel().labMember = null;
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goToInventoryBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton settingBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
