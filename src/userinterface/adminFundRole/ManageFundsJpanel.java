/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.adminFundRole;

import business.EcoSystem;
import business.Organization;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organisation.FundRaiserOrganisation;
import business.organisation.HasHealthcareRepresentativeOrganisation;
import business.roles.CorporateRole;
import business.roles.Role;
import business.userAccount.UserAccount;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PRANJAL
 */
public class ManageFundsJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFundsJpanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    Network network;
    EcoSystem system;
    FundRaiserOrganisation organization;
    public ManageFundsJpanel(JPanel userProcessContainer, UserAccount account, FundRaiserOrganisation organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = business;
        this.organization = organization;
        populateRequestTable();
        populateApproveTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDonarList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donar Name", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblWorkRequest);

        btnApprove.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(62, 84, 147));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnDecline.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        btnDecline.setForeground(new java.awt.Color(62, 84, 147));
        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        tblDonarList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donar's Name", "Role", "Status"
            }
        ));
        jScrollPane3.setViewportView(tblDonarList);

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 76, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Donar's Request ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnApprove)
                        .addGap(51, 51, 51)
                        .addComponent(btnDecline))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnDecline))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
       int row = tblWorkRequest.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) tblWorkRequest.getValueAt(row, 0);
        if(enterprise.getOrganizationDirectory().getListOfOrganizations().size() == 0){
            Organization org = enterprise.getOrganizationDirectory().createAndAddOrganization(Organization.OrganizationType.Fundrasier);
            Employee employee = org.getEmployeeDirectory().createAndAddEmployee(request.getName());
                UserAccount account = org.getUserAccountDirectory().createAndAddUserAccount(request.getUsername(), request.getPassword(), employee, new CorporateRole());
                request.setStatus("Approved");
        } else {
             for (Organization organization : enterprise.getOrganizationDirectory().getListOfOrganizations()) {
                if(organization.getOrganizationType().equalsIgnoreCase("Fundraiser Organization")){
                    Employee employee = organization.getEmployeeDirectory().createAndAddEmployee(request.getName());
                    UserAccount account = organization.getUserAccountDirectory().createAndAddUserAccount(request.getUsername(), request.getPassword(), employee, new CorporateRole());
                    request.setStatus("Approved");
                    break;
                }
            }
        }
        populateRequestTable();
        populateApproveTable();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:
        int row = tblWorkRequest.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest selectedItem = (WorkRequest) tblWorkRequest.getValueAt(row, 0);
        selectedItem.setStatus("Declined");
        populateRequestTable();
    }//GEN-LAST:event_btnDeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDecline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDonarList;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getListOfWorkRequests()) {
            if (request.getStatus().equals("Pending")) {
                Object[] row = new Object[3];
                row[0] = request;
                row[1] = request.getRole();
                row[2] = request.getStatus();
                model.addRow(row);
            }
        }
    }

    private void populateApproveTable() {
                DefaultTableModel model1 = (DefaultTableModel) tblDonarList.getModel();

        model1.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getListOfWorkRequests()) {
            if (request.getStatus().equals("Approved")) {
                Object[] row = new Object[3];
                row[0] = request;
                row[1] = request.getRole();
                row[2] = request.getStatus();
                model1.addRow(row);
            }
        }
    }
}