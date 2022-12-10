/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCentre.UserRole;

import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.DonationOrganization;
import HealthCentre.Organization.Organization;
import HealthCentre.UserAccount.UserAccount;

import javax.swing.JPanel;
import UserInterface.DonationCoordinator.DonationCoordinatorWorkAreaJPanel;

/**
 *
 * @author fakhr
 */
public class DonationCoordinatorRole extends UserRole {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new DonationCoordinatorWorkAreaJPanel(account, (DonationOrganization) organization, enterprise, business, network);
    }
    
}
