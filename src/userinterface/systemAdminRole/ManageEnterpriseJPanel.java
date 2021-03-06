/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminRole;

import javax.swing.JPanel;
import business.enterprise.Enterprise;
import business.network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import business.EcoSystem;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author PRANJAL
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MAnageEnterpriseJPanel
     */
    EcoSystem ecoSystem;
    JPanel userProcessContainer;

    ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        this.ecoSystem = ecoSystem;
        this.userProcessContainer = userProcessContainer;
        initComponents();

        populateTheEnterpriseTable();
        populateTheComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        comboBoxEnterpriseType = new javax.swing.JComboBox();
        comboBoxNetwork = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblManageEnterprise = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        lblEnterpriseType = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        tblEnterprise.setBackground(new java.awt.Color(99, 200, 242));
        tblEnterprise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network Name", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comboBoxEnterpriseType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEnterpriseTypeActionPerformed(evt);
            }
        });

        comboBoxNetwork.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNetworkActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(99, 200, 242));
        btnSubmit.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(99, 200, 242));
        btnDelete.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(99, 200, 242));
        btnUpdate.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblManageEnterprise.setBackground(new java.awt.Color(254, 254, 254));
        lblManageEnterprise.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        lblManageEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageEnterprise.setText("Manage enterprise");

        lblNetwork.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNetwork.setText("Network");

        lblEnterpriseType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterpriseType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterpriseType.setText("Enterprise Type");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNetwork, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEnterpriseType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(btnSubmit)
                .addGap(34, 34, 34)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblManageEnterprise)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageEnterprise)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNetwork))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterpriseType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(436, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEnterpriseTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEnterpriseTypeActionPerformed

    private void comboBoxNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNetworkActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Network network = (Network) comboBoxNetwork.getSelectedItem();
//        System.out.println("check1 "+enterpriseTypeJComboBox.getSelectedItem().getClass().getName());
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboBoxEnterpriseType.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        int check = 0;
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Network name");
            check = 1;
        }
        if (check == 0) {
            String name = txtName.getText();

            Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

            populateTheEnterpriseTable();
            txtName.setText("");
            JOptionPane.showMessageDialog(null, "Congrats! You have now created " + comboBoxEnterpriseType.getSelectedItem() + " enterprise.");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();
        int selectedRow = tblEnterprise.getSelectedRow();
        if (selectedRow > 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String enterpriseName = (String) tblEnterprise.getValueAt(selectedRow, 0).toString();
                Network network = (Network) tblEnterprise.getValueAt(selectedRow, 1);
                String typeOfEnterprise = tblEnterprise.getValueAt(selectedRow, 2).toString();
                System.out.println("check2 "+Enterprise.EnterpriseType.valueOf(typeOfEnterprise) + " " + Enterprise.EnterpriseType.valueOf(typeOfEnterprise).getClass().getName());
                Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) Enterprise.EnterpriseType.valueOf(typeOfEnterprise);
                Enterprise enterprise = network.getEnterpriseDirectory().removeEnterprise(enterpriseName, type);
                populateTheEnterpriseTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a row");

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();
        int selectedRow = tblEnterprise.getSelectedRow();
        if (selectedRow >= 0) {
            String enterpriseName = (String) tblEnterprise.getValueAt(selectedRow, 0).toString();
            Network network = (Network) tblEnterprise.getValueAt(selectedRow, 1);
            String typeOfEnterprise = tblEnterprise.getValueAt(selectedRow, 2).toString();
            Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) Enterprise.EnterpriseType.valueOf(typeOfEnterprise);
            Enterprise selectedEnterprise = (Enterprise)tblEnterprise.getValueAt(selectedRow,0);
            network.updateEnterprise(selectedEnterprise, txtName.getText());
//            UpdateEnterpriseJFrame f = new UpdateEnterpriseJFrame(system, network,enterpriseName,type, this);
//            f.setLocationRelativeTo(null);
//            f.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox comboBoxEnterpriseType;
    private javax.swing.JComboBox comboBoxNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblManageEnterprise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    void populateTheEnterpriseTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Network network : ecoSystem.getListOfNetworks()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getListOfEnterprises()) {
                System.out.println("check5 "+enterprise.getEnterpriseType());
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network;
                row[2] = enterprise.getEnterpriseType();

                model.addRow(row);
            }
        }
    }
    
        private void populateTheComboBox() {
        comboBoxNetwork.removeAllItems();
        comboBoxEnterpriseType.removeAllItems();

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            comboBoxEnterpriseType.addItem(type);
        }
        
        for (int i=0; i<ecoSystem.getListOfNetworks().size(); i++) {
            comboBoxNetwork.addItem(ecoSystem.getListOfNetworks().get(i));
        }

    }
}
