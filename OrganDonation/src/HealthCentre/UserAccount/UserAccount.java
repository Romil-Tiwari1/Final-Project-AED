/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCentre.UserAccount;
import HealthCentre.Employee.Employee;
import HealthCentre.UserRole.UserRole;
import HealthCentre.WorkQueue.WorkQueue;
/**
 *
 * @author fakhr
 */
public class UserAccount {
      private String username;
    private String password;
    private Employee employee;
    private UserRole role;
    private WorkQueue workQueue;
    private String name;
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
}
