/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.WorkQueue;

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.Person.Donor;
import HealthCentre.Person.Patient;
import HealthCentre.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author fakhr
 */
public class WorkRequest {
    
    private String status;
    private String doctorRequestSummary;
    private UserAccount userAccount;
    private String overallStatus;
    private Enterprise enterprise;
    private String type;
    private Patient patient;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Donor organDonor;
    private Date actionDate;
    private String assignement;

    private static int count = 1;
    private static int ct;
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctorRequestSummary() {
        return doctorRequestSummary;
    }

    public void setDoctorRequestSummary(String doctorRequestSummary) {
        this.doctorRequestSummary = doctorRequestSummary;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Donor getOrganDonor() {
        return organDonor;
    }

    public void setOrganDonor(Donor organDonor) {
        this.organDonor = organDonor;
    } 

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getAssignement() {
        return assignement;
    }

    public void setAssignement(String assignement) {
        this.assignement = assignement;
    }
    
    
}
