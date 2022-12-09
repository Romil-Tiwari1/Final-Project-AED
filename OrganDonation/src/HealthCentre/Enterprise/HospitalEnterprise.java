/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCentre.Enterprise;

import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;
/**
 *
 * @author fakhr
 */

public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        return null;
    }
    
}
