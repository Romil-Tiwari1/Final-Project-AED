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
    private String doctorRequestSummary;
    private String notes;
    private String requestNumber;
    private String assignement;
    private UserAccount labCoordinator;
    private UserAccount userAccount;
    private String overallStatus;
    private Donor organDonor;
    private Enterprise enterprise;
    private String type;
    private Patient patient;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();


    private static int count = 1;
    private static int ct;

  public WorkRequest(){
        
        System.out.println(dB4OUtil.retrieveSystem().getWorkQueue().getWorkRequestList().size()+"count");
        requestNumber = "REQ00000"+ String.valueOf(count);
        count++;
        
        requestDate = new Date();
    }

    public String getAssignement() {
        return assignement;
    }

    public void setAssignement(String assignement) {
        this.assignement = assignement;
    }

    public Donor getOrganDonor() {
        return organDonor;
    }

    public void setOrganDonor(Donor organDonor) {
        this.organDonor = organDonor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getDoctorRequestSummary() {
        return doctorRequestSummary;
    }

    public void setDoctorRequestSummary(String doctorRequestSummary) {
        this.doctorRequestSummary = doctorRequestSummary;
    }



    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

  
    public UserAccount getLabCoordinator() {
        return labCoordinator;
    }

    public void setLabCoordinator(UserAccount labCoordinator) {
        this.labCoordinator = labCoordinator;
    }



    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }



    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public DB4OUtil getdB4OUtil() {
        return dB4OUtil;
    }

    public void setdB4OUtil(DB4OUtil dB4OUtil) {
        this.dB4OUtil = dB4OUtil;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        WorkRequest.count = count;
    }

    public static int getCt() {
        return ct;
    }

    public static void setCt(int ct) {
        WorkRequest.ct = ct;
    }

@Override
    public String toString() {
        return requestNumber.toString() ;
    }
   
}
