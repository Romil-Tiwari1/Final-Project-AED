/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DoctorWorkArea;

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.DoctorOrganization;
import HealthCentre.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;

/**
 *
 * @author romiltiwari
 */
public class DoctorRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates Doctor Role Work-Area JPanel with form
     */
    private UserAccount userAccount;
    boolean index = true;
    DoctorOrganization doctorOrganization;
    Enterprise enterprise;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public DoctorRoleWorkAreaJPanel(UserAccount account, DoctorOrganization 
            doctorOrganization, Enterprise enterprise, EcoSystem system, 
            Network network) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.doctorOrganization = doctorOrganization;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
 
    /**
     * Definition : Function to change color of background
     * @param hover
     * @param rand
     */
    public void changeColorProperty(JPanel hoverMenuPanel, Color random){
        hoverMenuPanel.setBackground(random);    
    }
    
    /**
     * Definition : Function to handle hide menu click
     * @param hideMenu1
     * @param hideMenu2
     * @param booleanNumber 
     */
    public void hideMenuClickHandling(JPanel hideMenu1, JPanel hideMenu2, int booleanNumber){
        if(booleanNumber == 1){
            hideMenu1.setBackground(new Color(70,55,37));
            hideMenu2.setBackground(new Color(216,99,1));        
        } else{
            hideMenu1.setBackground(new Color(216,99,1));
            hideMenu2.setBackground(new Color(70,55,37));   
        }  
    }
    
    /**
     * Definition : Handle Image Changes as per respective button clicks
     * @param button
     * @param resourcecheimg 
     */
    public void imageChangeHandling(JLabel button, String imageResource){
        ImageIcon iconImage = new ImageIcon(getClass().getResource(imageResource));
        button.setIcon(iconImage);
    }
    
    /**
     * Definition : Hide Menu Handling for Dashboard
     * @param menushowhide
     * @param dashboard
     * @param button 
     */
    public void hideMenu(JPanel menuVar, boolean dashBoard, JLabel button){
        if(dashBoard == true){
            menuVar.setPreferredSize(new Dimension(50, menuVar.getHeight()));
            imageChangeHandling(button, "/Images/menu_32px.png");
        } else{
            menuVar.setPreferredSize(new Dimension(270, menuVar.getHeight()));
            imageChangeHandling(button, "/Images/menu_32px.png");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainHeader = new javax.swing.JPanel();
        subHeader = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        btnMaximize = new javax.swing.JPanel();
        fullMaximum = new javax.swing.JLabel();
        mainMenu = new javax.swing.JPanel();
        menuIconPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        hideMenuButton = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        hideMenuPanel = new javax.swing.JPanel();
        doctorProfilePanel = new javax.swing.JPanel();
        manageDoctorProfileLabel = new javax.swing.JLabel();
        manageDoctorPanel = new javax.swing.JPanel();
        manageDoctorJPanelLabel = new javax.swing.JLabel();
        backPanel = new javax.swing.JPanel();
        backArrowLabel = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        mainHeader.setBackground(new java.awt.Color(15, 29, 52));
        mainHeader.setPreferredSize(new java.awt.Dimension(800, 50));
        mainHeader.setLayout(new java.awt.BorderLayout());

        subHeader.setBackground(new java.awt.Color(15, 29, 52));
        subHeader.setLayout(new java.awt.BorderLayout());

        btnClose.setBackground(new java.awt.Color(0, 0, 0));
        btnClose.setPreferredSize(new java.awt.Dimension(50, 50));

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

        btnMaximize.setBackground(new java.awt.Color(15, 29, 52));
        btnMaximize.setPreferredSize(new java.awt.Dimension(50, 50));

        fullMaximum.setBackground(new java.awt.Color(0, 0, 0));
        fullMaximum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullMaximum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/full_screen_32px.png"))); // NOI18N
        fullMaximum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullMaximumMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullMaximumMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullMaximumMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnMaximizeLayout = new javax.swing.GroupLayout(btnMaximize);
        btnMaximize.setLayout(btnMaximizeLayout);
        btnMaximizeLayout.setHorizontalGroup(
            btnMaximizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(btnMaximizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMaximizeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fullMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnMaximizeLayout.setVerticalGroup(
            btnMaximizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnMaximizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnMaximizeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fullMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCloseLayout.createSequentialGroup()
                .addGap(0, 955, Short.MAX_VALUE)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        subHeader.add(btnClose, java.awt.BorderLayout.PAGE_START);

        mainHeader.add(subHeader, java.awt.BorderLayout.CENTER);

        add(mainHeader, java.awt.BorderLayout.PAGE_START);

        mainMenu.setLayout(new java.awt.BorderLayout());

        menuIconPanel.setBackground(new java.awt.Color(0, 0, 0));
        menuIconPanel.setPreferredSize(new java.awt.Dimension(50, 500));
        menuIconPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(15, 29, 52));
        jPanel4.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIconPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        hidemenu.setBackground(new java.awt.Color(15, 29, 52));
        hidemenu.setPreferredSize(new java.awt.Dimension(50, 50));

        hideMenuButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hideMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_32px.png"))); // NOI18N
        hideMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMenuButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hideMenuButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hideMenuButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout hidemenuLayout = new javax.swing.GroupLayout(hidemenu);
        hidemenu.setLayout(hidemenuLayout);
        hidemenuLayout.setHorizontalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hidemenuLayout.createSequentialGroup()
                    .addComponent(hideMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        hidemenuLayout.setVerticalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(hideMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        menuIconPanel.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        menuIconPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, -1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        menuIconPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 10));

        mainMenu.add(menuIconPanel, java.awt.BorderLayout.LINE_START);

        hideMenuPanel.setBackground(new java.awt.Color(31, 31, 31));
        hideMenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorProfilePanel.setBackground(new java.awt.Color(31, 31, 31));

        manageDoctorProfileLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        manageDoctorProfileLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageDoctorProfileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageDoctorProfileLabel.setText("Doctor Profile");
        manageDoctorProfileLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageDoctorProfileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageDoctorProfileLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout doctorProfilePanelLayout = new javax.swing.GroupLayout(doctorProfilePanel);
        doctorProfilePanel.setLayout(doctorProfilePanelLayout);
        doctorProfilePanelLayout.setHorizontalGroup(
            doctorProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(doctorProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, doctorProfilePanelLayout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(manageDoctorProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        doctorProfilePanelLayout.setVerticalGroup(
            doctorProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(doctorProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(doctorProfilePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(manageDoctorProfileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        hideMenuPanel.add(doctorProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 220, 60));

        manageDoctorPanel.setBackground(new java.awt.Color(31, 31, 31));

        manageDoctorJPanelLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        manageDoctorJPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        manageDoctorJPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageDoctorJPanelLabel.setText("Manage Doctor Request");
        manageDoctorJPanelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageDoctorJPanelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageDoctorJPanelLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout manageDoctorPanelLayout = new javax.swing.GroupLayout(manageDoctorPanel);
        manageDoctorPanel.setLayout(manageDoctorPanelLayout);
        manageDoctorPanelLayout.setHorizontalGroup(
            manageDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(manageDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageDoctorPanelLayout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(manageDoctorJPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        manageDoctorPanelLayout.setVerticalGroup(
            manageDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(manageDoctorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(manageDoctorJPanelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        hideMenuPanel.add(manageDoctorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        backPanel.setBackground(new java.awt.Color(31, 31, 31));

        backArrowLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backArrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backArrowLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backArrowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backArrowLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(backArrowLabel)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(backArrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        hideMenuPanel.add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        mainMenu.add(hideMenuPanel, java.awt.BorderLayout.CENTER);

        add(mainMenu, java.awt.BorderLayout.LINE_START);

        userProcessContainer.setBackground(new java.awt.Color(199, 247, 247));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        changeColorProperty(btnClose, new Color(204,0,0));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        changeColorProperty(btnClose, new Color(15,29,52));
    }//GEN-LAST:event_closeMouseExited

    private void fullMaximumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullMaximumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fullMaximumMouseClicked

    private void fullMaximumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullMaximumMouseEntered
        // TODO add your handling code here:
        changeColorProperty(btnMaximize, new Color(0,237,0));
    }//GEN-LAST:event_fullMaximumMouseEntered

    private void fullMaximumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullMaximumMouseExited
        // TODO add your handling code here:
        changeColorProperty(btnClose, new Color(15,29,52));
    }//GEN-LAST:event_fullMaximumMouseExited

    private void hideMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMenuButtonMouseClicked
        hideMenuClickHandling(hidemenu, hidemenu, 1);
        if(index == true){
            hideMenu(mainMenu,index, hideMenuButton );
            SwingUtilities.updateComponentTreeUI(this);
            index = false;
        } else{
            hideMenu(mainMenu, index, hideMenuButton);
            SwingUtilities.updateComponentTreeUI(this);
            index = true;
        }
    }//GEN-LAST:event_hideMenuButtonMouseClicked

    private void hideMenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMenuButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_hideMenuButtonMouseEntered

    private void hideMenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMenuButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_hideMenuButtonMouseExited

    private void manageDoctorProfileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDoctorProfileLabelMouseClicked
        // TODO add your handling code here:
        ManageDoctorProfileJPanel manageDoctorProfileJPanel = new ManageDoctorProfileJPanel(userAccount,doctorOrganization,enterprise);
        userProcessContainer.add("ManageDoctorProfileJPanel",manageDoctorProfileJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDoctorProfileLabelMouseClicked

    private void manageDoctorJPanelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDoctorJPanelLabelMouseClicked
        // TODO add your handling code here:
        ManageDoctorJPanel manageDoctorJPanel = new ManageDoctorJPanel(system, userAccount, doctorOrganization, enterprise);
        userProcessContainer.add("ManageDoctorJPanel",manageDoctorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDoctorJPanelLabelMouseClicked

    private void backArrowLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowLabelMouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_backArrowLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backArrowLabel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnMaximize;
    private javax.swing.JLabel close;
    private javax.swing.JPanel doctorProfilePanel;
    private javax.swing.JLabel fullMaximum;
    private javax.swing.JLabel hideMenuButton;
    private javax.swing.JPanel hideMenuPanel;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JLabel manageDoctorJPanelLabel;
    private javax.swing.JPanel manageDoctorPanel;
    private javax.swing.JLabel manageDoctorProfileLabel;
    private javax.swing.JPanel menuIconPanel;
    private javax.swing.JPanel subHeader;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
