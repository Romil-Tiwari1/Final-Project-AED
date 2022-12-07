/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.OrganType;

/**
 *
 * @author fakhr
 */
public class OrganType {
 
    
    private static int aPositive = 30;
    private static int aNegative = 25;
    private static int bPositive = 65;
    private static int bNegative = 35;
    private static int oPositive = 75;
    private static int oNegative = 27;
    private static int abPositive = 35;
    private static int abNegative = 28;

    public OrganType(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPositive++;
        }
        else if(bloodGroup.equals("A-")){
            aNegative++;
        }
        else if(bloodGroup.equals("B+")){
            bPositive++;
        }
        else if(bloodGroup.equals("B-")){
            bNegative++;
        }
        else if(bloodGroup.equals("AB+")){
            abPositive++;
        }
        else if(bloodGroup.equals("AB-")){
            abNegative++;
        }
        else if(bloodGroup.equals("O+")){
            oPositive++;
        }
        else if(bloodGroup.equals("O-")){
            oNegative++;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }
    
    
    public static int getaPositive() {
        return aPositive;
    }

    public static void setaPositive(int aPositive) {
        OrganType.aPositive = aPositive;
    }

    public static int getaNegative() {
        return aNegative;
    }

    public static void setaNegative(int aNegative) {
        OrganType.aNegative = aNegative;
    }

    public static int getbPositive() {
        return bPositive;
    }

    public static void setbPositive(int bPositive) {
        OrganType.bPositive = bPositive;
    }

    public static int getbNegative() {
        return bNegative;
    }

    public static void setbNegative(int bNegative) {
        OrganType.bNegative = bNegative;
    }

    public static int getoPositive() {
        return oPositive;
    }

    public static void setoPositive(int oPositive) {
        OrganType.oPositive = oPositive;
    }

    public static int getoNegative() {
        return oNegative;
    }

    public static void setoNegative(int oNegative) {
        OrganType.oNegative = oNegative;
    }

    public static int getAbPositive() {
        return abPositive;
    }

    public static void setAbPositive(int abPositive) {
        OrganType.abPositive = abPositive;
    }

    public static int getAbNegative() {
        return abNegative;
    }

    public static void setAbNegative(int abNegative) {
        OrganType.abNegative = abNegative;
    }
    
    
    public void subtractBloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPositive--;
        }
        else if(bloodGroup.equals("A-")){
            aNegative--;
        }
        else if(bloodGroup.equals("B+")){
            bPositive--;
        }
        else if(bloodGroup.equals("B-")){
            bNegative--;
        }
        else if(bloodGroup.equals("AB+")){
            abPositive--;
        }
        else if(bloodGroup.equals("AB-")){
            abNegative--;
        }
        else if(bloodGroup.equals("O+")){
            oPositive--;
        }
        else if(bloodGroup.equals("O-")){
            oNegative--;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }

    public void addBloodGroup(String bloodGroup){
        if(bloodGroup.equals("A+")){
            aPositive++;
        }
        else if(bloodGroup.equals("A-")){
            aNegative++;
        }
        else if(bloodGroup.equals("B+")){
            bPositive++;
        }
        else if(bloodGroup.equals("B-")){
            bNegative++;
        }
        else if(bloodGroup.equals("AB+")){
            abPositive++;
        }
        else if(bloodGroup.equals("AB-")){
            abNegative++;
        }
        else if(bloodGroup.equals("O+")){
            oPositive++;
        }
        else if(bloodGroup.equals("O-")){
            oNegative++;
        }
        else{
            System.out.println("Blood Group invalid");
        }
        
    }
    
    
    public OrganType() {
        
    }
}
