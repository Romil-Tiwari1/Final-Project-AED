/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganTransplantCentre;

import static java.time.Clock.system;
import javax.swing.JFrame;
import static javax.swing.SwingUtilities.getWindowAncestor;

import HealthCentre.DB4OUtil.DB4OUtil;
import UserInterface.CareSystemCoordinatorRole.*;
import HealthCentre.EcoSystem;
import HealthCentre.UserRole.DoctorRole;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.TransplantCentreOrganization;
import HealthCentre.Organization.DoctorOrganization;
import HealthCentre.Organization.Organization;
import HealthCentre.Person.PatientDirectory;
import HealthCentre.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;

/**
 *
 * @author shrutisrivastava
 */
public class TransplantCentreCoordinatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CovidCentreCoordinatorWorkAreaJPanel
     * 
     */
    boolean a = true;
    private UserAccount userAccount;
   TransplantCentreOrganization transplantCentreOrganization;
    Enterprise enterprise;
    EcoSystem system;
    PatientDirectory patientDirectory;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Network network;
    
    
    public TransplantCentreCoordinatorWorkAreaJPanel(UserAccount account,TransplantCentreOrganization covidCentreOrganization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.transplantCentreOrganization = transplantCentreOrganization;
        this.enterprise = enterprise;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    public void changeimage(JLabel button, String resourcecheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcecheimg));
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        
        if(dashboard == true){
            
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
        }
        
        else{
            
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
            
        }
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconminmax = new javax.swing.JPanel();
        ButtonClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        ButtonMax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        ButtonHideMenu = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnPatientStatus = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnReceiveRequests = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 153, 153));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconminmax.setBackground(new java.awt.Color(0, 0, 0));
        iconminmax.setMaximumSize(new java.awt.Dimension(150, 50));
        iconminmax.setMinimumSize(new java.awt.Dimension(150, 50));
        iconminmax.setPreferredSize(new java.awt.Dimension(150, 50));

        ButtonClose.setBackground(new java.awt.Color(15, 29, 52));
        ButtonClose.setPreferredSize(new java.awt.Dimension(50, 50));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonCloseLayout = new javax.swing.GroupLayout(ButtonClose);
        ButtonClose.setLayout(ButtonCloseLayout);
        ButtonCloseLayout.setHorizontalGroup(
            ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        ButtonCloseLayout.setVerticalGroup(
            ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ButtonMax.setBackground(new java.awt.Color(15, 29, 52));
        ButtonMax.setPreferredSize(new java.awt.Dimension(50, 50));

        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/full_screen_32px.png"))); // NOI18N
        fullmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullmaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullmaxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonMaxLayout = new javax.swing.GroupLayout(ButtonMax);
        ButtonMax.setLayout(ButtonMaxLayout);
        ButtonMaxLayout.setHorizontalGroup(
            ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fullmax, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        ButtonMaxLayout.setVerticalGroup(
            ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonMaxLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fullmax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout iconminmaxLayout = new javax.swing.GroupLayout(iconminmax);
        iconminmax.setLayout(iconminmaxLayout);
        iconminmaxLayout.setHorizontalGroup(
            iconminmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconminmaxLayout.createSequentialGroup()
                .addContainerGap(620, Short.MAX_VALUE)
                .addComponent(ButtonMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        iconminmaxLayout.setVerticalGroup(
            iconminmaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Header.add(iconminmax, java.awt.BorderLayout.CENTER);

        add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(270, 50));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(0, 0, 0));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidemenu.setBackground(new java.awt.Color(15, 29, 52));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        hidemenu.setBackground(new java.awt.Color(15, 29, 52));
        hidemenu.setPreferredSize(new java.awt.Dimension(50, 50));

        ButtonHideMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonHideMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_32px.png"))); // NOI18N
        ButtonHideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hidemenuLayout = new javax.swing.GroupLayout(hidemenu);
        hidemenu.setLayout(hidemenuLayout);
        hidemenuLayout.setHorizontalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hidemenuLayout.createSequentialGroup()
                    .addComponent(ButtonHideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        hidemenuLayout.setVerticalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ButtonHideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, -1));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        MenuIcon.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, -1));

        jPanel10.setBackground(new java.awt.Color(15, 29, 52));
        jPanel10.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, -1));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(31, 31, 31));
        menuhide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(31, 31, 31));

        btnProfile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProfile.setText("Edit Profile");
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(47, Short.MAX_VALUE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 50));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(31, 31, 31));

        btnPatientStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnPatientStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPatientStatus.setText("Check Patient Status");
        btnPatientStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPatientStatusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnPatientStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatientStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        jPanel5.setBackground(new java.awt.Color(31, 31, 31));

        btnReceiveRequests.setBackground(new java.awt.Color(31, 31, 31));
        btnReceiveRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnReceiveRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnReceiveRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReceiveRequests.setText("Volunteer Receiver Request");
        btnReceiveRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReceiveRequestsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReceiveRequests)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReceiveRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuhide.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        jPanel7.setBackground(new java.awt.Color(31, 31, 31));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuhide.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        add(menu, java.awt.BorderLayout.LINE_START);

        userProcessContainer.setBackground(new java.awt.Color(255, 153, 153));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        // TODO add your handling code here:
        TransplantCentreCoordinatorProfile transplantCentreCoordinatorProfile = new TransplantCentreCoordinatorProfile(userAccount,transplantCentreOrganization,enterprise);
        userProcessContainer.add("TransplantCentreCoordinatorProfile",transplantCentreCoordinatorProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnProfileMouseClicked

    private void btnPatientStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientStatusMouseClicked
        // TODO add your handling code here:
        PatientStatusJPanel panel = new PatientStatusJPanel(system);
        userProcessContainer.add("PatientStatusJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnPatientStatusMouseClicked

    private void btnReceiveRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceiveRequestsMouseClicked
        // TODO add your handling code here:
        
        DonorRequestJPanel panel = new DonorRequestJPanel(system, userAccount, network);
        userProcessContainer.add("DonorRequestJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReceiveRequestsMouseClicked

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fullmaxMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered
        // TODO add your handling code here:
        changecolor(ButtonMax, new Color(0,237,0));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(15,29,52));
    }//GEN-LAST:event_fullmaxMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(204,0,0));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(15,29,52));
    }//GEN-LAST:event_closeMouseExited

    private void ButtonHideMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseClicked
        // TODO add your handling code here:
        
        clickmenu(hidemenu, hidemenu, 1);
        
        // reate void for methods hide and show panel menu
        
        if(a==true){
            hideshow(menu,a, ButtonHideMenu );
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }
        else{
            
            hideshow(menu, a, ButtonHideMenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_ButtonHideMenuMouseClicked

    private void ButtonHideMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHideMenuMouseEntered

    private void ButtonHideMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHideMenuMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonClose;
    private javax.swing.JLabel ButtonHideMenu;
    private javax.swing.JPanel ButtonMax;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel btnPatientStatus;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JLabel btnReceiveRequests;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconminmax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
