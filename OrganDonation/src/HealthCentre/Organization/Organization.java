/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.Organization;
import HealthCentre.OrganType.OrganType;
import java.util.ArrayList;
import HealthCentre.Employee.EmployeeInventory;
import HealthCentre.UserAccount.UserAccountInventory;
import HealthCentre.WorkQueue.WorkQueue;
import HealthCentre.UserRole.UserRole;

/**
 *
 * @author fakhr
 */
public abstract class Organization {
    private int organizationID;
    private String name;
    private String realName;
    private WorkQueue workQueue;
    private EmployeeInventory employeeDirectory;
    private UserAccountInventory userAccountDirectory;
    
    private static int counter=0;
    private OrganType organType;
    //private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    
    public enum Type{
        Admin("Admin Organization"),
        SystemCoordinator("System Coorinator Organization"),
        Doctor("Doctor Organization"), 
        ConsentVerification("Consent Verification Organization "),
        TransplantCentreOrganization("Transplant Centre Organization"),
        LabCoordinator(" LabCoordinator Organization");
  
  

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    

     public enum TransplantCentreOrganizationType {
         
        TransplantCentreOrganization("TransplantCentre Organization Organization");
        private String value;

        private TransplantCentreOrganizationType (String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
   public enum ConsentVerificationType {
         
        ConsentVerification("Consent Verification");
        private String value;

        private ConsentVerificationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum DonationType {
         
        Donation("Donation Coordinator Organization");
        private String value;

        private DonationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        System.out.println("initialise work queue");
        employeeDirectory = new EmployeeInventory();
        userAccountDirectory = new UserAccountInventory();
        organType = new OrganType();
        
          organizationID = counter;  
        
        
        ++counter;
    }
    
    public enum OrganBankType {
         
        OrganBank("Organ Bank Coordinator Organization");
        private String value;

        private OrganBankType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }

    public abstract ArrayList<UserRole> getSupportedRole();
    
    public UserAccountInventory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeInventory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public OrganType getOrganType() {
        return organType;
    }

    public void setOrganType(OrganType organType) {
        this.organType = organType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}

