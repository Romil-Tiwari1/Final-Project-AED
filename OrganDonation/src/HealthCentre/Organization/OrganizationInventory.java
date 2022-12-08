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
//        if (type.getValue().equals(Type.Doctor.getValue())){
//            organization = new DoctorOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.SystemCoordinator.getValue())){
//            organization = new SystemCoordinatorOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Pathologist.getValue())){
//            organization = new PathologistOrganization();
//            organization.setRealName(realName);
//            organizationList.add(organization);
//        }
        return organization;
    }
    
   
}

