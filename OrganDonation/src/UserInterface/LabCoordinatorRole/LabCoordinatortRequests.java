/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabCoordinatorRole;


import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;

import HealthCentre.DB4OUtil.DB4OUtil;

import HealthCentre.Network.Network;
import HealthCentre.Organization.Organization;
import HealthCentre.Organization.LabCoordinatorOrganization;
import HealthCentre.Person.Donor;
import HealthCentre.UserAccount.UserAccount;
import HealthCentre.WorkQueue.WorkRequest;
import HomeScreens.TableFormat;
import java.awt.Color;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutisrivastava
 */
public class LabCoordinatortRequests extends javax.swing.JPanel {

    /**
     * Creates new form DonorListJPanel
     */
    private EcoSystem system;
    private UserAccount userAccount;
    private LabCoordinatorOrganization labCoordinatorOrganization;
    private Enterprise enterprise;
    private Network network;
    private Enterprise enterprise1;
    private Organization organ;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public LabCoordinatortRequests(EcoSystem system, UserAccount userAccount, LabCoordinatorOrganization labCoordinatorOrganization, Enterprise enterprise, Network network) {
        initComponents();
        this.labCoordinatorOrganization = labCoordinatorOrganization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;

        tblOrganisationDonors.getTableHeader().setDefaultRenderer(new TableFormat());
        tblOrgantDonors.getTableHeader().setDefaultRenderer(new TableFormat());
        populateOrganizationDonorTable();
        populateOrganDonorTable();
        populateOrganTypeComboBox();

        
    }
    
    
    public void populateOrganizationDonorTable(){
        DefaultTableModel model = (DefaultTableModel)tblOrganisationDonors.getModel();
        model.setRowCount(0);
        for(WorkRequest request : labCoordinatorOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getDoctorRequestSummary();
            row[2] = request.getOrganDonor();
            row[3] = request.getOrganDonor().getName();
            row[4] = request.getOrganDonor().getContact();
            row[5] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
  private void populateOrganTypeComboBox(){
           
           organTypeJComboBox.addItem("eye");
           organTypeJComboBox.addItem("kidney");
           organTypeJComboBox.addItem("lungs");
           organTypeJComboBox.addItem("intestine");
           organTypeJComboBox.addItem("liver");
           organTypeJComboBox.addItem("tissue");
           organTypeJComboBox.addItem("heart");
           organTypeJComboBox.addItem("pancreas");
           
        }
    public void populateOrganDonorTable(){
        DefaultTableModel model = (DefaultTableModel)tblOrgantDonors.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getOrganDonor();
            row[2] = request.getOrganDonor().getName();
            //row[3] = request.getDonor().getContact();
            row[3] = request.getOrganDonor().getOrganType();
            row[4] = request.getUserAccount().getUsername();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganisationDonors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssignLabCord = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrgantDonors = new javax.swing.JTable();
        buttonAddOrgan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonOrganDonate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonOrganDiscard = new javax.swing.JButton();
        checkBP = new javax.swing.JCheckBox();
        checkPulse = new javax.swing.JCheckBox();
        checkTest = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        organTypeJComboBox = new javax.swing.JComboBox();
        buttonProcessRequest = new javax.swing.JButton();
        textRequest = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        checkInfection = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrganisationDonors.setBackground(new java.awt.Color(0, 0, 0));
        tblOrganisationDonors.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblOrganisationDonors.setForeground(new java.awt.Color(255, 255, 255));
        tblOrganisationDonors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Donor UID", "Donor Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrganisationDonors.setGridColor(new java.awt.Color(0, 0, 0));
        tblOrganisationDonors.setRowHeight(30);
        jScrollPane1.setViewportView(tblOrganisationDonors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 760, 160));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List Of Voluntary Organ Donors");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 511, -1));

        btnAssignLabCord.setBackground(new java.awt.Color(31, 31, 31));
        btnAssignLabCord.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAssignLabCord.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignLabCord.setText("Assign To Me");
        btnAssignLabCord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignLabCord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignLabCordActionPerformed(evt);
            }
        });
        add(btnAssignLabCord, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 160, 40));

        tblOrgantDonors.setBackground(new java.awt.Color(0, 0, 0));
        tblOrgantDonors.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblOrgantDonors.setForeground(new java.awt.Color(255, 255, 255));
        tblOrgantDonors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Donor UID", "Donor Name", "Organ Type", "Assigned to", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrgantDonors.setGridColor(new java.awt.Color(0, 0, 0));
        tblOrgantDonors.setRowHeight(30);
        jScrollPane2.setViewportView(tblOrgantDonors);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 750, 190));

        buttonAddOrgan.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonAddOrgan.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddOrgan.setText("Add Organ to Bank");
        buttonAddOrgan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAddOrgan.setEnabled(false);
        buttonAddOrgan.setOpaque(true);
        buttonAddOrgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddOrganActionPerformed(evt);
            }
        });
        add(buttonAddOrgan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 280, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Blood Pressure Check");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pulse Check");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, 20));

        buttonOrganDonate.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonOrganDonate.setForeground(new java.awt.Color(255, 255, 255));
        buttonOrganDonate.setText("Organ Donated by the donor");
        buttonOrganDonate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonOrganDonate.setEnabled(false);
        buttonOrganDonate.setOpaque(true);
        buttonOrganDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrganDonateActionPerformed(evt);
            }
        });
        add(buttonOrganDonate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 290, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Health check");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tests on Patient for any infection");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 360, -1));

        buttonOrganDiscard.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonOrganDiscard.setForeground(new java.awt.Color(255, 255, 255));
        buttonOrganDiscard.setText("Discard the donated organ");
        buttonOrganDiscard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonOrganDiscard.setEnabled(false);
        buttonOrganDiscard.setOpaque(true);
        buttonOrganDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOrganDiscardActionPerformed(evt);
            }
        });
        add(buttonOrganDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 660, 290, 40));

        checkBP.setBackground(new java.awt.Color(0, 0, 0));
        checkBP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkBP.setForeground(new java.awt.Color(255, 255, 255));
        checkBP.setEnabled(false);
        checkBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBPActionPerformed(evt);
            }
        });
        add(checkBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 20, -1));

        checkPulse.setBackground(new java.awt.Color(0, 0, 0));
        checkPulse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkPulse.setForeground(new java.awt.Color(255, 255, 255));
        checkPulse.setEnabled(false);
        add(checkPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 20, 20));

        checkTest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkTest.setForeground(new java.awt.Color(255, 255, 255));
        checkTest.setEnabled(false);
        checkTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTestActionPerformed(evt);
            }
        });
        add(checkTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 30, 30));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Lab Co-ordinator- Donor Request");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1608, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, -1));

        organTypeJComboBox.setBackground(new java.awt.Color(31, 31, 31));
        organTypeJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        organTypeJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        organTypeJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        organTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organTypeJComboBoxActionPerformed(evt);
            }
        });
        add(organTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 110, 30));

        buttonProcessRequest.setBackground(new java.awt.Color(31, 31, 31));
        buttonProcessRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonProcessRequest.setForeground(new java.awt.Color(255, 255, 255));
        buttonProcessRequest.setText("Process the request");
        buttonProcessRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessRequestActionPerformed(evt);
            }
        });
        add(buttonProcessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 210, 40));

        textRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        textRequest.setForeground(new java.awt.Color(255, 255, 255));
        textRequest.setBorder(null);
        textRequest.setEnabled(false);
        add(textRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OrganType");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, 30));

        checkInfection.setBackground(new java.awt.Color(0, 0, 0));
        checkInfection.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkInfection.setForeground(new java.awt.Color(255, 255, 255));
        checkInfection.setEnabled(false);
        checkInfection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInfectionActionPerformed(evt);
            }
        });
        add(checkInfection, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 20, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Request Number:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 30));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 80, 120, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignLabCordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignLabCordActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganisationDonors.getSelectedRow();
        
        if (selectedRow < 0){
         //JOptionPane.showMessageDialog(null, "Please select a row first!" );
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        else{
        WorkRequest request = (WorkRequest)tblOrganisationDonors.getValueAt(selectedRow, 0);
        //request.setReceiver(userAccount);
        
        if(request.getStatus().equals("Assigned to Hospital"))
        { 
        request.setStatus("Assigned to Lab Coordinator" + userAccount.getUsername());
        request.setUserAccount(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        else{
            
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
        //JOptionPane.showMessageDialog(null, "Work Request is already assigned!" );
        }
        
        dB4OUtil.storeSystem(system);
        
        
        populateOrganizationDonorTable();
        populateOrganDonorTable();
        }
    }//GEN-LAST:event_btnAssignLabCordActionPerformed

    private void buttonAddOrganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddOrganActionPerformed
        // TODO add your handling code here:
        
        
        if(!checkInfection.isSelected()){
            checkInfection.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkInfection.setForeground(Color.red);
           // JOptionPane.showMessageDialog(null, "Kindly Test for other Infections!", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly do the<font color='red'> Test</font> for other infections!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        }
        else if(organTypeJComboBox.getSelectedItem().equals(null)){
            organTypeJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            organTypeJComboBox.setForeground(Color.red);
           // JOptionPane.showMessageDialog(null, "Kindly select an Organ Type Group!", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly select a<font color='red'> Organ Type!</font><I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        }
        else{
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
              if(ent.getEnterpriseType().toString().equals("OrganBank")){
                  enterprise1 = ent;           
              }
        }  
        for (Organization org: enterprise1.getOrganizationDirectory().getOrganizationList()){
              System.out.println(org.getClass().getTypeName().toString()+" asit");
              if(org.getClass().getTypeName().toString().equals("Business.Organization.OrganBankOrganization")){
                 organ =org;
              }
        }
          
        try
          {organ.getOrganType().addOrganType(String.valueOf(organTypeJComboBox.getSelectedItem()));
          }
        catch( NullPointerException ex   )
          { System.out.println("");
          }
                    
        int selectedRow = tblOrgantDonors.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly select a<font color='red'> row!</font><I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
          
        WorkRequest request = (WorkRequest)tblOrgantDonors.getValueAt(selectedRow, 0);
                request.setStatus("Organ added to Bank");
                
                dB4OUtil.storeSystem(system);
                
                populateOrganizationDonorTable();
                populateOrganDonorTable();
            
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Organ<font color='green'> added</font> to the bank!<I></h2></html>"));
           
                
                buttonAddOrgan.setEnabled(false);
                buttonOrganDiscard.setEnabled(false);        
         }
         dB4OUtil.storeSystem(system);
         
    }//GEN-LAST:event_buttonAddOrganActionPerformed

    private void checkTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTestActionPerformed

    private void checkBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBPActionPerformed

    private void buttonOrganDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrganDonateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrgantDonors.getSelectedRow();
        
        
        if (!checkBP.isSelected()) {
            checkBP.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkBP.setForeground(Color.red);
        }
         if (!checkTest.isSelected()) {
            checkTest.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkTest.setForeground(Color.red);
        }
         if (!checkPulse.isSelected()) {
            checkPulse.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkPulse.setForeground(Color.red);
        }
        
        
        
        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a Request Number</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            return;
        }
        
        else if( !checkBP.isSelected()  || !checkTest.isSelected()  ||  !checkPulse.isSelected())
        {   JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly do the<font color='red'> Health Check of the Donor</font> before the<font color='green'> Organ Donation</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
            //JOptionPane.showMessageDialog(null, "Kindly do the Heatlth Check of the Donor before the Donation!" , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
        WorkRequest request1 = (WorkRequest)tblOrganisationDonors.getValueAt(selectedRow, 0);
                request1.setStatus("Organ Donated");
                
                //request1.getDonor().setStatus("Organ Donated");
                dB4OUtil.storeSystem(system);
                
                populateOrganizationDonorTable();
                populateOrganDonorTable();
                
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='green'><I>Organ Donated!</I></font></h2></html>"));
           
        for(Donor dnr: system.getOrganDonorDirectory().getDonorList()){
            if(dnr.getDonorID().equals(request1.getOrganDonor().getDonorID())){
                dnr.setLastDonationDate(new Date());
                dnr.setStatus("Organ Donated");
                System.out.println(String.valueOf(dnr.getLastDonationDate())+" last donation date");
            }
        }
        buttonOrganDonate.setEnabled(false);
        organTypeJComboBox.setEnabled(true);
        buttonAddOrgan.setEnabled(true);
        buttonOrganDiscard.setEnabled(true);
        checkInfection.setEnabled(true);
        

        
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_buttonOrganDonateActionPerformed

    private void organTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organTypeJComboBoxActionPerformed

    private void buttonProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessRequestActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblOrgantDonors.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
           // JOptionPane.showMessageDialog(null, "Please select a row first!" );
            return;
        }
        else
        {               
        WorkRequest request = (WorkRequest)tblOrgantDonors.getValueAt(selectedRow, 0);
       
        if(request.getStatus().contains("Assigned to Lab Coordinator")){
       textRequest.setText( String.valueOf(tblOrganisationDonors.getValueAt(selectedRow, 0)));  
       checkBP.setEnabled(true);
       checkTest.setEnabled(true);
       checkPulse.setEnabled(true);
       buttonOrganDonate.setEnabled(true);
        }
        else{
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
            //JOptionPane.showMessageDialog(null, "Request is already processed!" );
        }
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_buttonProcessRequestActionPerformed

    private void checkInfectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInfectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInfectionActionPerformed

    private void buttonOrganDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOrganDiscardActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrgantDonors.getSelectedRow();
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            return;
        }
        else
        {  
        WorkRequest request = (WorkRequest)tblOrgantDonors.getValueAt(selectedRow, 0);
                request.setStatus("Organ Discarded");
                populateOrganizationDonorTable();
                populateOrganDonorTable();
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Organ Discarded!</I></font></h2></html>"));  
        
        buttonAddOrgan.setEnabled(false);
        buttonOrganDiscard.setEnabled(false);
        
        dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_buttonOrganDiscardActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignLabCord;
    private javax.swing.JButton buttonAddOrgan;
    private javax.swing.JButton buttonOrganDiscard;
    private javax.swing.JButton buttonOrganDonate;
    private javax.swing.JButton buttonProcessRequest;
    private javax.swing.JCheckBox checkBP;
    private javax.swing.JCheckBox checkInfection;
    private javax.swing.JCheckBox checkPulse;
    private javax.swing.JCheckBox checkTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox organTypeJComboBox;
    private javax.swing.JTable tblOrganisationDonors;
    private javax.swing.JTable tblOrgantDonors;
    private javax.swing.JTextField textRequest;
    // End of variables declaration//GEN-END:variables
}
