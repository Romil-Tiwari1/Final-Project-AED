/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.UserRole;
import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.TransplantCentreOrganization;
import HealthCentre.Organization.Organization;
import HealthCentre.UserAccount.UserAccount;

import javax.swing.JPanel;
import UserInterface.OrganTransplantCentre.TransplantCentreCoordinatorWorkAreaJPanel;

/**
 *
 * @author shrutisrivastava
 */
public class TransplantCentreRole extends UserRole{
   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new TransplantCentreCoordinatorWorkAreaJPanel(account, (TransplantCentreOrganization) organization, enterprise, business, network);
    } 
}
