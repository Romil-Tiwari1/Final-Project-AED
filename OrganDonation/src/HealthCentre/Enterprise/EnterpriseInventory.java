/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author fakhr
 */
public class EnterpriseInventory {
 private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseInventory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
      if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.ConsentVerification){
            enterprise=new ConsentVerificationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Donation){
            enterprise=new DonationEnterprise(name);
            enterpriseList.add(enterprise);
        }

        else if(type==Enterprise.EnterpriseType.OrganTransplantCentre){
            enterprise=new OrganTransplantCentre(name);
            enterpriseList.add(enterprise);
        }
       
        return enterprise;
    }   
}
