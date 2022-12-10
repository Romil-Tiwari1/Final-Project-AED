/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;

import HealthCentre.UserRole.CareSystemCoordinatorRole;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class CareSystemCoordinatorOrganisation extends Organization{

   public CareSystemCoordinatorOrganisation() {
        super(Organization.Type.SystemCoordinator.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> userRole = new ArrayList();
        userRole.add(new CareSystemCoordinatorRole());
        return userRole;
    }
    
}
