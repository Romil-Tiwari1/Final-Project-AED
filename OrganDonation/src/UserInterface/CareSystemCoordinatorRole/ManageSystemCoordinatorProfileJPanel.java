/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CareSystemCoordinatorRole;

import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Organization.CareSystemCoordinatorOrganisation;
import HealthCentre.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author romiltiwari
 */
public class ManageSystemCoordinatorProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSystemCoordinatorProfile
     */
    private UserAccount userAccount;
    private Enterprise enterprise ;
    private CareSystemCoordinatorOrganisation systemOrganisation;
    
    public ManageSystemCoordinatorProfileJPanel(UserAccount userAccount, 
            CareSystemCoordinatorOrganisation systemOrganisation, Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.systemOrganisation = systemOrganisation;
        populatePanelTextField();
    }
    
    /**
     * Description : Populate Panel Text Fields
     */
    private void populatePanelTextField(){
        genderComboBox.removeAllItems();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        addressTextField.setText(userAccount.getEmployee().getAddress());
        cityTextField.setText(userAccount.getEmployee().getCity());
        contactTextField.setText(String.valueOf(userAccount.getEmployee().getContactNumber()));
        dateOfBirthTextField.setText(String.valueOf(userAccount.getEmployee().getDateOfBirth()));
        nameTextField.setText(userAccount.getEmployee().getName());
        specializationTextField.setText(userAccount.getEmployee().getSpecialization());
        stateTextField.setText(userAccount.getEmployee().getState());     
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameFieldLabel = new javax.swing.JLabel();
        contactFieldLabel = new javax.swing.JLabel();
        addressFieldLabel = new javax.swing.JLabel();
        cityFieldLabel = new javax.swing.JLabel();
        stateFieldLabel = new javax.swing.JLabel();
        genderFieldLabel = new javax.swing.JLabel();
        dateOfBirthFieldLabel = new javax.swing.JLabel();
        backLabelButton = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        specializationTextField = new javax.swing.JTextField();
        dateOfBirthTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        genderComboBox = new javax.swing.JComboBox();
        specializationFieldLabel = new javax.swing.JLabel();
        mainHeadingLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 247, 247));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameFieldLabel.setText("Name:");
        add(nameFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        contactFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contactFieldLabel.setText("Contact:");
        add(contactFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        addressFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressFieldLabel.setText("Address:");
        add(addressFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 30));

        cityFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cityFieldLabel.setText("City:");
        add(cityFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        stateFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stateFieldLabel.setText("State:");
        add(stateFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));

        genderFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderFieldLabel.setText("Gender:");
        add(genderFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        dateOfBirthFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateOfBirthFieldLabel.setText("DOB:");
        add(dateOfBirthFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, 30));

        backLabelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backLabelButton.setForeground(new java.awt.Color(255, 255, 255));
        backLabelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backLabelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelButtonMouseClicked(evt);
            }
        });
        add(backLabelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 70, 50));

        nameTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 190, 30));

        contactTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(contactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 190, 30));

        addressTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 190, 30));

        cityTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 190, 30));

        stateTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(stateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 190, 30));

        specializationTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(specializationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 190, 30));

        dateOfBirthTextField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add(dateOfBirthTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 190, 30));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, 40));

        genderComboBox.setBackground(new java.awt.Color(0, 0, 0));
        genderComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderComboBox.setForeground(new java.awt.Color(255, 255, 255));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 190, -1));

        specializationFieldLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        specializationFieldLabel.setText("Specialization:");
        add(specializationFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, 30));

        mainHeadingLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        mainHeadingLabel.setText("Manage System Coordinator Profile");
        mainHeadingLabel.setAlignmentX(0.5F);
        mainHeadingLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        add(mainHeadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 20, 380, 40));

        iconLabel.setIcon(new javax.swing.ImageIcon("/Users/romiltiwari/Desktop/Mitochondria/Final-Project-AED/OrganDonation/src/Images_1/healthcare.png")); // NOI18N
        add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 130, 140));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backLabelButtonMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        userAccount.getEmployee().setCity(cityTextField.getText());
        userAccount.getEmployee().setContactNumber(Integer.parseInt(contactTextField.getText()));
        userAccount.getEmployee().setSpecialization(specializationTextField.getText());
        userAccount.getEmployee().setDateOfBirth(new Date(dateOfBirthTextField.getText()));
        userAccount.getEmployee().setGender((String) genderComboBox.getSelectedItem());
        userAccount.getEmployee().setAddress(addressTextField.getText());
        userAccount.getEmployee().setState(cityTextField.getText());
    }//GEN-LAST:event_saveButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        genderComboBox.removeAllItems();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        addressTextField.setText(userAccount.getEmployee().getAddress());
        cityTextField.setText(userAccount.getEmployee().getCity());
        contactTextField.setText(String.valueOf(userAccount.getEmployee().getContactNumber()));
        dateOfBirthTextField.setText(String.valueOf(userAccount.getEmployee().getDateOfBirth()));
        nameTextField.setText(userAccount.getEmployee().getName());
        specializationTextField.setText(userAccount.getEmployee().getSpecialization());
        stateTextField.setText(userAccount.getEmployee().getState());
    }//GEN-LAST:event_resetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressFieldLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel backLabelButton;
    private javax.swing.JLabel cityFieldLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel contactFieldLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel dateOfBirthFieldLabel;
    private javax.swing.JTextField dateOfBirthTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel genderFieldLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel mainHeadingLabel;
    private javax.swing.JLabel nameFieldLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel specializationFieldLabel;
    private javax.swing.JTextField specializationTextField;
    private javax.swing.JLabel stateFieldLabel;
    private javax.swing.JTextField stateTextField;
    // End of variables declaration//GEN-END:variables
}
