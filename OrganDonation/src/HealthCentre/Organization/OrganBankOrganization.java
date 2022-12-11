/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;

import HealthCentre.UserRole.OrganBankCoordinatorRole;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class OrganBankOrganization extends Organization {

    public OrganBankOrganization() {
        super(Organization.OrganBankType.OrganBank.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> userRole = new ArrayList();
        userRole.add(new OrganBankCoordinatorRole());
        return userRole;
    }
    
}
