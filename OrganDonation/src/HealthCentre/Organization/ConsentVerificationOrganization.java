/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;
import HealthCentre.UserRole.DoctorRole;
import HealthCentre.UserRole.ConsentVerificationRole;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author shrutisrivastava
 */
public class ConsentVerificationOrganization extends Organization {


    public ConsentVerificationOrganization() {
        super(Organization.LegalType.LegalOfficer.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> roles = new ArrayList();
        roles.add(new ConsentVerificationRole());
        return roles;
    }
    
}
