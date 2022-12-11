/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;

import HealthCentre.Organization.Organization.Type;
import java.util.ArrayList;


/**
 *
 * @author fakhr
 */
public class OrganizationInventory {
     
    
    private ArrayList<Organization> organizationList;

    public OrganizationInventory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String realName){
        Organization organization = null;

        return organization;
    }
 
     
      public Organization createDonationOrganization(Organization.DonationType donType, String realName){
        Organization organization = null;
        if (donType.getValue().equals(Organization.DonationType.Donation.getValue())){
            organization = new DonationOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
   
}

