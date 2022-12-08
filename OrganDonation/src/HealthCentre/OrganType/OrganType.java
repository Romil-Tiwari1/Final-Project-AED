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
 
    
    private static int eye = 30;
    private static int kidney = 25;
    private static int lungs = 65;
    private static int intestine = 35;
    private static int liver = 75;
    private static int tissue = 27;
    private static int heart = 35;
    private static int pancreas = 28;

    public OrganType(String OrganType){
        if(OrganType.equals("eye")){
            eye++;
        }
        else if(OrganType.equals("kidney")){
            kidney++;
        }
        else if(OrganType.equals("lungs")){
            lungs++;
        }
        else if(OrganType.equals("intestine")){
            intestine++;
        }
        else if(OrganType.equals("liver")){
            liver++;
        }
        else if(OrganType.equals("tissue")){
            tissue++;
        }
        else if(OrganType.equals("heart")){
            heart++;
        }
        else if(OrganType.equals("pancreas")){
            pancreas++;
        }
        else{
            System.out.println("Organ Type invalid");
        }
        
    }
    
    
    public static int getEye() {
        return eye;
    }

    public static void setEye(int eye) {
        OrganType.eye = eye;
    }

    public static int getKidney() {
        return kidney;
    }

    public static void setKidney(int kidney) {
        OrganType.kidney = kidney;
    }

    public static int getLungs() {
        return lungs;
    }

    public static void setLungs(int lungs) {
        OrganType.lungs = lungs;
    }

    public static int getIntestine() {
        return intestine;
    }

    public static void setIntestine(int intestine) {
        OrganType.intestine = intestine;
    }

    public static int getLiver() {
        return liver;
    }

    public static void setLiver(int liver) {
        OrganType.liver = liver;
    }

    public static int getTissue() {
        return tissue;
    }

    public static void setTissue(int tissue) {
        OrganType.tissue = tissue;
    }

    public static int getHeart() {
        return heart;
    }

    public static void setHeart(int heart) {
        OrganType.heart = heart;
    }

    public static int getPancreas() {
        return pancreas;
    }

    public static void setPancreas(int pancreas) {
        OrganType.pancreas = pancreas;
    }
    
    
    public void subtractOrganType(String OrganType){
        if(OrganType.equals("eye")){
            eye--;
        }
        else if(OrganType.equals("kidney")){
            kidney--;
        }
        else if(OrganType.equals("lungs")){
            lungs--;
        }
        else if(OrganType.equals("intestine")){
            intestine--;
        }
        else if(OrganType.equals("liver")){
            liver--;
        }
        else if(OrganType.equals("tissue")){
            tissue--;
        }
        else if(OrganType.equals("heart")){
            heart--;
        }
        else if(OrganType.equals("pancreas")){
            pancreas--;
        }
        else{
            System.out.println("Organ Type invalid");
        }
        
    }

    public void addOrganType(String OrganType){
         if(OrganType.equals("eye")){
            eye++;
        }
        else if(OrganType.equals("kidney")){
            kidney++;
        }
        else if(OrganType.equals("lungs")){
            lungs++;
        }
        else if(OrganType.equals("intestine")){
            intestine++;
        }
        else if(OrganType.equals("liver")){
            liver++;
        }
        else if(OrganType.equals("tissue")){
            tissue++;
        }
        else if(OrganType.equals("heart")){
            heart++;
        }
        else if(OrganType.equals("pancreas")){
            pancreas--;
        }
        else{
            System.out.println("Organ Type invalid");
        }
      
    }
    
    
    public OrganType() {
        
    }
}
