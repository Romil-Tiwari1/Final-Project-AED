/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Enterprise;

import HealthCentre.UserRole.UserRole;
import java.util.ArrayList;

/**
 *
 * @author romiltiwari
 */
public class OrganBankEnterprise extends Enterprise{

   public OrganBankEnterprise(String name){
        super(name,EnterpriseType.OrganBank);
    }
    @Override
    public ArrayList<UserRole> getSupportedRole() {
        return null;
    }
}
