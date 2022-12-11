/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre;

import java.util.ArrayList;
import HealthCentre.Organization.OrganizationInventory;
import HealthCentre.Organization.Organization;
import HealthCentre.Network.Network;
import HealthCentre.Organization.Organization;

import HealthCentre.Person.DonorRequestDirectory;

import HealthCentre.Person.DonorDirectory;
import HealthCentre.Person.PatientRequestDirectory;
import HealthCentre.Person.PatientDirectory;
import HealthCentre.UserAccount.UserAccountInventory;


import HealthCentre.UserRole.SystemAdminRole;
import HealthCentre.UserRole.UserRole;

/**
 *
 * @author fakhr
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    
private PatientDirectory patientDirectory;

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    private  UserAccountInventory userAccountDirectory;

    private DonorRequestDirectory donorRequestDirectory;

    private DonorDirectory donorDirectory;
private PatientRequestDirectory patientRequestDirectory;

    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public PatientRequestDirectory getPatientRequestDirectory() {
        return patientRequestDirectory;
    }

    public void setPatientRequestDirectory(PatientRequestDirectory patientRequestDirectory) {
        this.patientRequestDirectory = patientRequestDirectory;
    }


    public UserAccountInventory getUserAccountDirectory() {return userAccountDirectory; }
    public void setUserAccountDirectory(UserAccountInventory userAccountDirectory) { this.userAccountDirectory = userAccountDirectory;  }
    public DonorRequestDirectory getDonorRequestDirectory() {   return donorRequestDirectory;    }
    public void setDonorRequestDirectory(DonorRequestDirectory donorRequestDirectory) {        this.donorRequestDirectory = donorRequestDirectory;    }

    
    public DonorDirectory getOrganDonorDirectory() {return donorDirectory;}
    public void setOrganDonorDirectory(DonorDirectory donorDirectory) {this.donorDirectory = donorDirectory;}
    
    
    private ArrayList<Network> networkList;
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        ArrayList<UserRole> roleList=new ArrayList<UserRole>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        System.out.println("I m in constructor");
        networkList=new ArrayList<Network>();
        this.userAccountDirectory  = new UserAccountInventory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
