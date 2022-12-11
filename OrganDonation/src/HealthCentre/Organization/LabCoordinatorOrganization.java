/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;

import java.util.ArrayList;
import HealthCentre.UserRole.DoctorRole;
import HealthCentre.UserRole.LabCoordinatorRole;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 
 * @author shrutisrivastava
 */
public class LabCoordinatorOrganization extends Organization {
  public LabCoordinatorOrganization() {
        super(Organization.Type.LabCoordinator.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> roles = new ArrayList();
        roles.add(new LabCoordinatorRole());
        return roles;
    }
    
}
