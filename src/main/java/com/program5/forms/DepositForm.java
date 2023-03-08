/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.program5.forms;

import com.program5.entity.CheckingAccount;
import com.program5.entity.SavingAccount;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


/**
 *
 * @author WebleyR
 */
public class DepositForm extends javax.swing.JFrame {

    private SavingAccount saving;
    private CheckingAccount checking;
   
    
    public DepositForm() {
        initComponents();
    }

    /**
     * @param saving
     * @param checking
     */
    public DepositForm(SavingAccount saving, CheckingAccount checking){
        // Initialize the components of the window.
        initComponents();

       // Set the instance variables to the provided SavingAccount and CheckingAccount.
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

        depositTypeButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDepositAmt = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonDeposit = new javax.swing.JButton();
        buttonSavings = new javax.swing.JRadioButton();
        buttonChecking = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deposit Form");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Amount");

        txtDepositAmt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDepositAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositAmtActionPerformed(evt);
            }
        });
        txtDepositAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepositAmtKeyPressed(evt);
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

        buttonDeposit.setBackground(new java.awt.Color(0, 255, 51));
        buttonDeposit.setText("DEPOSIT");
        buttonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDepositActionPerformed(evt);
            }
        });

        depositTypeButtonGroup.add(buttonSavings);
        buttonSavings.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonSavings.setText("Savings");

        depositTypeButtonGroup.add(buttonChecking);
        buttonChecking.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonChecking.setText("Checking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonDeposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(txtDepositAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtDepositAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(buttonSavings)
                .addGap(18, 18, 18)
                .addComponent(buttonChecking)
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void txtDepositAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepositAmtActionPerformed

    private void buttonDepositActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // check which buttons are selected
        if(buttonSavings.isSelected() || buttonChecking.isSelected()){
        // verify if the deposit input is blank or empty
        if(!txtDepositAmt.getText().isEmpty() || !txtDepositAmt.getText().isBlank() ){

            // parse the amount in the deposit input and save the value into depositAmount
            double depositAmount = Double.parseDouble(txtDepositAmt.getText());

            // deposit the amount to the saving account if the saving button is selected
            if(buttonSavings.isSelected()){
           saving.deposit(depositAmount);

           // Show a success message if the transaction was successful
           JOptionPane.showMessageDialog(rootPane,
                   "Success, your current balance is: "  + saving.getBalance());
       }else if(buttonChecking.isSelected()){
           // deposit the amount to the checking account if the checking button is selected
           checking.deposit(depositAmount);

           // Show a success message if the transaction was successful
           JOptionPane.showMessageDialog(rootPane,
                   "Success, your current balance is: "  + checking.getBalance());
       }
        // close the form after the transaction is completed
        this.dispose();
       }
        }else{
            // prompts the use to select an account in no account was selected
            JOptionPane.showMessageDialog(rootPane, "Please select an account");
        }

    }

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {
        // close the form
        this.dispose(); 
    }

    
    private void txtDepositAmtKeyPressed(java.awt.event.KeyEvent evt) {
        // restricting the characters that can typed in the deposit amount box
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE ) 
                || (evt.getKeyChar() == KeyEvent.VK_PERIOD))
        {
            // allow the deposit amount box at accept valid character
            txtDepositAmt.setEditable(true);
        }else{
            // disable the deposit amount box if an invalid character is typed.
             txtDepositAmt.setEditable(false);
        }
    }

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
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // creates a new instance of the DepositForm
                var depositForm = new DepositForm();
                depositForm.setLocationRelativeTo(null);
                depositForm.setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JRadioButton buttonChecking;
    private javax.swing.JButton buttonDeposit;
    private javax.swing.JRadioButton buttonSavings;
    private javax.swing.ButtonGroup depositTypeButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDepositAmt;
    // End of variables declaration//GEN-END:variables
}
