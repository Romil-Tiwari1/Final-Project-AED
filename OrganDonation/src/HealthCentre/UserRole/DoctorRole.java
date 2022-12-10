/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.UserRole;

import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.DoctorOrganization;
import HealthCentre.Organization.Organization;
import HealthCentre.UserAccount.UserAccount;
import UserInterface.DoctorWorkArea.DoctorRoleWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author romiltiwari
 */
public class DoctorRole extends UserRole {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,
            EcoSystem business, Network network) {
        return new DoctorRoleWorkAreaJPanel(account,
                (DoctorOrganization) organization, enterprise, business,
                network);
    }

}
