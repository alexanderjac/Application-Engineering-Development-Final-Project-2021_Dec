/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.adminVolunteerRole;

import business.Organization;
import business.enterprise.Enterprise;
import business.organisation.OrganisationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRANJAL
 */
public class ManageHASOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHASOrganizationJPanel
     */
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private OrganisationDirectory directory;

    public ManageHASOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;

        populateTable();
        populateCombo();
    }

    private void populateCombo() {
        comboBoxOrganizationType.removeAllItems();
        //System.out.println(enterprise.getEnterpriseType() == EnterpriseType.Hospital);
        //System.out.println(enterprise.getEnterpriseType().equals("Hospital"));
        if ((enterprise.getEnterpriseType()).equalsIgnoreCase(Enterprise.EnterpriseType.Volunteer.getValue())) {
            for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                if ((type.getValue().equalsIgnoreCase(Organization.OrganizationType.HAS_Healthcare_Representative.getValue())) || (type.getValue().equalsIgnoreCase(Organization.OrganizationType.HAS_Shelter_Representative.getValue()))) {
                    comboBoxOrganizationType.addItem(type);
                }
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrganizations.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getListOfOrganizations()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationId();
            row[1] = organization;

            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizations = new javax.swing.JTable();
        comboBoxOrganizationType = new javax.swing.JComboBox();
        lblOrganizationType = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 254, 254));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MANAGE ORGANIZATIONS UNDER VOLUNTEER ENTERP.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 1, 24))); // NOI18N

        tblOrganizations.setBackground(new java.awt.Color(99, 200, 242));
        tblOrganizations.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblOrganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization ID", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganizations);

        comboBoxOrganizationType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxOrganizationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxOrganizationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrganizationTypeActionPerformed(evt);
            }
        });

        lblOrganizationType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrganizationType.setText("Organization Type");

        btnAdd.setBackground(new java.awt.Color(99, 200, 242));
        btnAdd.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnAdd.setText("ADD ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrganizationType)
                                .addGap(32, 32, 32)
                                .addComponent(comboBoxOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDelete)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(188, 188, 188)))
                        .addContainerGap(155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(109, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrganizationType))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(162, 162, 162))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnDelete});

    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxOrganizationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrganizationTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxOrganizationTypeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Organization.OrganizationType type =  (Organization.OrganizationType) comboBoxOrganizationType.getSelectedItem();
        enterprise.getOrganizationDirectory().createAndAddOrganization(type);
        populateTable();
        JOptionPane.showMessageDialog(null, "An Organization has beesn added successfully");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblOrganizations.getModel();
        int selectedRow = tblOrganizations.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                Organization organization = (Organization) tblOrganizations.getValueAt(selectedRow, 1);
                enterprise.getOrganizationDirectory().removeOrganization(organization);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboBoxOrganizationType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JTable tblOrganizations;
    // End of variables declaration//GEN-END:variables
}