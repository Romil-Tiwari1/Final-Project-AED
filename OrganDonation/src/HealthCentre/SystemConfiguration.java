package HealthCentre;

import HealthCentre.Employee.Employee;
import HealthCentre.UserRole.SystemAdminRole;
import HealthCentre.UserAccount.UserAccount;

/**
 *
 * @author fakhr
 */
public class SystemConfiguration {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
