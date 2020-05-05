/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ui;

import domain.controller.Controller;

/**
 *
 * @author lab1321
 */
public class SettingPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private Controller controller;
    
    public SettingPanel(MainFrame mainFrame, Controller controller) {
        this.mainFrame = mainFrame;
        this.controller = controller;
        this.setBounds(0, 0, 500, 500);
        initComponents();
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        goBackToInventoryBtn = new javax.swing.JButton();
        settingLabel = new javax.swing.JLabel();

        goBackToInventoryBtn.setText("Go Back To Inventory");
        goBackToInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackToInventoryBtnActionPerformed(evt);
            }
        });

        settingLabel.setText("Setting");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(goBackToInventoryBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(settingLabel)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(settingLabel)
                .addGap(53, 53, 53)
                .addComponent(goBackToInventoryBtn)
                .addContainerGap(371, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackToInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackToInventoryBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getSettingPanel());
        mainFrame.getContentPane().add(mainFrame.getHomePanel());
        mainFrame.getHomePanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_goBackToInventoryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackToInventoryBtn;
    private javax.swing.JLabel settingLabel;
    // End of variables declaration//GEN-END:variables
}
