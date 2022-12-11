/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.UserRole;

import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.OrganBankOrganization;
import HealthCentre.Organization.Organization;
import HealthCentre.UserAccount.UserAccount;
import UserInterface.OrganBankCoordinatorRole.OrganBankCoordinatorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author romiltiwari
 */
public class OrganBankCoordinatorRole extends UserRole {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization, Enterprise 
                    enterprise, EcoSystem ecoSystem, Network network) {
        return new OrganBankCoordinatorWorkAreaJPanel(account,
                (OrganBankOrganization) organization, enterprise,
                ecoSystem, network);
    }
}
