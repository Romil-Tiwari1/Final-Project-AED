/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CareSystemCoordinatorRole;

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Enterprise.EnterpriseInventory;
import HealthCentre.Network.Network;
import HealthCentre.Organization.Organization;
import HealthCentre.Person.Donor;
import HealthCentre.UserAccount.UserAccount;
import HealthCentre.WorkQueue.HealthCareSystemCoordinatorWorkRequest;
import HealthCentre.WorkQueue.WorkRequest;
import HomeScreens.TableFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author romiltiwari
 */
public class OrganDonorListJPanel extends javax.swing.JPanel {

    private EcoSystem ecoSystem;
    private EnterpriseInventory enterpriseInventory;
    private Network network;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form OrganDonorListJPanel
     */
    public OrganDonorListJPanel(UserAccount userAccount, EcoSystem system, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.ecoSystem = system;
        this.network = network;
        organDonorTableList.getTableHeader().setDefaultRenderer(new TableFormat());
        hospitalListTable.getTableHeader().setDefaultRenderer(new TableFormat());
        assignmentListTable.getTableHeader().setDefaultRenderer(new TableFormat());
    }

    /**
     * Description : Populate Organ Donor Table
     */
    private void populateOrganDonorTable() {
        DefaultTableModel dtm = (DefaultTableModel) organDonorTableList.getModel();
        dtm.setRowCount(0);
        for (Donor donor : ecoSystem.getOrganDonorDirectory().getDonorList()) {
            Object row[] = new Object[4];
            row[0] = donor;
            row[1] = donor.getName();
            row[2] = donor.getContact();
            row[3] = donor.getStatus();
            dtm.addRow(row);
        }
    }

    /**
     * Description : Populate List of Available Hospitals for Organ Donation.
     */
    private void populateAvailableHospitalListTable() {
        DefaultTableModel dtm = (DefaultTableModel) hospitalListTable.getModel();
        dtm.setRowCount(0);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("Hospital")) {
                System.out.println("Hosp");
                Object[] row = new Object[2];
                row[0] = enterprise;
                row[1] = enterprise.getName();

                dtm.addRow(row);
            }
        }
    }

    /**
     * Description : Populate request for Organ Donation Assignment.
     */
    private void populateOrganDonationAssignRequestTable() {
        DefaultTableModel model = (DefaultTableModel) assignmentListTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getOrganDonor();
            row[2] = request.getDoctorRequestSummary();
            row[3] = request.getEnterprise();
            row[4] = request.getStatus();
            row[5] = request.getActionDate();
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
        organDonorTableList = new javax.swing.JTable();
        approvedOrganDonorList = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        assignButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hospitalListTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        assignmentListTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        mainHeading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(199, 247, 247));

        organDonorTableList.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        organDonorTableList.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        organDonorTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organDonorTableList.setGridColor(new java.awt.Color(0, 0, 0));
        organDonorTableList.setRowHeight(30);
        organDonorTableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organDonorTableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(organDonorTableList);

        approvedOrganDonorList.setBackground(new java.awt.Color(255, 255, 255));
        approvedOrganDonorList.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        approvedOrganDonorList.setText("Approved Organ Donors");
        approvedOrganDonorList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Assign Hospital");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        assignButton.setBackground(new java.awt.Color(31, 31, 31));
        assignButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        assignButton.setForeground(new java.awt.Color(255, 255, 255));
        assignButton.setText("Assign");
        assignButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        hospitalListTable.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        hospitalListTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        hospitalListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hospitalListTable.setGridColor(new java.awt.Color(0, 0, 0));
        hospitalListTable.setRowHeight(30);
        jScrollPane2.setViewportView(hospitalListTable);

        assignmentListTable.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        assignmentListTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        assignmentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Donor UID", "Summary", "Hospital Name", "Status", "Requested Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assignmentListTable.setGridColor(new java.awt.Color(0, 0, 0));
        assignmentListTable.setRowHeight(30);
        jScrollPane4.setViewportView(assignmentListTable);

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        mainHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mainHeading.setForeground(new java.awt.Color(255, 255, 255));
        mainHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainHeading.setText("Organ Donor And Hospital Mapping");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("from below list of hospitals");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/romiltiwari/Desktop/AED_Final/Final-Project-AED/OrganDonation/src/Images_1/liver.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/romiltiwari/Desktop/AED_Final/Final-Project-AED/OrganDonation/src/Images_1/hospital.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1529, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(approvedOrganDonorList)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(approvedOrganDonorList, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organDonorTableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organDonorTableListMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_organDonorTableListMouseClicked

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        int row = organDonorTableList.getSelectedRow();
        int row1 = hospitalListTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null,
                    new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> Donors Table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (row1 < 0) {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> Hospital Table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            WorkRequest request = new HealthCareSystemCoordinatorWorkRequest();
            {
                request.setActionDate(new Date());
                request.setAssignement("Hospital Pool");
                request.setDoctorRequestSummary("Requested for Organ Donation");
                request.setStatus("Assigned to Hospital"); 
                request.setUserAccount(userAccount);
                request.setOrganDonor((Donor) organDonorTableList.getValueAt(row, 0));
                request.getOrganDonor().setStatus("Assigned to Hospital"); // Organ Donor's Status changed
                request.setEnterprise((Enterprise) hospitalListTable.getValueAt(row1, 0));

                Organization org = null;
                Enterprise enterprise = (Enterprise) hospitalListTable.getValueAt(row1, 0);
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PathologistOrganization) {
                        org = organization;
                        break;
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                    System.out.println(org.getName());
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    populateOrganDonorTable();
                    populateOrganDonationAssignRequestTable();
                    JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Request sent<font color='green'> successfully</font>!</I></font></h2></html>"),
                            "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            //else{
            //    JOptionPane.showMessageDialog(null,"Donor is already assigned to a Hospital.", "Info", JOptionPane.INFORMATION_MESSAGE);
            //}    
        }
        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_assignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approvedOrganDonorList;
    private javax.swing.JButton assignButton;
    private javax.swing.JTable assignmentListTable;
    private javax.swing.JTable hospitalListTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mainHeading;
    private javax.swing.JTable organDonorTableList;
    // End of variables declaration//GEN-END:variables
}
