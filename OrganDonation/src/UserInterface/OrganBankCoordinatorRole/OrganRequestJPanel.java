/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.OrganBankCoordinatorRole;

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.CareSystemCoordinatorOrganisation;
import HealthCentre.Organization.OrganBankOrganization;
import HealthCentre.Organization.Organization;
import HealthCentre.Organization.SystemCoordinatorOrganization;
import HealthCentre.UserAccount.UserAccount;
import HealthCentre.WorkQueue.WorkRequest;
import HomeScreens.TableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author romiltiwari
 */
public class OrganRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganRequestJPanel
     */
    private UserAccount userAccount;
    private OrganBankOrganization organBankOrganisation;
    private Enterprise enterprise;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem ecoSystem;

    public OrganRequestJPanel(UserAccount userAccount, OrganBankOrganization organBankOrganisation, Enterprise enterprise, Network network,
            EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.organBankOrganisation = organBankOrganisation;
        this.enterprise = enterprise;
        this.network = network;
        this.ecoSystem = system;
        jPanel1.setVisible(false);
        organCoordinatorListTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populateOrganTypeFields();
        populateOrganCoordinatorTable();
    }

    /**
     * Description : Populate Organ Type Text Fields
     */
    public void populateOrganTypeFields() {
        Enterprise ent1 = null;
        Organization org1 = null;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("OrganBank")) {
                ent1 = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        for (Organization organization : ent1.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof OrganBankOrganization) {
                org1 = organization;
                break;
            }
        }
        if (org1 != null) {
            System.out.println(org1.getName() + "Orgcheck");
        } else {
            JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }

        heartOrganTextField.setText(String.valueOf(org1.getOrganType().getHeart()));
        eyeOrganTextField.setText(String.valueOf(org1.getOrganType().getEye()));
        pancreasOrganTextField.setText(String.valueOf(org1.getOrganType().getPancreas()));
        intenstineOrganTextField.setText(String.valueOf(org1.getOrganType().getIntestine()));
        lungsOrganTextField.setText(String.valueOf(org1.getOrganType().getLungs()));
        tissueOrganTextField.setText(String.valueOf(org1.getOrganType().getTissue()));
        kidneyOrganTextField.setText(String.valueOf(org1.getOrganType().getKidney()));
        liverOrganTextField.setText(String.valueOf(org1.getOrganType().getLiver()));
    }

    /**
     * Description : Populate Organ Coordinator table
     */
    public void populateOrganCoordinatorTable() {
        System.out.println("Inside POpulate");
        DefaultTableModel model = (DefaultTableModel) organCoordinatorListTable.getModel();
        model.setRowCount(0);
        System.out.println(userAccount.getWorkQueue().getWorkRequestList());
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            System.out.println("Inside POpulate For" + request);
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getPatient().getBloodGroup();
            row[5] = request.getStatus();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        eyeOrganLabel = new javax.swing.JLabel();
        eyeOrganTextField = new javax.swing.JTextField();
        approveButton = new javax.swing.JButton();
        heartOrganLabel = new javax.swing.JLabel();
        heartOrganTextField = new javax.swing.JTextField();
        lungsOrganLabel = new javax.swing.JLabel();
        lungsOrganTextField = new javax.swing.JTextField();
        tissueOrganLabel = new javax.swing.JLabel();
        liverOrganTextField = new javax.swing.JTextField();
        kidneyOrganLabel = new javax.swing.JLabel();
        kidneyOrganTextField = new javax.swing.JTextField();
        liverOrganLabel = new javax.swing.JLabel();
        tissueOrganTextField = new javax.swing.JTextField();
        pancreasOrganLabel = new javax.swing.JLabel();
        pancreasOrganTextField = new javax.swing.JTextField();
        intenstineOrganLabel = new javax.swing.JLabel();
        intenstineOrganTextField = new javax.swing.JTextField();
        holdReqButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        organCoordinatorListTable = new javax.swing.JTable();
        mainHeadingPanel = new javax.swing.JPanel();
        mainHeadingText = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(199, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Organ Requirement Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 247, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Organs Category");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 334, -1, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Available Organs");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 334, -1, 40));

        eyeOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        eyeOrganLabel.setText("EYE");
        add(eyeOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 50, 30));

        eyeOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        eyeOrganTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyeOrganTextFieldActionPerformed(evt);
            }
        });
        add(eyeOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 190, -1));

        approveButton.setBackground(new java.awt.Color(31, 31, 31));
        approveButton.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        approveButton.setForeground(new java.awt.Color(255, 255, 255));
        approveButton.setText("Approve Request");
        approveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });
        add(approveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 190, 40));

        heartOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        heartOrganLabel.setText("HEART");
        add(heartOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, 30));

        heartOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(heartOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 190, -1));

        lungsOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lungsOrganLabel.setText("LUNGS");
        add(lungsOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        lungsOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(lungsOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 190, -1));

        tissueOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tissueOrganLabel.setText("TISSUE");
        add(tissueOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        liverOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(liverOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 190, -1));

        kidneyOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        kidneyOrganLabel.setText("KIDNEY");
        add(kidneyOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 110, 30));

        kidneyOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(kidneyOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 190, -1));

        liverOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        liverOrganLabel.setText("LIVER");
        add(liverOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        tissueOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(tissueOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 190, -1));

        pancreasOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        pancreasOrganLabel.setText("PANCREAS");
        add(pancreasOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, 30));

        pancreasOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(pancreasOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 190, -1));

        intenstineOrganLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        intenstineOrganLabel.setText("INTENSTINE");
        add(intenstineOrganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        intenstineOrganTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        add(intenstineOrganTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 190, -1));

        holdReqButton.setBackground(new java.awt.Color(31, 31, 31));
        holdReqButton.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        holdReqButton.setForeground(new java.awt.Color(255, 255, 255));
        holdReqButton.setText("Hold Request");
        holdReqButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        holdReqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                holdReqButtonActionPerformed(evt);
            }
        });
        add(holdReqButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 190, 40));

        organCoordinatorListTable.setBackground(new java.awt.Color(0, 0, 0));
        organCoordinatorListTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        organCoordinatorListTable.setForeground(new java.awt.Color(255, 255, 255));
        organCoordinatorListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient ID", "Patient Name", "Email ID", "Organ Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organCoordinatorListTable.setGridColor(new java.awt.Color(0, 0, 0));
        organCoordinatorListTable.setRowHeight(30);
        organCoordinatorListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organCoordinatorListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(organCoordinatorListTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 700, 200));

        mainHeadingPanel.setBackground(new java.awt.Color(31, 31, 31));
        mainHeadingPanel.setPreferredSize(new java.awt.Dimension(926, 70));

        mainHeadingText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mainHeadingText.setForeground(new java.awt.Color(255, 51, 51));
        mainHeadingText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainHeadingText.setText("Organ Bank");

        javax.swing.GroupLayout mainHeadingPanelLayout = new javax.swing.GroupLayout(mainHeadingPanel);
        mainHeadingPanel.setLayout(mainHeadingPanelLayout);
        mainHeadingPanelLayout.setHorizontalGroup(
            mainHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHeadingPanelLayout.createSequentialGroup()
                .addComponent(mainHeadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 673, Short.MAX_VALUE))
        );
        mainHeadingPanelLayout.setVerticalGroup(
            mainHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainHeadingText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(mainHeadingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, -1));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 130, 20));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 610, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void eyeOrganTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyeOrganTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eyeOrganTextFieldActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = organCoordinatorListTable.getSelectedRow();

        if (selectedRow < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            WorkRequest request = (WorkRequest) organCoordinatorListTable.getValueAt(selectedRow, 0);
            System.out.println("test11" + request.getStatus());
            if (request.getStatus().equals("Legally Approved. Passing to OrganBank")
                    || request.getStatus().equals("Request on Hold Due to Organ not available currently")) {
                request.setStatus("Organbank Approved. Passing to Health Care System Coordinator");
                dB4OUtil.storeSystem(ecoSystem);
                populateOrganCoordinatorTable();

            } else {
                //JOptionPane.showMessageDialog(null, "Work Request is already in progress!" );
                Enterprise ent = null;
                Organization org = null;

                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    System.out.println("test12 ent type" + enterprise.getEnterpriseType());
                    if (enterprise.getEnterpriseType().toString().equals("Hospital")) {
                        ent = enterprise;
                        break;
                    }
                }
                for (Organization organization : ent.getOrganizationDirectory()
                        .getOrganizationList()) {
                    System.out.println("test13 org1 type" + organization);
                    if (organization instanceof SystemCoordinatorOrganization) {
                        org = organization;
                        break;
                    }
                }

                if (org != null) {
                    System.out.println("org" + org);
                    org.getWorkQueue().getWorkRequestList().add(request);
                    System.out.println("final organ" + request.getPatient().getOrganType());
                    org.getOrganType().subtractOrganType(request.getPatient().getOrganType());
                    populateOrganTypeFields();
                } else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_approveButtonActionPerformed

    private void holdReqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_holdReqButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = organCoordinatorListTable.getSelectedRow();

        if (selectedRow < 0) {
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );

            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table!</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        } else {
            WorkRequest request = (WorkRequest) organCoordinatorListTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Consent and Authorization Approved. Passing to Organ bank")) {
                request.setStatus("Request on Hold Due to Organ unavailability at the moment");

                dB4OUtil.storeSystem(ecoSystem);
                populateOrganCoordinatorTable();
            } else {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_holdReqButtonActionPerformed

    private void organCoordinatorListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organCoordinatorListTableMouseClicked
        // TODO add your handling code here:

        int selectedRow = organCoordinatorListTable.getSelectedRow();
        // jPanel1.setVisible(true);
        if (selectedRow < 0) {
            //JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table!</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            jPanel1.setVisible(true);
            WorkRequest request = (WorkRequest) organCoordinatorListTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Legally Approved. Passing to OrganBank")) {
                if (request.getPatient().isEmergencyStatus() == true) {
                    jPanel1.setVisible(true);
                }
            } else {
                jPanel1.setVisible(false);
            }
        }

    }//GEN-LAST:event_organCoordinatorListTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JLabel eyeOrganLabel;
    private javax.swing.JTextField eyeOrganTextField;
    private javax.swing.JLabel heartOrganLabel;
    private javax.swing.JTextField heartOrganTextField;
    private javax.swing.JButton holdReqButton;
    private javax.swing.JLabel intenstineOrganLabel;
    private javax.swing.JTextField intenstineOrganTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kidneyOrganLabel;
    private javax.swing.JTextField kidneyOrganTextField;
    private javax.swing.JLabel liverOrganLabel;
    private javax.swing.JTextField liverOrganTextField;
    private javax.swing.JLabel lungsOrganLabel;
    private javax.swing.JTextField lungsOrganTextField;
    private javax.swing.JPanel mainHeadingPanel;
    private javax.swing.JLabel mainHeadingText;
    private javax.swing.JTable organCoordinatorListTable;
    private javax.swing.JLabel pancreasOrganLabel;
    private javax.swing.JTextField pancreasOrganTextField;
    private javax.swing.JLabel tissueOrganLabel;
    private javax.swing.JTextField tissueOrganTextField;
    // End of variables declaration//GEN-END:variables
}
