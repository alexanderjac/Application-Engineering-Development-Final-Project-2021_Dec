/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.labAssistantRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organisation.LabOrganisation;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import userinterface.HomeLoginJPanel;
import userinterface.MainJFrame;
import userinterface.PersonalDetailsJPanel;

/**
 *
 * @author PRANJAL
 */
public class LabAssistantHomePage extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantHomePage
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganisation labOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantHomePage(JPanel userProcessContainer, UserAccount account, LabOrganisation organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (LabOrganisation) organization;
        this.enterprise = enterprise;
        if (account.getProfileImage() == null) {
            account.setProfileImage("/userProfilePictures/default_profile_picture.jpg");
        }
        setProfilePicture();
        lblPersonName.setText(account.getUsername());
        lblEnterpriseName.setText(enterprise.getOrganizationName());
    }

    private void setProfilePicture() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("./src" + userAccount.getProfileImage()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblPicture.setIcon(imageIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        lblEcosystemName = new javax.swing.JLabel();
        btnAboutUs2 = new javax.swing.JButton();
        lblEnterpriseName = new javax.swing.JLabel();
        btnUpdateProfile = new javax.swing.JButton();
        btnHAAPatientReq = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jPanel4.setBackground(new java.awt.Color(99, 200, 242));

        lblPersonName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblPersonName.setText("test name");

        lblEcosystemName.setBackground(new java.awt.Color(254, 254, 254));
        lblEcosystemName.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblEcosystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEcosystemName.setText("LAB ASSISTANT");

        btnAboutUs2.setBackground(new java.awt.Color(254, 254, 254));
        btnAboutUs2.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnAboutUs2.setForeground(new java.awt.Color(200, 35, 24));
        btnAboutUs2.setText("Logout");
        btnAboutUs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUs2ActionPerformed(evt);
            }
        });

        lblEnterpriseName.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblEnterpriseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnUpdateProfile.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnUpdateProfile.setText("UPDATE PROFILE");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        btnHAAPatientReq.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnHAAPatientReq.setText("LAB TEST REQUESTS");
        btnHAAPatientReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAAPatientReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAboutUs2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEcosystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHAAPatientReq, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHAAPatientReq, btnUpdateProfile});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblEcosystemName)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblPersonName)))
                .addGap(10, 10, 10)
                .addComponent(btnAboutUs2)
                .addGap(18, 18, 18)
                .addComponent(btnHAAPatientReq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateProfile)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnHAAPatientReq, btnUpdateProfile});

        jSplitPane2.setLeftComponent(jPanel4);

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));
        jPanel5.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutUs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUs2ActionPerformed
        // TODO add your handling code here:
        HomeLoginJPanel fundPanel = new HomeLoginJPanel(userProcessContainer, business);
        userProcessContainer.add("HomeJPanel", fundPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.logout(business);
    }//GEN-LAST:event_btnAboutUs2ActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        PersonalDetailsJPanel requestPanel = new PersonalDetailsJPanel(userProcessContainer, userAccount, business);
        jSplitPane2.setRightComponent(requestPanel);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnHAAPatientReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHAAPatientReqActionPerformed
        // TODO add your handling code here:
        //        HASPatientRequestsJPanel requestPanel = new HASPatientRequestsJPanel(userProcessContainer, userAccount, organization, enterprise, eco);
        //        userProcessContainer.add("hASPatientRequestsJPanel", requestPanel);
        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.next(userProcessContainer);

        LabAssistantWorkAreaJPanel requestPanel = new LabAssistantWorkAreaJPanel(userProcessContainer, userAccount, labOrganization, business, enterprise, jSplitPane2 );
        jSplitPane2.setRightComponent(requestPanel);
    }//GEN-LAST:event_btnHAAPatientReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs2;
    private javax.swing.JButton btnHAAPatientReq;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel lblEcosystemName;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPicture;
    // End of variables declaration//GEN-END:variables
}
