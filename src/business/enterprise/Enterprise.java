/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.Organization;
import business.organisation.OrganisationDirectory;
import business.roles.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRANJAL
 */
public abstract class Enterprise extends Organization {

    public String enterpriseType;
    private OrganisationDirectory organizationDirectory;
    private int fundsCollected = 0;
    public abstract ArrayList<Role> getSupportedRole();

    public abstract List<Organization> getSupportedType();

    public OrganisationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Hospital("Hospital"),
        NGO("Shelter"),
        FundRaiser("Fund Raiser"),
        Volunteer("Volunteer");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type.getValue();
        organizationDirectory = new OrganisationDirectory();
     }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
     public int getFundsCollected() {
        return fundsCollected;
    }

    public void setFundsCollected(int fundsCollected) {
        this.fundsCollected = this.fundsCollected + fundsCollected;
    }
    
    public void setFundsUsed(int fundsCollected) {
        this.fundsCollected = this.fundsCollected - fundsCollected;
    }
    
    @Override
    public String toString() {
        return this.getOrganizationName();
    }
}
