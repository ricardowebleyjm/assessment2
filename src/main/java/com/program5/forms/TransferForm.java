/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.program5.forms;

import com.program5.entity.CheckingAccount;
import com.program5.entity.SavingAccount;
import com.program5.exceptions.InsufficientFundsException;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author WebleyR
 */
public class TransferForm extends javax.swing.JFrame {
    private SavingAccount saving;
    private CheckingAccount checking;
    /**
     * Creates new form TransferForm
     */
    public TransferForm() {
        initComponents();
    }
    public TransferForm(SavingAccount saving, CheckingAccount checking){
        this.saving = saving;
        this.checking = checking;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFromAccount = new javax.swing.ButtonGroup();
        buttonGroupToAccount = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        buttonTransfer = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        buttonFromAcctChecking = new javax.swing.JRadioButton();
        buttonFromAcctSavings = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtTransferAmt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonToAcctSavings = new javax.swing.JRadioButton();
        buttonToAcctChecking = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonTransfer.setBackground(new java.awt.Color(0, 255, 51));
        buttonTransfer.setText("TRANSFER");
        buttonTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTransferActionPerformed(evt);
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

        buttonGroupFromAccount.add(buttonFromAcctChecking);
        buttonFromAcctChecking.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonFromAcctChecking.setText(checking.getAccountType());

        buttonGroupFromAccount.add(buttonFromAcctSavings);
        buttonFromAcctSavings.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonFromAcctSavings.setText(saving.getAccountType());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Transfer Amount");

        txtTransferAmt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTransferAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransferAmtActionPerformed(evt);
            }
        });
        txtTransferAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTransferAmtKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("From Account");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("To Account");

        buttonGroupToAccount.add(buttonToAcctSavings);
        buttonToAcctSavings.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonToAcctSavings.setText(saving.getAccountType());
        buttonToAcctSavings.setActionCommand(saving.getAccountType());

        buttonGroupToAccount.add(buttonToAcctChecking);
        buttonToAcctChecking.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonToAcctChecking.setText(checking.getAccountType());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonTransfer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCancel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonFromAcctSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonFromAcctChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTransferAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonToAcctChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonToAcctSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTransferAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonFromAcctSavings)
                    .addComponent(buttonFromAcctChecking))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonToAcctSavings)
                    .addComponent(buttonToAcctChecking))
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void buttonTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTransferActionPerformed
        double transferAmt = Double.parseDouble(txtTransferAmt.getText());
        if(!txtTransferAmt.getText().isEmpty() || !txtTransferAmt.getText().isBlank()){
            
            if(buttonFromAcctSavings.isSelected() && buttonToAcctChecking.isSelected()){
                try {
                    saving.transfer(checking, transferAmt);
                    JOptionPane.showMessageDialog(rootPane,
                        "Success, your " + checking.getAccountType() + " account balance is: "  + checking.getBalance(),  "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                } catch (InsufficientFundsException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage(), 
                            "Insufficient Balance", JOptionPane.ERROR_MESSAGE);    
                }
            }
            else if(buttonFromAcctChecking.isSelected() && buttonToAcctSavings.isSelected()){
                try {
                    checking.transfer(saving, transferAmt);
                    JOptionPane.showMessageDialog(rootPane,
                        "Success, your " + saving.getAccountType() + " account balance is: "  + saving.getBalance(), "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (InsufficientFundsException ex) {
                        JOptionPane.showMessageDialog(rootPane, ex.getMessage(), 
                            "Insufficient Balance", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Incorrect Account Selection", 
                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonTransferActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void txtTransferAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransferAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransferAmtActionPerformed

    private void txtTransferAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTransferAmtKeyPressed
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)){
            txtTransferAmt.setEditable(true);
        }else{
            txtTransferAmt.setEditable(false);
        }
    }//GEN-LAST:event_txtTransferAmtKeyPressed

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
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JRadioButton buttonFromAcctChecking;
    private javax.swing.JRadioButton buttonFromAcctSavings;
    private javax.swing.ButtonGroup buttonGroupFromAccount;
    private javax.swing.ButtonGroup buttonGroupToAccount;
    private javax.swing.JRadioButton buttonToAcctChecking;
    private javax.swing.JRadioButton buttonToAcctSavings;
    private javax.swing.JButton buttonTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTransferAmt;
    // End of variables declaration//GEN-END:variables
}