/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author fakhr
 */
public class DonorOrganization {
    public DonorOrganization() {
        super(Organization.GovernmentType.Government.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> roles = new ArrayList();
        roles.add(new DonorAdminRole());
        return roles;
    }
}
