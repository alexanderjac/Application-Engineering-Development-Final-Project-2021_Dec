/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HASEmployeeRole;

import business.network.Network;
import business.Organization;
import business.enterprise.Enterprise;
import business.workQueue.WorkRequest;
import static java.awt.image.ImageObserver.PROPERTIES;
import business.organisation.HasHealthcareRepresentativeOrganisation;
import business.organisation.ReceptionistOrganisation;
import business.roles.AdminRole;
import business.roles.Role;
import business.EcoSystem;
import javax.swing.table.DefaultTableModel;

import business.userAccount.UserAccount;
import business.workQueue.PatientTestRequest;
import javax.swing.JPanel;

import java.util.Optional;
import javax.swing.JOptionPane;

/**
 *
 * @author PRANJAL
 */
public class HASEmployeeWorkStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HAsEmployeeWorkStatusJPanel
     */
    
    HasHealthcareRepresentativeOrganisation organization;
    Enterprise enterprise;
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem business;

    public HASEmployeeWorkStatusJPanel(JPanel userProcessContainer, UserAccount account, HasHealthcareRepresentativeOrganisation organization, Enterprise enterprise, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.organization = organization;
        this.business = business;
        initComponents();
        populateTable();
        populateJComboBox();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getListOfWorkRequests()) {
            if ((request.getStatus().equals("Awaiting hospital For initial checkup")) || (request.getStatus().equals("Pending hospital assignment"))) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getPatientFirstName();
                row[2] = request.getPatientSymptoms();
                row[3] = request.getPatientDiagnosis();
                row[4] = userAccount.getUsername();
                row[5] = request.getStatus();
                model.addRow(row);
            }
        }
    }

    public void populateJComboBox() {
        comboboxNetworkHospital.removeAllItems();
        for (Network network : business.getListOfNetworks()) {
            for (Enterprise enter : network.getEnterpriseDirectory().getListOfEnterprises()) {
                if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital.getValue())) {
                    comboboxNetworkHospital.addItem(enter);
                }
            }
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

        comboboxNetworkHospital = new javax.swing.JComboBox();
        btnAssignHostpital = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(254, 254, 254));

        comboboxNetworkHospital.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboboxNetworkHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxNetworkHospitalActionPerformed(evt);
            }
        });

        btnAssignHostpital.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnAssignHostpital.setText("ASSIGN TO HOSPITAL");
        btnAssignHostpital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignHostpitalActionPerformed(evt);
            }
        });

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Name", "Symptoms", "Diagonsis", "Assigned to", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnAssignHostpital)
                .addGap(18, 18, 18)
                .addComponent(comboboxNetworkHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboboxNetworkHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssignHostpital))
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxNetworkHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxNetworkHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxNetworkHospitalActionPerformed

    private void btnAssignHostpitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignHostpitalActionPerformed
        // TODO add your handling code here:
        Enterprise ent = (Enterprise) comboboxNetworkHospital.getSelectedItem();
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equals("Awaiting initial checkup reports")) {
            JOptionPane.showMessageDialog(null, "Patient Already Added");
            return;
        }
        if (ent.enterpriseType.equalsIgnoreCase(Enterprise.EnterpriseType.Hospital.getValue())) {
            for (UserAccount userAcc : ent.getUserAccountDirectory().getListOfUserAccounts()) {
                if (userAcc.getRole() instanceof AdminRole) {
                    request.setTypeOfRequest("InitialCheckupRequest");
                    request.setStatus("Awaiting initial checkup reports");
                    request.setReceiver(userAcc);
                    ((UserAccount) userAcc).getWorkQueue().getListOfWorkRequests().add(request);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Assigned to the Hospital, pending initial checkup");
        populateTable();
        populateJComboBox();

    }//GEN-LAST:event_btnAssignHostpitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignHostpital;
    private javax.swing.JComboBox comboboxNetworkHospital;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}