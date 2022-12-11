/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.UserRole;

import javax.swing.JPanel;
import HealthCentre.UserAccount.UserAccount;
import HealthCentre.Organization.Organization;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.UserAccount.UserAccount;
import HealthCentre.Network.Network;
import HealthCentre.EcoSystem;

/**
 *
 * @author fakhr
 */
public abstract class UserRole {
     public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        DonationCoordinator("DonationCoordinator");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
