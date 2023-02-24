/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.program5.forms;

import com.program5.entity.CheckingAccount;
import com.program5.entity.SavingAccount;
import com.program5.exceptions.InsufficientFundsException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author WebleyR
 */
public class WithdrawForm extends javax.swing.JFrame {
    private SavingAccount saving;
    private CheckingAccount checking;
    /**
     * Creates new form WithdrawFrom
     */
    public WithdrawForm() {
        initComponents();
    }
    public WithdrawForm(SavingAccount saving, CheckingAccount checking){
       initComponents();
       this.saving = saving;
       this.checking = checking;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrawButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        buttonWithdraw = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonChecking = new javax.swing.JRadioButton();
        buttonSavings = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtWithdrawAmt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Withdraw Form");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonWithdraw.setBackground(new java.awt.Color(0, 255, 51));
        buttonWithdraw.setText("WITHDRAW");
        buttonWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWithdrawActionPerformed(evt);
            }
        });

        buttonCancel.setBackground(new java.awt.Color(255, 0, 0));
        buttonCancel.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancel.setText("CANCEL");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        withdrawButtonGroup.add(buttonChecking);
        buttonChecking.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonChecking.setText("Checking");

        withdrawButtonGroup.add(buttonSavings);
        buttonSavings.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonSavings.setText("Savings");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Amount");

        txtWithdrawAmt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtWithdrawAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWithdrawAmtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonWithdraw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(txtWithdrawAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 76, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWithdrawAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(buttonSavings)
                .addGap(18, 18, 18)
                .addComponent(buttonChecking)
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWithdrawActionPerformed
        if(buttonSavings.isSelected() || buttonChecking.isSelected()){
            if(!txtWithdrawAmt.getText().isEmpty() || !txtWithdrawAmt.getText().isBlank() ){
                double withdrawAmt = Double.parseDouble(txtWithdrawAmt.getText());
                if(buttonSavings.isSelected()){
                    try {
                        saving.withdraw(withdrawAmt);
                        JOptionPane.showMessageDialog(rootPane,
                                "Success, your current balance is: "  + saving.getBalance());
                    } catch (InsufficientFundsException ex) {            
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Insufficient Balance", JOptionPane.ERROR_MESSAGE);
                    }
                }else if(buttonChecking.isSelected()){
                    try {
                        checking.withdraw(withdrawAmt);
                        JOptionPane.showMessageDialog(rootPane,
                                "Success, your current balance is: "  + checking.getBalance());
                    } catch (InsufficientFundsException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Insufficient Balance", JOptionPane.ERROR_MESSAGE);
                    }
                }
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please select an account");
        }

    }//GEN-LAST:event_buttonWithdrawActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void txtWithdrawAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWithdrawAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWithdrawAmtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WithdrawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JRadioButton buttonChecking;
    private javax.swing.JRadioButton buttonSavings;
    private javax.swing.JButton buttonWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtWithdrawAmt;
    private javax.swing.ButtonGroup withdrawButtonGroup;
    // End of variables declaration//GEN-END:variables
}