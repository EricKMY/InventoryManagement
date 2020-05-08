/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.ui;

import domain.controller.Controller;
import domain.labMember.LabMember;
import domain.labMember.LabMemberList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author bozhi
 */
public class LoginPanel extends javax.swing.JPanel {
    private MainFrame mainFrame;
    private Controller controller;
    private LabMemberList labMemberList;
    protected LabMember labMember;
    
    /**
     * Creates new form LoginPanel
     */
    public LoginPanel(MainFrame mainFrame, Controller controller, LabMemberList labMemberList) {
        this.mainFrame = mainFrame;
        this.controller = controller;
        this.labMemberList = labMemberList;
        this.setBounds(0, 0, 800, 600);
        initComponents();
        this.setVisible(false);
        Icon loginIcon = new ImageIcon(this.getClass().getResource("images/login.png"));
        loginBtn.setIcon(loginIcon);
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
        userNameLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 40)); // NOI18N
        titleLabel.setText("Lab Inventory System");

        userNameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        userNameLabel.setText("UserName:  ");

        userNameField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        userNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameFieldKeyPressed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        passwordLabel.setText("Password:  ");

        loginBtn.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginBtnKeyPressed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(titleLabel)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void loginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnKeyPressed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void userNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_userNameFieldKeyPressed

    private void login() {
        Icon icon = new ImageIcon(this.getClass().getResource("images/loginError.png"));
        for(Object key: labMemberList.getLabMemberMap().keySet()) {
            if(labMemberList.getLabMemberMap().get(key).getName().equals(userNameField.getText())
                    && labMemberList.getLabMemberMap().get(key).getPassword().equals(String.valueOf(passwordField.getPassword()))) {
                labMember = labMemberList.getLabMemberMap().get(key);
            }
        }
        if(userNameField.getText().equals("") || String.valueOf(passwordField.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null, "Username or password can not empty.", "Error",JOptionPane.ERROR_MESSAGE, icon);
            return;
        }
        
        if(labMember == null){
            JOptionPane.showMessageDialog(null, "Username or password enters error.", "Error",JOptionPane.ERROR_MESSAGE, icon);
            userNameField.setText("");
            passwordField.setText("");
            return;
        }
        mainFrame.getContentPane().remove(mainFrame.getLoginPanel());
        mainFrame.getContentPane().add(mainFrame.getHomePanel());
        mainFrame.getHomePanel().setVisible(true);
        mainFrame.revalidate();
        mainFrame.repaint();

        mainFrame.getHomePanel().setLabMember(labMember);
        mainFrame.getInventoryPanel().setLabMember(labMember);
        mainFrame.getSettingPanel().setLabMember(labMember);
        userNameField.setText("");
        passwordField.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
