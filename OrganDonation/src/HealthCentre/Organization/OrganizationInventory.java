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
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SystemCoordinator.getValue())){
            organization = new SystemCoordinatorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LabCoordinator.getValue())){
            organization = new LabCoordinatorOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
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
   public Organization createConsentVerificationOrganization(Organization.ConsentVerificationType consentType, String realName){
        Organization organization = null;
        if (consentType.getValue().equals(Organization.ConsentVerificationType.ConsentVerification.getValue())){
            organization = new ConsentVerificationOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     public Organization createTransplantCentreOrganization(Organization.TransplantCentreOrganizationType centreType, String realName){
        Organization organization = null;
        if (centreType.getValue().equals(Organization.TransplantCentreOrganizationType.TransplantCentreOrganization.getValue())){
            organization = new TransplantCentreOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
     
     public Organization createOrganBankOrganization(Organization.OrganBankType 
             centreType, String realName){
        Organization organization = null;
        if (centreType.getValue().equals(Organization.OrganBankType.OrganBank.getValue())){
            organization = new OrganBankOrganization();
            organization.setRealName(realName);
            organizationList.add(organization);
        }
        return organization;
    }
    
   
}

