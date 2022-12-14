/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DonationCoordinator;

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.EcoSystem;
import HealthCentre.Person.Donor;
import HealthCentre.Person.DonorRequest;
import HomeScreens.TableFormat;
import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fakhr
 */
public class VolunteerDonorRequestJPanel extends javax.swing.JPanel {

  private  EcoSystem system;
  private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
  //private DonorRequest donorRequest;
  
    VolunteerDonorRequestJPanel(EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.system = system;
        
        requestTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populateRequestTable();
     }
   
     
        private void populateRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) requestTable.getModel();
        
        dtm.setRowCount(0);
          
        for(DonorRequest dnr : system.getDonorRequestDirectory().getDonorRequestList()){
            System.out.println("PRINITNG IT HERE in Volunteer !!");
            System.out.println(dnr.getName());
        }
        
         for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
            Object row[] = new Object[4];
            row[0]= donorRequest;
            row[1]= donorRequest.getName();
            row[2]= donorRequest.getContact();
            row[3]= donorRequest.getStatus();
              
            dtm.addRow(row);
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
        requestTable = new javax.swing.JTable();
        buttonApprove = new javax.swing.JButton();
        buttonReject = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        uidText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        streetText = new javax.swing.JTextField();
        organTypeText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        contactText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        statusText = new javax.swing.JTextField();
        accidentHistory = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        buttonDetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        inheritedDiseaseText = new javax.swing.JTextField();
        substanceAbuse = new javax.swing.JTextField();
        drugAddict = new javax.swing.JTextField();
        lblProfilePicture = new javax.swing.JLabel();
        dobDateField = new com.toedter.calendar.JDateChooser();
        emailText = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(199, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTable.setBackground(new java.awt.Color(0, 0, 0));
        requestTable.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        requestTable.setForeground(new java.awt.Color(255, 255, 255));
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
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
        requestTable.setFocusable(false);
        requestTable.setGridColor(new java.awt.Color(0, 0, 0));
        requestTable.setRowHeight(30);
        jScrollPane1.setViewportView(requestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 190));

        buttonApprove.setBackground(new java.awt.Color(31, 31, 31));
        buttonApprove.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonApprove.setForeground(new java.awt.Color(255, 255, 255));
        buttonApprove.setText("Approve");
        buttonApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonApprove.setEnabled(false);
        buttonApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApproveActionPerformed(evt);
            }
        });
        add(buttonApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 100, 40));

        buttonReject.setBackground(new java.awt.Color(31, 31, 31));
        buttonReject.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonReject.setForeground(new java.awt.Color(255, 255, 255));
        buttonReject.setText("Reject");
        buttonReject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonReject.setEnabled(false);
        buttonReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRejectActionPerformed(evt);
            }
        });
        add(buttonReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 100, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("UID");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        uidText.setBackground(new java.awt.Color(0, 0, 0));
        uidText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidText.setForeground(new java.awt.Color(255, 255, 255));
        uidText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidTextActionPerformed(evt);
            }
        });
        add(uidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 170, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("DOB");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Age");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        ageText.setBackground(new java.awt.Color(0, 0, 0));
        ageText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ageText.setForeground(new java.awt.Color(255, 255, 255));
        add(ageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 180, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        genderText.setBackground(new java.awt.Color(0, 0, 0));
        genderText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        genderText.setForeground(new java.awt.Color(255, 255, 255));
        add(genderText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 170, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("Status");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, 30));

        streetText.setBackground(new java.awt.Color(0, 0, 0));
        streetText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        streetText.setForeground(new java.awt.Color(255, 255, 255));
        add(streetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 176, -1));

        organTypeText.setBackground(new java.awt.Color(0, 0, 0));
        organTypeText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        organTypeText.setForeground(new java.awt.Color(255, 255, 255));
        add(organTypeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 180, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setText("Street");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setText("City");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, 30));

        cityText.setBackground(new java.awt.Color(0, 0, 0));
        cityText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cityText.setForeground(new java.awt.Color(255, 255, 255));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 180, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setText("State");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        stateText.setBackground(new java.awt.Color(0, 0, 0));
        stateText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        stateText.setForeground(new java.awt.Color(255, 255, 255));
        add(stateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 180, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setText("ZipCode");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        zipText.setBackground(new java.awt.Color(0, 0, 0));
        zipText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        zipText.setForeground(new java.awt.Color(255, 255, 255));
        add(zipText, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, 180, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setText("Contact Number");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        contactText.setBackground(new java.awt.Color(0, 0, 0));
        contactText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        contactText.setForeground(new java.awt.Color(255, 255, 255));
        add(contactText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 170, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setText("Email ID");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        statusText.setBackground(new java.awt.Color(0, 0, 0));
        statusText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        statusText.setForeground(new java.awt.Color(255, 255, 255));
        add(statusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 180, -1));

        accidentHistory.setBackground(new java.awt.Color(0, 0, 0));
        accidentHistory.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        accidentHistory.setForeground(new java.awt.Color(255, 255, 255));
        accidentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accidentHistoryActionPerformed(evt);
            }
        });
        add(accidentHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 720, 170, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setText("Do you have any inherited disease?");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel21.setText("Are you a drug addict? ");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel22.setText("Do you have any history of accidents?");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 720, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel24.setText("Do you have history of substance abuse?");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, -1, -1));

        nameText.setBackground(new java.awt.Color(0, 0, 0));
        nameText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 180, -1));

        buttonDetails.setBackground(new java.awt.Color(31, 31, 31));
        buttonDetails.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonDetails.setForeground(new java.awt.Color(255, 255, 255));
        buttonDetails.setText("See Details");
        buttonDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetailsActionPerformed(evt);
            }
        });
        add(buttonDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, 40));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Donor Request Handling");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 613, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, -1));

        inheritedDiseaseText.setBackground(new java.awt.Color(0, 0, 0));
        inheritedDiseaseText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        inheritedDiseaseText.setForeground(new java.awt.Color(255, 255, 255));
        inheritedDiseaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inheritedDiseaseTextActionPerformed(evt);
            }
        });
        add(inheritedDiseaseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 590, 170, -1));

        substanceAbuse.setBackground(new java.awt.Color(0, 0, 0));
        substanceAbuse.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        substanceAbuse.setForeground(new java.awt.Color(255, 255, 255));
        substanceAbuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substanceAbuseActionPerformed(evt);
            }
        });
        add(substanceAbuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 170, -1));

        drugAddict.setBackground(new java.awt.Color(0, 0, 0));
        drugAddict.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        drugAddict.setForeground(new java.awt.Color(255, 255, 255));
        drugAddict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugAddictActionPerformed(evt);
            }
        });
        add(drugAddict, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, 170, -1));

        lblProfilePicture.setBackground(new java.awt.Color(0, 0, 0));
        add(lblProfilePicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, 130, 130));

        dobDateField.setBackground(new java.awt.Color(0, 0, 0));
        dobDateField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dobDateField.setForeground(new java.awt.Color(255, 255, 255));
        dobDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDateFieldFocusLost(evt);
            }
        });
        dobDateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dobDateFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dobDateFieldMousePressed(evt);
            }
        });
        dobDateField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobDateFielduDobKeyTyped(evt);
            }
        });
        add(dobDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 170, -1));

        emailText.setBackground(new java.awt.Color(0, 0, 0));
        emailText.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailText.setForeground(new java.awt.Color(255, 255, 255));
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 180, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel23.setText("Organ given");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 1310, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Donor Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("BIO Details");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Address Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApproveActionPerformed
        // TODO add your handling code here:
        if( !statusText.getText().equals("New Request"))
        {
            //JOptionPane.showMessageDialog(null,"Can Not Approve the Request!");
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='red'> can not</font> be approved!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        
        }
        
        else
        {
        Donor donor = system.getOrganDonorDirectory().addDonor();  
        donor.setDonorID(uidText.getText()); // UID
        donor.setName(nameText.getText()); // Name
        donor.setDob(dobDateField.getDate()); // DOB 
        donor.setAge(Integer.parseInt(ageText.getText())); // Age
        donor.setGender(genderText.getText()); // gender
        donor.setOrganType(organTypeText.getText()); 
        System.out.println("organTypeText.getText()" + organTypeText.getText());// organ type
        donor.setStreetAddress(streetText.getText()); // streetAddress
        donor.setCity(cityText.getText()); // city
        donor.setState(stateText.getText()); // state
        donor.setZipCode(Integer.parseInt(zipText.getText())); // zipCode
        donor.setContact(contactText.getText()); // contact
        donor.setEmailID(statusText.getText()); // emailID
        donor.setStatus("Donation Coordinator Approved"); // status
    
        donor.setInheritedDisease(true); //  inherited disease
        donor.setSubstanceAbuse(true); //  substance abuse
        donor.setDrugAddict(true); //  drug addict
        donor.setAccidentHistory(true); //  accident history     
             
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getDonorID().equals(uidText.getText())){
            donorRequest.setStatus("Donation Coordinator Approved");
            dB4OUtil.storeSystem(system);
            }
        }
        statusText.setText("Donation Coordinator Approved");
        
        dB4OUtil.storeSystem(system);
        populateRequestTable();
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request<font color='green'> approved</font> successfully!</I></h2></html>"));
           
        //JOptionPane.showMessageDialog(null,"Request Approved. New Donor added!");
        
        
        
        }
    }//GEN-LAST:event_buttonApproveActionPerformed

    private void buttonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetailsActionPerformed
        // TODO add your handling code here:
  
        int selectedRow = requestTable.getSelectedRow();
        if(selectedRow < 0){
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</font> to view details!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           // JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{
       //display the details 
            populateRequestDetails((DonorRequest) requestTable.getValueAt(selectedRow, 0));
            buttonApprove.setEnabled(true);
            buttonReject.setEnabled(true);
            
            if(Integer.parseInt(ageText.getText()) < 18) // AGE IS LESS THAN 18 YEARS
            {
            ageText.setBorder(BorderFactory.createLineBorder(Color.RED));
            ageText.setForeground(Color.red);
            }
            if(inheritedDiseaseText.getText().equals("false")) 
            {
             inheritedDiseaseText.setBorder(BorderFactory.createLineBorder(Color.RED));
             inheritedDiseaseText.setForeground(Color.red);
            }
            if(substanceAbuse.getText().equals("false")) 
            {
            substanceAbuse.setBorder(BorderFactory.createLineBorder(Color.RED));
            substanceAbuse.setForeground(Color.red);
            }
            if(drugAddict.getText().equals("false")) 
            {
            drugAddict.setBorder(BorderFactory.createLineBorder(Color.RED));
            drugAddict.setForeground(Color.red);
            }
            if(accidentHistory.getText().equals("false")) 
            {
            accidentHistory.setBorder(BorderFactory.createLineBorder(Color.RED));
            accidentHistory.setForeground(Color.red);
            }           
           dB4OUtil.storeSystem(system);
            
        }
    }

    private void populateRequestDetails(DonorRequest donorRequest){
            uidText.setText(donorRequest.getDonorID());
            nameText.setText(donorRequest.getName());
            dobDateField.setDate(donorRequest.getDob());
            ageText.setText(String.valueOf(donorRequest.getAge()));
            genderText.setText(donorRequest.getGender());
            organTypeText.setText(donorRequest.getOrganType());
            System.out.println("donorRequest.getOrganType()" +donorRequest.getOrganType());
            streetText.setText(donorRequest.getStreetAddress());
            cityText.setText(donorRequest.getCity());
            stateText.setText(donorRequest.getState());
            zipText.setText(String.valueOf(donorRequest.getZipCode()));
            contactText.setText(String.valueOf(donorRequest.getContact()));
            emailText.setText(donorRequest.getEmailID());
            statusText.setText(donorRequest.getStatus());
      
            inheritedDiseaseText.setText(String.valueOf(donorRequest.isInheritedDisease()));
            substanceAbuse.setText(String.valueOf(donorRequest.isSubstanceAbuse()));
            drugAddict.setText(String.valueOf(donorRequest.isDrugAddict()));
            accidentHistory.setText(String.valueOf(donorRequest.isAccidentHistory() ));
            
            if(donorRequest.getdP() !=null){
            //Working line
            byte[] JLabelpictureLabel = donorRequest.getdP();
            ImageIcon i = setPicturebyte(JLabelpictureLabel);
            lblProfilePicture.setIcon(i);
            }
            else{
            System.err.println("No Image");
            }
            
            uidText.setEditable(false);
            nameText.setEditable(false);
            ageText.setEditable(false);
            genderText.setEditable(false);
            organTypeText.setEditable(false);
            streetText.setEditable(false);
            cityText.setEditable(false);
            stateText.setEditable(false);
            zipText.setEditable(false);
            contactText.setEditable(false);
            statusText.setEditable(false);
            statusText.setEditable(false);
            inheritedDiseaseText.setEditable(false);
            substanceAbuse.setEditable(false);
            drugAddict.setEditable(false);
            accidentHistory.setEditable(false);       
            dobDateField.setEnabled(false);
            
    }//GEN-LAST:event_buttonDetailsActionPerformed

    private ImageIcon setPicturebyte(byte[] byteArrayImage){

        ImageIcon imageCar;
        imageCar = new ImageIcon(byteArrayImage);
        Image picCar = imageCar.getImage();
        JLabel pictureLabel1 = new JLabel();
        pictureLabel1.setSize(107, 133);
        Image resizedImage = picCar.getScaledInstance(pictureLabel1.getWidth(), pictureLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon selectedCarPicture = new ImageIcon(resizedImage);
        return selectedCarPicture;  
}
    
    
    
    private void buttonRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRejectActionPerformed
        // TODO add your handling code here:
       if(!statusText.getText().equals("New Request"))
                  {
                      
       JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Request<font color='red'> can not</font> be rejected!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
          
                      
                      //JOptionPane.showMessageDialog(null,"Can Not Reject the Request!");
        }
       else{
        for(DonorRequest donorRequest: system.getDonorRequestDirectory().getDonorRequestList()){            
        
            if(donorRequest.getName().equals(nameText.getText())){
            statusText.setText("Rejected");
            donorRequest.setStatus("Rejected");
            }}
        dB4OUtil.storeSystem(system);
        populateRequestTable();
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Request has been<font color='red'> rejected</font>!</I></h2></html>"));
        
        //JOptionPane.showMessageDialog(null,"Rejected the Request!");
        }
       dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_buttonRejectActionPerformed

    private void accidentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accidentHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accidentHistoryActionPerformed

    private void substanceAbuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substanceAbuseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_substanceAbuseActionPerformed

    private void drugAddictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugAddictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugAddictActionPerformed

    private void dobDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDateFieldFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_dobDateFieldFocusLost

    private void dobDateFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMouseExited
        //Date dob = dobDateField.getDate();
        //System.out.println(dob.getYear());
        //ageText.setText((String.valueOf(new Date().getYear()-dob.getYear())));
    }//GEN-LAST:event_dobDateFieldMouseExited

    private void dobDateFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dobDateFieldMousePressed

    }//GEN-LAST:event_dobDateFieldMousePressed

    private void dobDateFielduDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobDateFielduDobKeyTyped
        // TODO add your handling code here:
        System.out.println("date");
        /*

        Date dob = dobDateField.getDate();

        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday;  //Birth date
        birthday = LocalDate.of(dob);

        Period p = Period.between(birthday, today);

        ageText.setText(String.valueOf(p.getYears()));
        String dobq=  calculateAge(dob, today);

        }

        */
        /*  public  int calculateAge(LocalDate birthDate, LocalDate currentDate) {
            if ((birthDate != null) && (currentDate != null)) {
                return Period.between(birthDate, currentDate).getYears();
            } else {
                return 0;
            }

            */
    }//GEN-LAST:event_dobDateFielduDobKeyTyped

    private void inheritedDiseaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inheritedDiseaseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inheritedDiseaseTextActionPerformed

    private void uidTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accidentHistory;
    private javax.swing.JTextField ageText;
    private javax.swing.JButton buttonApprove;
    private javax.swing.JButton buttonDetails;
    private javax.swing.JButton buttonReject;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField contactText;
    private com.toedter.calendar.JDateChooser dobDateField;
    private javax.swing.JTextField drugAddict;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField genderText;
    private javax.swing.JTextField inheritedDiseaseText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField organTypeText;
    private javax.swing.JTable requestTable;
    private javax.swing.JTextField stateText;
    private javax.swing.JTextField statusText;
    private javax.swing.JTextField streetText;
    private javax.swing.JTextField substanceAbuse;
    private javax.swing.JTextField uidText;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables
}
