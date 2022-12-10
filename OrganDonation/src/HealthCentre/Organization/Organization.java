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
    private OrganType bloodGroup;
    //private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    
    public enum Type{
        Admin("Admin Organization"), 
        
        SystemCoordinator("System Coorinator Organization"),
        Doctor("Doctor Organization"), 
        LabCoordinator(" LabCoordinator Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public enum LabCoordinatorType {
         
        LabCoordinator("LabCoordinator Organization");
        private String value;

        private LabCoordinatorType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum CovidCentreType {
         
        CovidCentre("Covid centre coordinaor Organization");
        private String value;

        private CovidCentreType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    public enum GovernmentType {
         
        Government("Government Coordinator Organization");
        private String value;

        private GovernmentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     }
    
    
     public enum LegalType {
         
        LegalOfficer("Legal Officer Organization");
        private String value;

        private LegalType(String value) {
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
        bloodGroup = new OrganType();
        
          organizationID = counter;  
        
        
        ++counter;
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

    public OrganType getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(OrganType bloodGroup) {
        this.bloodGroup = bloodGroup;
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

