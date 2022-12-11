/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Enterprise;

package Business.Enterprise;

import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;
/**
 *
 * @author shrutisrivastava
 */
public class ConsentVerificationEnterprise extends Enterprise{
public ConsentVerificationEnterprise(String name){
        super(name,EnterpriseType.ConsentVerification);
    }
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        return null;
    }
    
}
