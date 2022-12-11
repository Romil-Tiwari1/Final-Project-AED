/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.UserRole;
import HealthCentre.EcoSystem;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Network.Network;
import HealthCentre.Organization.ConsentVerificationOrganization;
import HealthCentre.Organization.Organization;
import HealthCentre.UserAccount.UserAccount;

import javax.swing.JPanel;
import UserInterface.ConsentVerificationRole.ConsentVerificationWorkArea;
/**
 *
 * @author shrutisrivastava
 */
public class ConsentVerificationRole extends UserRole{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ConsentVerificationWorkArea(account, (ConsentVerificationOrganization) organization, enterprise, business, network);
    }
}
