/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemAdminRole;

import business.EcoSystem;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.roles.AdminRole;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRANJAL
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpeiseAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;

    ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        initComponents();
        populateTable();
        populateNetworkComboBox();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        lblNetwork = new javax.swing.JLabel();
        comboBoxNetwork = new javax.swing.JComboBox();
        comboBoxEnterpriseType = new javax.swing.JComboBox();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        comboBoxEnterprise = new javax.swing.JComboBox();
        lblEnterpriseType = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE ENTERPRISE ACCESS");

        tblEnterprise.setBackground(new java.awt.Color(99, 200, 242));
        tblEnterprise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network Name", "Username", "Enterprise Type", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEnterprise);

        lblNetwork.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNetwork.setText("Network");

        comboBoxNetwork.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNetworkActionPerformed(evt);
            }
        });

        comboBoxEnterpriseType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEnterpriseTypeActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDelete.setBackground(new java.awt.Color(99, 200, 242));
        btnDelete.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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

        comboBoxEnterprise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEnterpriseType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterpriseType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterpriseType.setText("Enterprise Type");

        lblEnterprise.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterprise.setText("Enterprise");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNetwork)
                    .addComponent(lblEnterpriseType)
                    .addComponent(lblEnterprise)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxEnterpriseType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnSubmit});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNetwork)
                            .addComponent(comboBoxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterpriseType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterprise))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnSubmit});

    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNetworkActionPerformed

        Network network = (Network) comboBoxNetwork.getSelectedItem();
        if (network != null) {
            populateEnterpriseTypeComboBox(network);
        }
    }//GEN-LAST:event_comboBoxNetworkActionPerformed

    private void comboBoxEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEnterpriseTypeActionPerformed
        // TODO add your handling code here:
        Network network = (Network) comboBoxNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboBoxEnterpriseType.getSelectedItem();
        if (type != null) {
            populateEnterpriseComboBox(type, network);
        }
    }//GEN-LAST:event_comboBoxEnterpriseTypeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();
        int selectedRow = tblEnterprise.getSelectedRow();

        //   UserAccountDirectory useraccountdirectory =
        if (selectedRow >= 0) {
            Enterprise enterprise = (Enterprise) tblEnterprise.getValueAt(selectedRow, 0);
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                UserAccount userAccount = (UserAccount) tblEnterprise.getValueAt(selectedRow, 2);
                enterprise.getUserAccountDirectory().removeUserAccount(userAccount);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");

        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Enterprise enterprise = (Enterprise) comboBoxEnterprise.getSelectedItem();

        int check = 0;
        if (txtUsername.getText().isEmpty() || txtPassword.getPassword().equals("") || txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields!");
            check = 1;
        }
        if (txtUsername.getText() == null || txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter user name!");
            check = 1;
        }
        if (txtPassword.getPassword() == null || txtPassword.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter password!");
            check = 1;
        }
        if (txtName.getText() == null || txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter name!");
            check = 1;
        }

        if (check == 0) {
            String username = txtUsername.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String name = txtName.getText();
            if (enterprise == null) {
                JOptionPane.showMessageDialog(null, "Enterprise cannot be empty");
            } else {
                Employee employee = enterprise.getEmployeeDirectory().createAndAddEmployee(name);
                UserAccount account = enterprise.getUserAccountDirectory().createAndAddUserAccount(username, password, employee, new AdminRole());
                populateTable();
                txtUsername.setText("");
                txtPassword.setText("");
                txtName.setText("");
                JOptionPane.showMessageDialog(null, "Congrats! You have now created " + comboBoxEnterprise.getSelectedItem() + " admin.");
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboBoxEnterprise;
    private javax.swing.JComboBox comboBoxEnterpriseType;
    private javax.swing.JComboBox comboBoxNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblEnterprise;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterprise.getModel();

        model.setRowCount(0);
        for (Network network : system.getListOfNetworks()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getListOfEnterprises()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getListOfUserAccounts()) {
                    Object[] row = new Object[5];
                    row[0] = enterprise;
                    row[1] = network;
                    row[2] = userAccount;
                    row[3] = enterprise.getEnterpriseType();
                    row[4] = userAccount.getPassword();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        comboBoxNetwork.removeAllItems();

        for (Network network : system.getListOfNetworks()) {
            comboBoxNetwork.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Enterprise.EnterpriseType type, Network network) {
        comboBoxEnterprise.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getListOfEnterprises()) {
            if (type.getValue().equals(enterprise.getEnterpriseType())) {
                comboBoxEnterprise.addItem(enterprise);
            }
        }
    }

    private void populateEnterpriseTypeComboBox(Network network) {
        comboBoxEnterpriseType.removeAllItems();

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            comboBoxEnterpriseType.addItem(type);
        }

    }
}
