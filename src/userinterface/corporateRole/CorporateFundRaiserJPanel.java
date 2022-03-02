/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.corporateRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.enterprise.FundEnterprise;
import business.network.Network;
import business.organisation.FundRaiserOrganisation;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.HomeLoginJPanel;

/**
 *
 * @author PRANJAL
 */
public class CorporateFundRaiserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CorporateFundRaiserJPanel
     */
    JPanel userProcessContainer;
    FundEnterprise enterprise;
    UserAccount userAccount;
    Network network;
    EcoSystem system;
    FundRaiserOrganisation organization;
    public CorporateFundRaiserJPanel(JPanel userProcessContainer, UserAccount account, FundRaiserOrganisation organization, FundEnterprise enterprise, Network network, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = business;
        this.organization = organization;
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRaiseFund = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtmoney = new javax.swing.JTextField();
        btnAboutUs1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 76, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donate Fund Login");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRaiseFund.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnRaiseFund.setForeground(new java.awt.Color(114, 129, 161));
        btnRaiseFund.setText("Raise fund");
        btnRaiseFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseFundActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 108, 139));
        jLabel2.setText("Enter Amount to Donate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnRaiseFund)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnRaiseFund)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnAboutUs1.setBackground(new java.awt.Color(254, 254, 254));
        btnAboutUs1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAboutUs1.setForeground(new java.awt.Color(200, 35, 24));
        btnAboutUs1.setText("Logout");
        btnAboutUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUs1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAboutUs1)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAboutUs1))
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRaiseFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseFundActionPerformed
        // TODO add your handling code here:
        try{
                    enterprise.setFundsCollected(Integer.parseInt(txtmoney.getText()));
                    System.out.println(enterprise.getFundsCollected());
                    JOptionPane.showMessageDialog(null, "You have donated " +txtmoney.getText()+ "$. Thank you for your valuable contribution! " +"\n"+" Funds Sent to System Admin for Assigning Hospital!");
                }catch(NumberFormatException ex){
                  //   System.out.println(e.getFundsCollected());
                     JOptionPane.showMessageDialog(null, "Please Enter The Amount you want to donate in digits");
                }
    }//GEN-LAST:event_btnRaiseFundActionPerformed

    private void btnAboutUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUs1ActionPerformed
        // TODO add your handling code here:
        HomeLoginJPanel fundPanel = new HomeLoginJPanel(userProcessContainer,system);
        userProcessContainer.add("HomeLoginJPanel", fundPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAboutUs1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs1;
    private javax.swing.JButton btnRaiseFund;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtmoney;
    // End of variables declaration//GEN-END:variables
}
