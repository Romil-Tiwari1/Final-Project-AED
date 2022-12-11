/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCentre.Organization;

import HealthCentre.UserRole.DoctorRole;
import HealthCentre.UserRole.UserRole;
import HealthCentre.UserRole.SystemCoordinatorRole;
import java.util.ArrayList;

/**
 *
 * @author fakhr
 */
public class SystemCoordinatorOrganization extends Organization{

    public SystemCoordinatorOrganization() {
        super(Organization.Type.SystemCoordinator.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> roles = new ArrayList();
        roles.add(new SystemCoordinatorRole());
        return roles;
    }
     
}