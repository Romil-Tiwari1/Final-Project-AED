/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.WorkQueue;

import HealthCentre.DB4OUtil.DB4OUtil;
import HealthCentre.Enterprise.Enterprise;
import HealthCentre.UserAccount.UserAccount;
import HealthCentre.Person.Patient;
import java.util.Date;

/**
 *
 * @author fakhr
 */
public class WorkRequest {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    private Date actionDate;
    private String summary;
    private String notes;
    private String requestNumber;
    private String assigned;
    private UserAccount pathologist;
    private UserAccount userAccount;
    private String overallStatus;
    private Enterprise enterprise;
    private String type;
    private Patient patient;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
