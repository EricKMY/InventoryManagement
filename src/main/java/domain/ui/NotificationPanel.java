/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ui;

import domain.controller.Controller;
import domain.controller.IController;

/**
 *
 * @author lab1321
 */
public class NotificationPanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private IController controller;
    

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notificationLabel = new javax.swing.JLabel();
        goBackToHomeBtn = new javax.swing.JButton();

        notificationLabel.setText("Notification");

        goBackToHomeBtn.setText("Go Back To Home");
        goBackToHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackToHomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(goBackToHomeBtn)
                    .addComponent(notificationLabel))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(notificationLabel)
                .addGap(44, 44, 44)
                .addComponent(goBackToHomeBtn)
                .addContainerGap(473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackToHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackToHomeBtnActionPerformed
        // TODO add your handling code here:
        mainFrame.getContentPane().remove(mainFrame.getNotificationPanel());
        mainFrame.getContentPane().add(mainFrame.getInventoryPanel());
        mainFrame.getInventoryPanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();
    }//GEN-LAST:event_goBackToHomeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackToHomeBtn;
    private javax.swing.JLabel notificationLabel;
    // End of variables declaration//GEN-END:variables
}
