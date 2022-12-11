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
public class DonationEnterprise extends Enterprise {
    
    public DonationEnterprise(String name){
        super(name,EnterpriseType.Donation);
    }
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        return null;
    }
    
}
