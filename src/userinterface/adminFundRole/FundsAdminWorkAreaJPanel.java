/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.adminFundRole;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.enterprise.FundEnterprise;
import business.network.Network;
import business.organisation.FundRaiserOrganisation;
import business.userAccount.UserAccount;
import business.workQueue.SponsorApprovalStatus;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import userinterface.HomeLoginJPanel;
import userinterface.MainJFrame;
import userinterface.PersonalDetailsJPanel;

/**
 *
 * @author PRANJAL
 */
public class FundsAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FundsAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    Network network;
    EcoSystem system;
    FundRaiserOrganisation organization;
    public FundsAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FundRaiserOrganisation organization, Enterprise enterprise, Network network, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = business;
        this.organization = organization;
        initComponents();
        
        if(userAccount.getProfileImage() == null)
            userAccount.setProfileImage("/userProfilePictures/default_profile_picture.jpg");
        setProfilePicture();
        this.lblPersonName.setText(userAccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        btnAboutUs1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnManageEnterpriseAdmins2 = new javax.swing.JButton();
        btnUpdateProfile = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(1822, 439));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 76, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fund Admin ");

        lblPersonName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblPersonName.setText("test name");

        btnAboutUs1.setBackground(new java.awt.Color(254, 254, 254));
        btnAboutUs1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnAboutUs1.setForeground(new java.awt.Color(200, 35, 24));
        btnAboutUs1.setText("Logout");
        btnAboutUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUs1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jButton1.setText("Fund Transfer Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jButton2.setText("Manage Donars Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmins2.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnManageEnterpriseAdmins2.setText("Statistics");
        btnManageEnterpriseAdmins2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdmins2ActionPerformed(evt);
            }
        });

        btnUpdateProfile.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnUpdateProfile.setText("Update Profile");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jButton3.setText(" Volunteer Alert Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnManageEnterpriseAdmins2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAboutUs1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnUpdateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblPersonName)))
                .addGap(18, 18, 18)
                .addComponent(btnAboutUs1)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageEnterpriseAdmins2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateProfile)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEnterpriseAdmins2, btnUpdateProfile, jButton1, jButton2});

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1547, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jSplitPane1)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FundTransferRequestJpanel fundPanel = new FundTransferRequestJpanel(userProcessContainer,userAccount, organization,(FundEnterprise)enterprise,network, system);
        jSplitPane1.setRightComponent(fundPanel);
//        userProcessContainer.add("FundTransferRequestJpanel", fundPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ManageFundsJpanel fundPanel = new ManageFundsJpanel(userProcessContainer,userAccount, organization, enterprise,network, system);
        jSplitPane1.setRightComponent(fundPanel);
//        userProcessContainer.add("ManageFundsJpanel", fundPanel);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnManageEnterpriseAdmins2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdmins2ActionPerformed
        // TODO add your handling code here:
        int approvedReqCount = 0;
        int pendingReqCount = 0;
        //        JPanel jPanel1 = new JPanel();
        //        jPanel1.setLayout(new java.awt.BorderLayout());
        for (WorkRequest workReq : userAccount.getWorkQueue().getListOfWorkRequests()) {
            if (workReq.getStatus().equalsIgnoreCase("Pending payment")) {
                pendingReqCount++;
            } else if (workReq.getStatus().equalsIgnoreCase("Funds Processed")) {
                approvedReqCount++;
            }
        }
        DefaultPieDataset pieDateSet = new DefaultPieDataset();
        pieDateSet.setValue("Funds Requested Pending", pendingReqCount);
        pieDateSet.setValue("Funds Approved", approvedReqCount);
        JFreeChart pieChart = ChartFactory.createPieChart("Pie chart", pieDateSet);
        PiePlot p = (PiePlot) pieChart.getPlot();

        ChartFrame frame = new ChartFrame("Pie Chart", pieChart);
        frame.setVisible(true);
        frame.setSize(550,500);
    }//GEN-LAST:event_btnManageEnterpriseAdmins2ActionPerformed

    private void btnAboutUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUs1ActionPerformed
        // TODO add your handling code here:
         HomeLoginJPanel fundPanel = new HomeLoginJPanel(userProcessContainer,system);
        userProcessContainer.add("HomeLoginJPanel", fundPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.logout(system);
    }//GEN-LAST:event_btnAboutUs1ActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        // TODO add your handling code here:
        PersonalDetailsJPanel requestPanel = new PersonalDetailsJPanel(userProcessContainer, userAccount, system);
        jSplitPane1.setRightComponent(requestPanel);
    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VolunteerAlertJPanel requestPanel = new VolunteerAlertJPanel(userProcessContainer, userAccount,organization, enterprise,network, system);
        jSplitPane1.setRightComponent(requestPanel);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void setProfilePicture() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("./src" + userAccount.getProfileImage()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(70, 70,
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        lblPicture.setIcon(imageIcon);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs1;
    private javax.swing.JButton btnManageEnterpriseAdmins2;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblPicture;
    // End of variables declaration//GEN-END:variables
}