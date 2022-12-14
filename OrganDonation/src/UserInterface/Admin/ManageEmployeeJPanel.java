/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin;

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.EcoSystem;
import HealthCentre.Employee.Employee;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Organization.Organization;
import HealthCentre.Organization.OrganizationInventory;
import HomeScreens.TableFormat;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fakhr
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationInventory organizationDir;
    private JPanel userProcessContainer;
    
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationInventory organizationDir, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.system = system;
        
        organizationJTable.getTableHeader().setDefaultRenderer(new TableFormat());
        populateOrganizationComboBox();
        //populateOrganizationEmpComboBox();
        //populateTable();
        enterpriseNameTextField1.setText(enterprise.getName());
        
    }
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);
        for (Organization o : organizationDir.getOrganizationList()) {
            for (Employee employee : o.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[3];
                row[0] = o;
                row[1] = o.getRealName();
                row[2] = employee.getName();
                model.addRow(row);
            }

        }

    }
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationJComboBox.addItem(organization);
            
            
            
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization.getRealName());
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[0] = organization;
            row[1] = organization.getRealName();
            row[2] = employee;
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

        enterpriseNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameSeparator = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationJComboBox = new javax.swing.JComboBox();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        addJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nameSeparator1 = new javax.swing.JSeparator();
        nameSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        enterpriseNameTextField1 = new javax.swing.JTextField();

        enterpriseNameTextField.setBackground(new java.awt.Color(55, 96, 128));
        enterpriseNameTextField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        enterpriseNameTextField.setBorder(null);
        enterpriseNameTextField.setCaretColor(new java.awt.Color(30, 59, 92));
        enterpriseNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterpriseNameTextFieldFocusGained(evt);
            }
        });
        enterpriseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseNameTextFieldActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(199, 247, 247));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBackground(new java.awt.Color(0, 0, 0));
        organizationJTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        organizationJTable.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(255, 255, 255));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setGridColor(new java.awt.Color(0, 0, 0));
        organizationJTable.setRowHeight(30);
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 360, 450));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_32px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, -1, 50));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(1550, 70));

        jLabel5.setBackground(new java.awt.Color(31, 31, 31));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Employee");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(641, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Create Employee");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 233, 36));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name of Employee");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 180, 26));

        nameSeparator.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 300, 10));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type of Organization");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 200, 26));

        nameJTextField.setBackground(new java.awt.Color(0, 0, 0));
        nameJTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameJTextField.setBorder(null);
        jPanel2.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 220, 30));

        organizationJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        organizationJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        organizationJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                organizationJComboBoxItemStateChanged(evt);
            }
        });
        organizationJComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizationJComboBoxMouseClicked(evt);
            }
        });
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 210, 30));

        organizationEmpJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        organizationEmpJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 222, 210, 30));

        addJButton.setBackground(new java.awt.Color(199, 247, 247));
        addJButton.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        addJButton.setText("CREATE");
        addJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 190, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name of Organization");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 220, 26));

        nameSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 358, 300, -1));

        nameSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(nameSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 300, 10));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 370, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enterprise:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        enterpriseNameTextField1.setBackground(new java.awt.Color(0, 0, 0));
        enterpriseNameTextField1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        enterpriseNameTextField1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseNameTextField1.setBorder(null);
        add(enterpriseNameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        String check1 = "";
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        
        if (organizationJComboBox.getSelectedItem().equals(null) )
        {
            organizationJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            organizationJComboBox.setForeground(Color.red);
            //JOptionPane.showMessageDialog(null, "Select an Organization Type please!");
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Select an<font color='red'> Organization Type</font> please!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            check1 = "don't go ahead";
        }
        
        else if (organizationEmpJComboBox.getSelectedItem().equals(null) )
        {
           organizationEmpJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            organizationEmpJComboBox.setForeground(Color.red);
             JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Select an<font color='red'> Organization Name</font> please!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           // JOptionPane.showMessageDialog(null, "Select an Organization Name please!");
            check1 = "don't go ahead";
        }
        else if (nameJTextField.getText().isEmpty()) {
           nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameJTextField.setForeground(Color.red);
             JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Employee Name<font color='red'> can not</font> be same!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Employee name cannot be empty.");
            check1 = "don't go ahead";
            return;
        }
        
        else{
        
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {

            if (employee.getName().equals(nameJTextField.getText())) {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Multiple employees <font color='red'> can not</font> have same name!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                //JOptionPane.showMessageDialog(null, "Multiple employees cannot have same name.");
                check1 = "don't go ahead";
                return;
            }}
        }
        
        if(check1 == "")
        {
        
        String name = nameJTextField.getText();
        
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        
        
        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>New Employee</I><font color='green'> created </font><I>successfully!/I<></h2></html>") );
                   
        //JOptionPane.showMessageDialog(null, "Employee created successfully!");
        
        nameJTextField.setText("");
        //organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        //organizationEmpJComboBox.removeItem(organizationEmpJComboBox.getSelectedItem());
        dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void enterpriseNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldFocusGained

    private void enterpriseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseNameTextFieldActionPerformed

    private void organizationJComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationJComboBoxMouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_organizationJComboBoxMouseClicked

    private void organizationJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_organizationJComboBoxItemStateChanged
        // TODO add your handling code here:
         Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        organizationEmpJComboBox.removeAllItems();
        organizationEmpJComboBox.addItem(organization.getRealName());
        
    }//GEN-LAST:event_organizationJComboBoxItemStateChanged

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField enterpriseNameTextField;
    private javax.swing.JTextField enterpriseNameTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JSeparator nameSeparator1;
    private javax.swing.JSeparator nameSeparator3;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
