/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCentre.Person;

import java.util.Date;

/**
 *
 * @author shrutisrivastava
 */
public class Patient {
    
// Patient Attribute  
    private String patientID;
    private String name;
    private String city;
    private String state;
    private int zipCode;
    private int contact;
    private String emailID;
    private String status;
    private boolean labReport;
    private boolean concentApproval;
    private boolean emergencyStatus;
    private String imagePath;
    private byte[] dP;
    private Date dob;
    private int age;
    private String gender;
    private String bloodGroup;
    private String streetAddress;
    private String organType;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isLabReport() {
        return labReport;
    }

    public void setLabReport(boolean labReport) {
        this.labReport = labReport;
    }

    public boolean isConcentApproval() {
        return concentApproval;
    }

    public void setConcentApproval(boolean concentApproval) {
        this.concentApproval = concentApproval;
    }

    public boolean isEmergencyStatus() {
        return emergencyStatus;
    }

    public void setEmergencyStatus(boolean emergencyStatus) {
        this.emergencyStatus = emergencyStatus;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType;
    }



    


    
    
    
    @Override
    public String toString() {
        return patientID;
    }
    
 }
