/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Network;
import HealthCentre.Enterprise.EnterpriseInventory;

/**
 *
 * @author fakhr
 */
public class Network {
     private String name;
    private String state;
    private String country;
    
    
    
    private EnterpriseInventory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseInventory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseInventory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
    
    @Override
    public String toString(){
        return name;
    }
    
}
