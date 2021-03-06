/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.adminVolunteerRole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import business.workQueue.PatientTestRequest;
import business.workQueue.ShelterRequest;
import business.workQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author PRANJAL
 */
public class HASStatisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HASStatisticsJPanel
     */
    private Enterprise enterprise;
    private JPanel userProcessContainer;
//    private OrganizationDirectory directory;
    UserAccount userAccount;
    Network network;
    EcoSystem system;

    HASStatisticsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Network network, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.system = system;
        initComponents();

//        loadRequestTypeStatistics();
//        loadBarChartData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnTtlReqStats = new javax.swing.JButton();
        btnTtlReqStats1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(254, 254, 254));

        btnTtlReqStats.setBackground(new java.awt.Color(99, 200, 242));
        btnTtlReqStats.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnTtlReqStats.setText("PIE CHART: Total requests");
        btnTtlReqStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTtlReqStatsActionPerformed(evt);
            }
        });

        btnTtlReqStats1.setBackground(new java.awt.Color(99, 200, 242));
        btnTtlReqStats1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        btnTtlReqStats1.setText("PIE CHART: Completed request Statistics");
        btnTtlReqStats1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTtlReqStats1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTtlReqStats1)
                    .addComponent(btnTtlReqStats))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnTtlReqStats1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTtlReqStats)
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTtlReqStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTtlReqStatsActionPerformed
        loadRequestTypeStatistics();
    }//GEN-LAST:event_btnTtlReqStatsActionPerformed

    private void btnTtlReqStats1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTtlReqStats1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTtlReqStats1ActionPerformed

    private void loadRequestTypeStatistics() {
        int treatementReqCount = 0;
        int shelterReqCount = 0;
//        JPanel jPanel1 = new JPanel();
//        jPanel1.setLayout(new java.awt.BorderLayout());
        for (WorkRequest workReq : userAccount.getWorkQueue().getListOfWorkRequests()) {
            if (workReq instanceof PatientTestRequest) {
                treatementReqCount++;
            } else if (workReq instanceof ShelterRequest) {
                shelterReqCount++;
            }
        }
        DefaultPieDataset pieDateSet = new DefaultPieDataset();
        pieDateSet.setValue("Treatement Requests", treatementReqCount);
        pieDateSet.setValue("Shelter Requests", shelterReqCount);
        JFreeChart pieChart = ChartFactory.createPieChart("Pie chart", pieDateSet);
        PiePlot p = (PiePlot) pieChart.getPlot();
//        ChartPanel CP = new ChartPanel(pieChart);
//        frame.setVisible(true);
//        frame.setSize(450,500);
//        statJPanel.add(CP, BorderLayout.CENTER);
//        statJPanel.validate();

//        ChartPanel chPanel = new ChartPanel(pieChart); //creating the chart panel, which extends JPanel
//        chPanel.setPreferredSize(new Dimension(785, 440)); //size according to my window
//        chPanel.setMouseWheelEnabled(true);
//        statJPanel.removeAll();
//        statJPanel.add(chPanel, BorderLayout.CENTER);
//        statJPanel.validate();

ChartFrame frame = new ChartFrame("Pie Chart", pieChart);
        frame.setVisible(true);
        frame.setSize(450,500);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTtlReqStats;
    private javax.swing.JButton btnTtlReqStats1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    private void loadBarChartData() {
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(20000, "Contr amt", "JAn");
        barChartData.setValue(30000, "Contr amt", "Feb");
        barChartData.setValue(10000, "Contr amt", "Mar");
        JFreeChart barChart = ChartFactory.createBarChart("church Contribution", "Montly", "Contribution Amount", barChartData, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel barPanel = new ChartPanel(barChart);
//        statJPanel.removeAll();
//        statJPanel.add(barPanel, BorderLayout.CENTER);
//        statJPanel.validate();

    }
}
