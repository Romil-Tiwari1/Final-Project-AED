/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;
import HealthCentre.UserRole.TransplantCentreRole;
import HealthCentre.UserRole.TransplantCentreRole;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;
/**
 *
 * @author shrutisrivastava
 */
public class TransplantCentreOrganization extends Organization{
      public TransplantCentreOrganization() {
        super(Organization.TransplantCentreOrganizationType.TransplantCentreOrganization.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> roles = new ArrayList();
        roles.add(new TransplantCentreRole());
        return roles;
    }  
}
