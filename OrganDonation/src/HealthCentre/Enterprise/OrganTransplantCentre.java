/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Enterprise;

import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author shrutisrivastava
 */
public class OrganTransplantCentre extends Enterprise {
public OrganTransplantCentre(String name){
        super(name,EnterpriseType.OrganTransplantCentre);
    }
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        return null;
    }
    
}
