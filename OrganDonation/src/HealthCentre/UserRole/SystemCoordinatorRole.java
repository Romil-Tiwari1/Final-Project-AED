/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCentre.UserRole;

import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.Organization;
import HealthCentre.Organization.SystemCoordinatorOrganization;
import HealthCentre.UserAccount.UserAccount;

import javax.swing.JPanel;
import UserInterface.SystemCoordinatorRole.SystemCoordinatorWorkAreaJPanel;

/**
 *
 * @author fakhr
 */
public class SystemCoordinatorRole extends UserRole {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SystemCoordinatorWorkAreaJPanel(account, (SystemCoordinatorOrganization)organization, enterprise, business, network);
    }
    
}
