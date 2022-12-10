/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.UserRole;

import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.Organization;
import HealthCentre.Organization.LabCoordinatorOrganization;
import HealthCentre.UserAccount.UserAccount;

import javax.swing.JPanel;
import UserInterface.LabCoordinatorRole.LabCordinatorWorkArea;
/**
 *
 * @author shrutisrivastava
 */
public class LabCoordinatorRole extends UserRole{

@Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LabCordinatorWorkArea(account, (LabCoordinatorOrganization) organization, enterprise, business, network);
    }
    
}
