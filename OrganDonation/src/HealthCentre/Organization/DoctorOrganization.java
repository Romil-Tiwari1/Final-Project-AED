/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;

import HealthCentre.UserRole.DoctorRole;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class DoctorOrganization extends Organization {
    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> userRoles = new ArrayList();
        userRoles.add(new DoctorRole());
        return userRoles;
    }
}
