/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DonationCoordinator;

/**
 *
 * @author fakhr
 */

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.DonationOrganization;
import HealthCentre.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;


public class DonationCoordinatorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationCoordinatorWorkAreaJPanel
     */
    
    private UserAccount userAccount;
    private DonationOrganization donorganization;
    boolean a = true;
    DonationOrganization doctorOrganization;
    private Enterprise enterprise;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public DonationCoordinatorWorkAreaJPanel(UserAccount account, DonationOrganization donorganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.donorganization = donorganization;
        this.enterprise = enterprise;
        this.system = business;
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
        jPanel6 = new javax.swing.JPanel();
        ButtonClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        ButtonMax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        ButtonHideMenu = new javax.swing.JLabel();
        menuhide = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        BtnCuredPatients = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        BtnSelfProfile = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        BtnCreateDonor = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        BtnDonorStatus = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        BtnDonorRequests = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 50));

        ButtonClose.setBackground(new java.awt.Color(15, 29, 52));
        ButtonClose.setPreferredSize(new java.awt.Dimension(50, 50));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_32px.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        ButtonCloseLayout.setVerticalGroup(
            ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(fullmax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(646, Short.MAX_VALUE)
                .addComponent(ButtonMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Header.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setPreferredSize(new java.awt.Dimension(270, 500));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(0, 0, 0));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 500));
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
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        hidemenu.setBackground(new java.awt.Color(15, 29, 52));
        hidemenu.setMaximumSize(new java.awt.Dimension(50, 50));
        hidemenu.setMinimumSize(new java.awt.Dimension(50, 50));
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
            .addGap(0, 50, Short.MAX_VALUE)
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

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(31, 31, 31));
        menuhide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(31, 31, 31));

        BtnCuredPatients.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCuredPatients.setForeground(new java.awt.Color(255, 255, 255));
        BtnCuredPatients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCuredPatients.setText("Encourage Cured Patients");
        BtnCuredPatients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCuredPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCuredPatientsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnCuredPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnCuredPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 50));

        jPanel11.setBackground(new java.awt.Color(31, 31, 31));

        BtnSelfProfile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSelfProfile.setForeground(new java.awt.Color(255, 255, 255));
        BtnSelfProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnSelfProfile.setText("Edit Self Profile");
        BtnSelfProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSelfProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSelfProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnSelfProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnSelfProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, -1));

        jPanel12.setBackground(new java.awt.Color(31, 31, 31));

        BtnCreateDonor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnCreateDonor.setForeground(new java.awt.Color(255, 255, 255));
        BtnCreateDonor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCreateDonor.setText("Create Donor");
        BtnCreateDonor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCreateDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCreateDonorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnCreateDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnCreateDonor, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        jPanel13.setBackground(new java.awt.Color(31, 31, 31));

        BtnDonorStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDonorStatus.setForeground(new java.awt.Color(255, 255, 255));
        BtnDonorStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDonorStatus.setText("Check Donor Status");
        BtnDonorStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDonorStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDonorStatusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnDonorStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnDonorStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, -1));

        jPanel14.setBackground(new java.awt.Color(31, 31, 31));

        BtnDonorRequests.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDonorRequests.setForeground(new java.awt.Color(255, 255, 255));
        BtnDonorRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnDonorRequests.setText("Volunteer Donor Requests");
        BtnDonorRequests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDonorRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDonorRequestsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDonorRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDonorRequests, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuhide.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, -1));

        jPanel15.setBackground(new java.awt.Color(31, 31, 31));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_32px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuhide.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 220, -1));

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        add(menu, java.awt.BorderLayout.LINE_START);

        userProcessContainer.setBackground(new java.awt.Color(255, 153, 153));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

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

    private void BtnCuredPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCuredPatientsMouseClicked
        // TODO add your handling code here:
        
        InspireCuredPatientsJPanel Profile = new InspireCuredPatientsJPanel();
        userProcessContainer.add("CheckOldPatientsJPanel", Profile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnCuredPatientsMouseClicked

    private void BtnSelfProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSelfProfileMouseClicked
        // TODO add your handling code here:
//        ManageDonationCoordinatorProfile manageDonCoordinatorProfile = new ManageDonationCoordinatorProfile(userAccount,donorganization,enterprise);
//        userProcessContainer.add("ManageDonCoordinatorProfile",manageDonCoordinatorProfile);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnSelfProfileMouseClicked

    private void BtnCreateDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCreateDonorMouseClicked
//        // TODO add your handling code here:
//        CreateDonorJPanel Profile = null;
//        try {
//            Profile = new CreateDonorJPanel(system);
//        } catch (GeneralSecurityException ex) {
//            Logger.getLogger(DonationCoordinatorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(DonationCoordinatorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        userProcessContainer.add("CreateDonorJPanel", Profile);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnCreateDonorMouseClicked

    private void BtnDonorStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDonorStatusMouseClicked
        // TODO add your handling code here:
        
//        DonorStatusJPanel Profile = new DonorStatusJPanel(system);
//        userProcessContainer.add("DonorStatusJPanel", Profile);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnDonorStatusMouseClicked

    private void BtnDonorRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDonorRequestsMouseClicked
        // TODO add your handling code here:
//        
//        VolunteerDonorRequestJPanel Profile = new VolunteerDonorRequestJPanel(system);
//        userProcessContainer.add("VolunteerDonorRequestJPanel", Profile);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnDonorRequestsMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCreateDonor;
    private javax.swing.JLabel BtnCuredPatients;
    private javax.swing.JLabel BtnDonorRequests;
    private javax.swing.JLabel BtnDonorStatus;
    private javax.swing.JLabel BtnSelfProfile;
    private javax.swing.JPanel ButtonClose;
    private javax.swing.JLabel ButtonHideMenu;
    private javax.swing.JPanel ButtonMax;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
