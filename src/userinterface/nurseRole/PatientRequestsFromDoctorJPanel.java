/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.nurseRole;

import business.EcoSystem;
import business.Organization;
import business.enterprise.Enterprise;
import business.organisation.NurseOrganisation;
import business.userAccount.UserAccount;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRANJAL
 */
public class PatientRequestsFromDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PAtientRequestsFromDoctorJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private NurseOrganisation nurseOrganisation;
    private Enterprise enterprise;

    int count = 0;
    JSplitPane jSplitPane2;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PatientRequestsFromDoctorJPanel(JPanel userProcessContainer, UserAccount account, Organization organisation, Enterprise enterprise, EcoSystem business, JSplitPane jSplitPane2) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.nurseOrganisation = (NurseOrganisation) organisation;
        this.enterprise = enterprise;
        this.jSplitPane2 = jSplitPane2;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : nurseOrganisation.getWorkQueue().getListOfWorkRequests()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getMessage();
            row[2] = request.getSender().getEmp().getEmployeeName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmp().getEmployeeName();
            row[4] = request.getStatus();
            row[5] = request.getNurseStatus();
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Message", "Sender", "Receiver", "Status", "NurseStatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setBackground(new java.awt.Color(99, 200, 242));
        assignJButton.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        assignJButton.setText("ASSIGN TO ME");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(99, 200, 242));
        processJButton.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        processJButton.setText("PROCESS");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(99, 200, 242));
        refreshJButton.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(99, 200, 242));
        backJButton.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setText("NURSE WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton))
                .addGap(64, 64, 64))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 148, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 61, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(processJButton)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 169, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(assignJButton)
                    .addGap(11, 11, 11)
                    .addComponent(backJButton)
                    .addGap(0, 122, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        if (count == 0) {
            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            count++;
            request.setReceiver(userAccount);
            request.setNurseStatus("Pending");
            populateTable();
            JOptionPane.showMessageDialog(null, "Assigned");

        } else {
            JOptionPane.showMessageDialog(null, "Cannot Assign More Than One Patient");
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if ((request.getNurseStatus() == null && (request.getReceiver() == null))) {
            JOptionPane.showMessageDialog(null, "Please Assign a Patient");
        } else if ((request.getNurseStatus().equals("Pending")) && (request.getReceiver().equals(userAccount))) {
            request.setNurseStatus("Processing");
            count = 0;
            NursePatientTreatmentJPanel nurseTreatmentJPanel = new NursePatientTreatmentJPanel(userProcessContainer, userAccount, request, enterprise, this, jSplitPane2);
//            userProcessContainer.add("NurseTreatmentJPanel", nurseTreatmentJPanel);
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
            jSplitPane2.setRightComponent(nurseTreatmentJPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Patient Is Under Processing Of Another Nurse");
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}