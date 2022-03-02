/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import business.userAccount.UserAccountDirectory;
import business.employee.EmployeeDirectory;
import business.roles.Role;
import business.workQueue.WorkQueue;

/**
 *
 * @author PRANJAL
 */
public abstract class Organization {
    
    private int organizationId;
    private String organizationName;
    private String organizationType;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private static int count = 0;
    private int shelterOccupancy = 0;
    private String shelterName;
    public enum OrganizationType {
        Receptionist("Receptionist Organization"),
        HAS_Healthcare_Representative("HAS Healthcare Organization"),
        HAS_Shelter_Representative("HAS shelter Organization"),
        NGOOrganization("NGO Organization"),
        Fundrasier("Fundraiser Organization"),
        ChildCare("ChildCare Organization"),
        AdultCare("AdultCare Organization"),
        OldAgeHome("OldAgeHome Organization"),
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        Nurse("Nurse Organization"),
        Pharmacy("Pharmacy");
        

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.organizationName = name;
        this.organizationType = name;
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        organizationId = count;
        count = count + 1;
    }
        public Organization(){
        workQueue = new WorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
        organizationId = count;
        count = count + 1;   
    }

    public abstract ArrayList<Role> getSupportedRole();

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organization.count = count;
    }

    public int getShelterOccupancy() {
        return shelterOccupancy;
    }

    public void setShelterOccupancy(int shelterOccupancy) {
        this.shelterOccupancy = shelterOccupancy - this.shelterOccupancy;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }
    
    public void numberOfSheltersOccupiedCount(int shelterOccupancy) {
        this.shelterOccupancy = this.shelterOccupancy - shelterOccupancy;
    }
    
    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType.getValue();
    }
    
    @Override
    public String toString() {
        return organizationName;
    }
    
}
