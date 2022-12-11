/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCentre.Organization;

import HealthCentre.UserRole.DonationCoordinatorRole;
import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author fakhr
 */
public class DonationOrganization extends Organization{

    public DonationOrganization() {
        super(Organization.DonationType.Donation.getValue());
    }
    
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> roles = new ArrayList();
        roles.add(new DonationCoordinatorRole());
        return roles;
    }
     
}