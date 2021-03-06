/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.EcoSystem;
import business.userAccount.UserAccount;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author PRANJAL
 */
public class PersonalDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonalDetailsJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem eco;

    public PersonalDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem eco) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        initComponents();
        if (userAccount.getProfileImage() != null) {
            lblPersonProfileImage.setIcon(new ImageIcon(userAccount.getProfileImage()));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonProfileImage = new javax.swing.JLabel();
        btnUploadProfileImage = new javax.swing.JButton();
        lblPersonDemographics = new javax.swing.JLabel();
        btnSavePersonInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));

        lblPersonProfileImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnUploadProfileImage.setBackground(new java.awt.Color(99, 200, 242));
        btnUploadProfileImage.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnUploadProfileImage.setText("Upload Profile Image");
        btnUploadProfileImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadProfileImageActionPerformed(evt);
            }
        });

        lblPersonDemographics.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        lblPersonDemographics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPersonDemographics.setText("PERSON PROFILE IMAGE");

        btnSavePersonInfo.setBackground(new java.awt.Color(99, 200, 242));
        btnSavePersonInfo.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnSavePersonInfo.setText("Save Profile Image");
        btnSavePersonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePersonInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUploadProfileImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSavePersonInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addComponent(lblPersonProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblPersonDemographics, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersonDemographics)
                        .addGap(78, 78, 78)
                        .addComponent(btnUploadProfileImage)
                        .addGap(39, 39, 39)
                        .addComponent(btnSavePersonInfo)
                        .addGap(13, 13, 13))
                    .addComponent(lblPersonProfileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadProfileImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadProfileImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseDriverLicenseFile = new JFileChooser();

        //Filter image extensions
        FileNameExtensionFilter nameFilter = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseDriverLicenseFile.addChoosableFileFilter(nameFilter);
//        int showOpenDialogue = browseDriverLicenseFile.showOpenDialog(null);
        if (browseDriverLicenseFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedImage = browseDriverLicenseFile.getSelectedFile();
//            String selectedImagePath = selectedImage.getAbsolutePath();

            ImageIcon Ii = new ImageIcon(selectedImage.getAbsolutePath());
            //Resize image to fit jlabel
            Image image = Ii.getImage().getScaledInstance(lblPersonProfileImage.getWidth(), lblPersonProfileImage.getHeight(), Image.SCALE_SMOOTH);
            lblPersonProfileImage.setIcon(new ImageIcon(image));

            // construct the buffered image
            BufferedImage bImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D bImageGraphics = bImage.createGraphics();
            bImageGraphics.drawImage(image, null, null);
            RenderedImage rImage = (RenderedImage) bImage;
            try {
                ImageIO.write(rImage, "JPG", new File("./src/userProfilePictures/"+userAccount.getUsername() + "capture.jpg"));
            } catch (IOException ex) {
                Logger.getLogger(PersonalDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            String filename = "/userProfilePictures/" + userAccount.getUsername() + "capture.jpg";
            userAccount.setProfileImage(filename);
        }
    }//GEN-LAST:event_btnUploadProfileImageActionPerformed

    private void btnSavePersonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePersonInfoActionPerformed
        ImageIcon myIcon = (ImageIcon) lblPersonProfileImage.getIcon();
        if (myIcon == null) {
            JOptionPane.showMessageDialog(this, "Please upload image!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSavePersonInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePersonInfo;
    private javax.swing.JButton btnUploadProfileImage;
    private javax.swing.JLabel lblPersonDemographics;
    private javax.swing.JLabel lblPersonProfileImage;
    // End of variables declaration//GEN-END:variables
}
