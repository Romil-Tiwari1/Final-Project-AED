/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthCentre.Person;

import java.util.Date;

/**
 *
 * @author fakhr
 */
public class DonorRequest {

    // Donor Attributes
    private String donorID;
    private String name;
    private Date dob;
    private int age;
    private String gender;
    private String organType;
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String contact;
    private String emailID;
    private String status;
    private boolean inheritedDisease;
    private boolean substanceAbuse;
    private boolean drugAddict;
    private boolean accidentHistory;
    private String imagePath;
    private byte[] dP;

    public byte[] getdP() {
        return dP;
    }

    public void setdP(byte[] dP) {
        this.dP = dP;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

// Getter Setter Functions
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDonorID() {
        return donorID;
    }

    public void setDonorID(String donorID) {
        this.donorID = donorID;
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

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public boolean isInheritedDisease() {
        return inheritedDisease;
    }

    public void setInheritedDisease(boolean inheritedDisease) {
        this.inheritedDisease = inheritedDisease;
    }

    public boolean isSubstanceAbuse() {
        return substanceAbuse;
    }

    public void setSubstanceAbuse(boolean substanceAbuse) {
        this.substanceAbuse = substanceAbuse;
    }

    public boolean isDrugAddict() {
        return drugAddict;
    }

    public void setDrugAddict(boolean drugAddict) {
        this.drugAddict = drugAddict;
    }

    public boolean isAccidentHistory() {
        return accidentHistory;
    }

    public void setAccidentHistory(boolean accidentHistory) {
        this.accidentHistory = accidentHistory;
    }

    @Override
    public String toString() {
        return donorID;
    }

}
